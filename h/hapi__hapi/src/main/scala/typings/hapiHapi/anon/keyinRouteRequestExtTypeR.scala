package typings.hapiHapi.anon

import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesServerExtMod.RouteExtObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @hapi/hapi.@hapi/hapi/lib/types/server.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi/lib/types/server.RouteExtObject<@hapi/hapi.@hapi/hapi/lib/types/request.ReqRefDefaults> | std.Array<@hapi/hapi.@hapi/hapi/lib/types/server.RouteExtObject<@hapi/hapi.@hapi/hapi/lib/types/request.ReqRefDefaults>> | undefined} */
trait keyinRouteRequestExtTypeR extends StObject {
  
  var onCredentials: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPostAuth: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPostHandler: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPostResponse: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPreAuth: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPreHandler: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
  
  var onPreResponse: js.UndefOr[RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]] = js.undefined
}
object keyinRouteRequestExtTypeR {
  
  inline def apply(): keyinRouteRequestExtTypeR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinRouteRequestExtTypeR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: keyinRouteRequestExtTypeR] (val x: Self) extends AnyVal {
    
    inline def setOnCredentials(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onCredentials", value.asInstanceOf[js.Any])
    
    inline def setOnCredentialsUndefined: Self = StObject.set(x, "onCredentials", js.undefined)
    
    inline def setOnCredentialsVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onCredentials", js.Array(value*))
    
    inline def setOnPostAuth(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPostAuth", value.asInstanceOf[js.Any])
    
    inline def setOnPostAuthUndefined: Self = StObject.set(x, "onPostAuth", js.undefined)
    
    inline def setOnPostAuthVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPostAuth", js.Array(value*))
    
    inline def setOnPostHandler(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    
    inline def setOnPostHandlerUndefined: Self = StObject.set(x, "onPostHandler", js.undefined)
    
    inline def setOnPostHandlerVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPostHandler", js.Array(value*))
    
    inline def setOnPostResponse(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPostResponse", value.asInstanceOf[js.Any])
    
    inline def setOnPostResponseUndefined: Self = StObject.set(x, "onPostResponse", js.undefined)
    
    inline def setOnPostResponseVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPostResponse", js.Array(value*))
    
    inline def setOnPreAuth(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPreAuth", value.asInstanceOf[js.Any])
    
    inline def setOnPreAuthUndefined: Self = StObject.set(x, "onPreAuth", js.undefined)
    
    inline def setOnPreAuthVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPreAuth", js.Array(value*))
    
    inline def setOnPreHandler(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPreHandler", value.asInstanceOf[js.Any])
    
    inline def setOnPreHandlerUndefined: Self = StObject.set(x, "onPreHandler", js.undefined)
    
    inline def setOnPreHandlerVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPreHandler", js.Array(value*))
    
    inline def setOnPreResponse(value: RouteExtObject[ReqRefDefaults] | js.Array[RouteExtObject[ReqRefDefaults]]): Self = StObject.set(x, "onPreResponse", value.asInstanceOf[js.Any])
    
    inline def setOnPreResponseUndefined: Self = StObject.set(x, "onPreResponse", js.undefined)
    
    inline def setOnPreResponseVarargs(value: RouteExtObject[ReqRefDefaults]*): Self = StObject.set(x, "onPreResponse", js.Array(value*))
  }
}
