package typings.hapiHapi.anon

import typings.hapiHapi.mod.RouteExtObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>} */
@js.native
trait keyinRouteRequestExtTypeR extends StObject {
  
  var onCredentials: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  
  var onPostAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  
  var onPostHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  
  var onPreAuth: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  
  var onPreHandler: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
  
  var onPreResponse: js.UndefOr[RouteExtObject | js.Array[RouteExtObject]] = js.native
}
object keyinRouteRequestExtTypeR {
  
  @scala.inline
  def apply(): keyinRouteRequestExtTypeR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[keyinRouteRequestExtTypeR]
  }
  
  @scala.inline
  implicit class keyinRouteRequestExtTypeRMutableBuilder[Self <: keyinRouteRequestExtTypeR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCredentials(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCredentialsUndefined: Self = StObject.set(x, "onCredentials", js.undefined)
    
    @scala.inline
    def setOnCredentialsVarargs(value: RouteExtObject*): Self = StObject.set(x, "onCredentials", js.Array(value :_*))
    
    @scala.inline
    def setOnPostAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPostAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPostAuthUndefined: Self = StObject.set(x, "onPostAuth", js.undefined)
    
    @scala.inline
    def setOnPostAuthVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPostAuth", js.Array(value :_*))
    
    @scala.inline
    def setOnPostHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPostHandlerUndefined: Self = StObject.set(x, "onPostHandler", js.undefined)
    
    @scala.inline
    def setOnPostHandlerVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPostHandler", js.Array(value :_*))
    
    @scala.inline
    def setOnPreAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPreAuthUndefined: Self = StObject.set(x, "onPreAuth", js.undefined)
    
    @scala.inline
    def setOnPreAuthVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreAuth", js.Array(value :_*))
    
    @scala.inline
    def setOnPreHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPreHandlerUndefined: Self = StObject.set(x, "onPreHandler", js.undefined)
    
    @scala.inline
    def setOnPreHandlerVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreHandler", js.Array(value :_*))
    
    @scala.inline
    def setOnPreResponse(value: RouteExtObject | js.Array[RouteExtObject]): Self = StObject.set(x, "onPreResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPreResponseUndefined: Self = StObject.set(x, "onPreResponse", js.undefined)
    
    @scala.inline
    def setOnPreResponseVarargs(value: RouteExtObject*): Self = StObject.set(x, "onPreResponse", js.Array(value :_*))
  }
}
