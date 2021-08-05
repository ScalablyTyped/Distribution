package typings.hapiCall

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/call", "Router")
  @js.native
  class Router () extends StObject {
    def this(routerOptions: RouterOptions) = this()
    
    def add(definition: RouteDefinition): Unit = js.native
    def add(definition: RouteDefinition, data: js.Any): Unit = js.native
    
    def route(method: String, path: String): Route[js.Any, js.Any] = js.native
  }
  
  trait Match[P, D] extends StObject {
    
    var params: P
    
    var paramsArray: js.Array[String]
    
    var route: D
  }
  object Match {
    
    inline def apply[P, D](params: P, paramsArray: js.Array[String], route: D): Match[P, D] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], paramsArray = paramsArray.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match[P, D]]
    }
    
    extension [Self <: Match[?, ?], P, D](x: Self & (Match[P, D])) {
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsArray(value: js.Array[String]): Self = StObject.set(x, "paramsArray", value.asInstanceOf[js.Any])
      
      inline def setParamsArrayVarargs(value: String*): Self = StObject.set(x, "paramsArray", js.Array(value :_*))
      
      inline def setRoute(value: D): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type Route[P, D] = (Match[P, D]) | Error
  
  trait RouteDefinition extends StObject {
    
    var method: String
    
    var path: String
  }
  object RouteDefinition {
    
    inline def apply(method: String, path: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    extension [Self <: RouteDefinition](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouterOptions extends StObject {
    
    var isCaseSensitive: Boolean
  }
  object RouterOptions {
    
    inline def apply(isCaseSensitive: Boolean): RouterOptions = {
      val __obj = js.Dynamic.literal(isCaseSensitive = isCaseSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterOptions]
    }
    
    extension [Self <: RouterOptions](x: Self) {
      
      inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    }
  }
}
