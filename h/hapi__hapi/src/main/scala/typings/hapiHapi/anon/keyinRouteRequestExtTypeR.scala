package typings.hapiHapi.anon

import typings.hapiHapi.mod.RouteExtObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>} */
trait keyinRouteRequestExtTypeR extends StObject {
  
  var onCredentials: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  
  var onPostAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  
  var onPostHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  
  var onPreAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  
  var onPreHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
  
  var onPreResponse: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.undefined
}
object keyinRouteRequestExtTypeR {
  
  inline def apply(): keyinRouteRequestExtTypeR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinRouteRequestExtTypeR]
  }
  
  extension [Self <: keyinRouteRequestExtTypeR](x: Self) {
    
    inline def setOnCredentials(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onCredentials", value.asInstanceOf[js.Any])
    
    inline def setOnCredentialsUndefined: Self = StObject.set(x, "onCredentials", js.undefined)
    
    inline def setOnCredentialsVarargs(value: RouteExtObject*): Self = StObject.set(x, "onCredentials", js.Array(value :_*))
    
    inline def setOnPostAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPostAuth", value.asInstanceOf[js.Any])
    
    inline def setOnPostAuthUndefined: Self = StObject.set(x, "onPostAuth", js.undefined)
    
    inline def setOnPostAuthVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPostAuth", js.Array(value :_*))
    
    inline def setOnPostHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    
    inline def setOnPostHandlerUndefined: Self = StObject.set(x, "onPostHandler", js.undefined)
    
    inline def setOnPostHandlerVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPostHandler", js.Array(value :_*))
    
    inline def setOnPreAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreAuth", value.asInstanceOf[js.Any])
    
    inline def setOnPreAuthUndefined: Self = StObject.set(x, "onPreAuth", js.undefined)
    
    inline def setOnPreAuthVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreAuth", js.Array(value :_*))
    
    inline def setOnPreHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreHandler", value.asInstanceOf[js.Any])
    
    inline def setOnPreHandlerUndefined: Self = StObject.set(x, "onPreHandler", js.undefined)
    
    inline def setOnPreHandlerVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreHandler", js.Array(value :_*))
    
    inline def setOnPreResponse(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreResponse", value.asInstanceOf[js.Any])
    
    inline def setOnPreResponseUndefined: Self = StObject.set(x, "onPreResponse", js.undefined)
    
    inline def setOnPreResponseVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreResponse", js.Array(value :_*))
  }
}
