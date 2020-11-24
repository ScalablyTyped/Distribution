package typings.hapi.mod

import typings.hapi.anon.Access
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestRoute extends js.Object {
  
  var auth: Access = js.native
  
  /** the route internal normalized string representing the normalized path. */
  var fingerprint: String = js.native
  
  /** the route HTTP method. */
  var method: HTTP_METHODS_PARTIAL = js.native
  
  /** the route path. */
  var path: String = js.native
  
  /** the active realm associated with the route. */
  var realm: ServerRealm = js.native
  
  /** the route options object with all defaults applied. */
  var settings: RouteOptions = js.native
  
  /** the route vhost option if configured. */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}
object RequestRoute {
  
  @scala.inline
  def apply(
    auth: Access,
    fingerprint: String,
    method: HTTP_METHODS_PARTIAL,
    path: String,
    realm: ServerRealm,
    settings: RouteOptions
  ): RequestRoute = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRoute]
  }
  
  @scala.inline
  implicit class RequestRouteOps[Self <: RequestRoute] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: Access): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: HTTP_METHODS_PARTIAL): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: ServerRealm): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: RouteOptions): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostVarargs(value: String*): Self = this.set("vhost", js.Array(value :_*))
    
    @scala.inline
    def setVhost(value: String | js.Array[String]): Self = this.set("vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
}
