package typings.hapi.mod

import typings.hapi.anon.Access
import typings.hapi.mod.Util.HTTP_METHODS_PARTIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestRoute extends StObject {
  
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
  implicit class RequestRouteMutableBuilder[Self <: RequestRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Access): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: HTTP_METHODS_PARTIAL): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: ServerRealm): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: RouteOptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    
    @scala.inline
    def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value :_*))
  }
}
