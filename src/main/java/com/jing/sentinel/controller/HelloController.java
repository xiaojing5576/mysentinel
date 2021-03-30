package com.jing.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huangjingyan-200681
 * @Date: 2021/3/30 13:48
 * @Mail: huangjingyan@eastmoney.com
 * @Description: TODO
 * @Version: 1.0
 **/

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }


}
