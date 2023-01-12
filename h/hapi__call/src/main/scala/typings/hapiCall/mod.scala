package typings.hapiCall

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/call", "Router")
  @js.native
  open class Router[Handler] () extends StObject {
    def this(routerOptions: RouterOptions) = this()
    
    def add(definition: RouteDefinition): Unit = js.native
    def add(definition: RouteDefinition, route: Handler): Unit = js.native
    
    def route(method: String, path: String): Route[Handler] = js.native
  }
  
  trait Match[Handler] extends StObject {
    
    var params: Partial[Record[String, String]]
    
    var paramsArray: js.Array[String]
    
    var route: Handler
  }
  object Match {
    
    inline def apply[Handler](params: Partial[Record[String, String]], paramsArray: js.Array[String], route: Handler): Match[Handler] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], paramsArray = paramsArray.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match[Handler]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match[?], Handler] (val x: Self & Match[Handler]) extends AnyVal {
      
      inline def setParams(value: Partial[Record[String, String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsArray(value: js.Array[String]): Self = StObject.set(x, "paramsArray", value.asInstanceOf[js.Any])
      
      inline def setParamsArrayVarargs(value: String*): Self = StObject.set(x, "paramsArray", js.Array(value*))
      
      inline def setRoute(value: Handler): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type Route[Handler] = Match[Handler] | js.Error
  
  trait RouteDefinition extends StObject {
    
    /**
      * Generally this is an HTTP method or "*" to mean any.
      * This field is case insensitive.
      *
      * - "get"
      * - "head"
      * - "post"
      * - "put"
      * - "delete"
      * - "connect"
      * - "options"
      * - "trace"
      * - "patch"
      */
    var method: String
    
    var path: String
  }
  object RouteDefinition {
    
    inline def apply(method: String, path: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteDefinition] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "isCaseSensitive", value.asInstanceOf[js.Any])
    }
  }
}
