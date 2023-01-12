package typings.hapiHapi.mod

import typings.hapiHapi.anon.Access
import typings.hapiHapi.mod.Util.HTTP_METHODS_PARTIAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestRoute extends StObject {
  
  var auth: Access
  
  /** the route internal normalized string representing the normalized path. */
  var fingerprint: String
  
  /** the route HTTP method. */
  var method: HTTP_METHODS_PARTIAL
  
  /** the route path. */
  var path: String
  
  /** the active realm associated with the route. */
  var realm: ServerRealm
  
  /** the route options object with all defaults applied. */
  var settings: RouteSettings
  
  /** the route vhost option if configured. */
  var vhost: js.UndefOr[String | js.Array[String]] = js.undefined
}
object RequestRoute {
  
  inline def apply(
    auth: Access,
    fingerprint: String,
    method: HTTP_METHODS_PARTIAL,
    path: String,
    realm: ServerRealm,
    settings: RouteSettings
  ): RequestRoute = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestRoute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestRoute] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Access): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: HTTP_METHODS_PARTIAL): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: ServerRealm): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setSettings(value: RouteSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    
    inline def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value*))
  }
}
