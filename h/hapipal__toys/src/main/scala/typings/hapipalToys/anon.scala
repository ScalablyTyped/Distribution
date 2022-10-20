package typings.hapipalToys

import typings.hapiHapi.mod.HandlerDecorations
import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.RouteOptions
import typings.hapiHapi.mod.RouteRules
import typings.hapiHapi.mod.Server_
import typings.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@hapi/hapi.@hapi/hapi.ServerRoute<@hapi/hapi.@hapi/hapi.ReqRefDefaults>> */
  trait PartialServerRouteReqRefD extends StObject {
    
    var handler: js.UndefOr[(Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | HandlerDecorations] = js.undefined
    
    var method: js.UndefOr[HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String] = js.undefined
    
    var options: js.UndefOr[
        RouteOptions[ReqRefDefaults] | (js.Function1[/* server */ Server_, RouteOptions[ReqRefDefaults]])
      ] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[RouteRules] = js.undefined
    
    var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PartialServerRouteReqRefD {
    
    inline def apply(): PartialServerRouteReqRefD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerRouteReqRefD]
    }
    
    extension [Self <: PartialServerRouteReqRefD](x: Self) {
      
      inline def setHandler(value: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | HandlerDecorations): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setMethod(value: HTTP_METHODS_PARTIAL | (js.Array[HTTP_METHODS_PARTIAL | String]) | String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMethodVarargs(value: (HTTP_METHODS_PARTIAL | String)*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOptions(
        value: RouteOptions[ReqRefDefaults] | (js.Function1[/* server */ Server_, RouteOptions[ReqRefDefaults]])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: /* server */ Server_ => RouteOptions[ReqRefDefaults]): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRules(value: RouteRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
      
      inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
      
      inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
    }
  }
}
