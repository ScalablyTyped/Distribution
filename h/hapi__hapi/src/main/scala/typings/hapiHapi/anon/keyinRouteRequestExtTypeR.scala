package typings.hapiHapi.anon

import typings.hapiHapi.mod.RouteExtObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @hapi/hapi.@hapi/hapi.RouteRequestExtType ]:? @hapi/hapi.@hapi/hapi.RouteExtObject | std.Array<@hapi/hapi.@hapi/hapi.RouteExtObject>} */
@js.native
trait keyinRouteRequestExtTypeR extends js.Object {
  
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
  implicit class keyinRouteRequestExtTypeROps[Self <: keyinRouteRequestExtTypeR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnCredentialsVarargs(value: RouteExtObject*): Self = this.set("onCredentials", js.Array(value :_*))
    
    @scala.inline
    def setOnCredentials(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnCredentials: Self = this.set("onCredentials", js.undefined)
    
    @scala.inline
    def setOnPostAuthVarargs(value: RouteExtObject*): Self = this.set("onPostAuth", js.Array(value :_*))
    
    @scala.inline
    def setOnPostAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onPostAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPostAuth: Self = this.set("onPostAuth", js.undefined)
    
    @scala.inline
    def setOnPostHandlerVarargs(value: RouteExtObject*): Self = this.set("onPostHandler", js.Array(value :_*))
    
    @scala.inline
    def setOnPostHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onPostHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPostHandler: Self = this.set("onPostHandler", js.undefined)
    
    @scala.inline
    def setOnPreAuthVarargs(value: RouteExtObject*): Self = this.set("onPreAuth", js.Array(value :_*))
    
    @scala.inline
    def setOnPreAuth(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onPreAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPreAuth: Self = this.set("onPreAuth", js.undefined)
    
    @scala.inline
    def setOnPreHandlerVarargs(value: RouteExtObject*): Self = this.set("onPreHandler", js.Array(value :_*))
    
    @scala.inline
    def setOnPreHandler(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onPreHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPreHandler: Self = this.set("onPreHandler", js.undefined)
    
    @scala.inline
    def setOnPreResponseVarargs(value: RouteExtObject*): Self = this.set("onPreResponse", js.Array(value :_*))
    
    @scala.inline
    def setOnPreResponse(value: RouteExtObject | js.Array[RouteExtObject]): Self = this.set("onPreResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnPreResponse: Self = this.set("onPreResponse", js.undefined)
  }
}
