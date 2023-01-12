package typings.keycloakJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeycloakConfig extends StObject {
  
  /**
  	 * Client identifier, example: 'myapp'
  	 */
  var clientId: String
  
  /**
  	 * Name of the realm, for example: 'myrealm'
  	 */
  var realm: String
  
  /**
  	 * URL to the Keycloak server, for example: http://keycloak-server/auth
  	 */
  var url: js.UndefOr[String] = js.undefined
}
object KeycloakConfig {
  
  inline def apply(clientId: String, realm: String): KeycloakConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeycloakConfig] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
