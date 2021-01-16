package pl.zarembapawel.CostsCounter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CostsController {

    @GetMapping("/test")
    public String test() {
        return "Hello world";
    }
    
}
