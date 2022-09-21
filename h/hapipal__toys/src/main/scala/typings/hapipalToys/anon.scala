package typings.hapipalToys

import typings.hapiHapi.mod.HandlerDecorations
import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseToolkit
import typings.hapiHapi.mod.RouteOptions
import typings.hapiHapi.mod.Server_
import typings.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@hapi/hapi.@hapi/hapi.ServerRoute> */
  trait PartialServerRoute extends StObject {
    
    var handler: js.UndefOr[Method | HandlerDecorations] = js.undefined
    
    var method: js.UndefOr[HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String] = js.undefined
    
    var options: js.UndefOr[RouteOptions | (js.Function1[/* server */ Server_, RouteOptions])] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Object] = js.undefined
    
    var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PartialServerRoute {
    
    inline def apply(): PartialServerRoute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerRoute]
    }
    
    extension [Self <: PartialServerRoute](x: Self) {
      
      inline def setHandler(value: Method | HandlerDecorations): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerFunction3(
        value: (/* request */ Request, /* h */ ResponseToolkit, /* err */ js.UndefOr[js.Error]) => ReturnValue
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: (HTTP_METHODS_PARTIAL | String)*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOptions(value: RouteOptions | (js.Function1[/* server */ Server_, RouteOptions])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: /* server */ Server_ => RouteOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRules(value: js.Object): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
    }
  }
}
