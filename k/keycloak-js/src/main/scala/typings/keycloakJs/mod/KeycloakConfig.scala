package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakConfig extends js.Object {
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
  @scala.inline
  def apply(clientId: String, realm: String, url: String = null): KeycloakConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeycloakConfig]
  }
}

