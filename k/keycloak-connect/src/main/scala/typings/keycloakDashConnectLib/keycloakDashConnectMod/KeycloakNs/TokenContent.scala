package typings
package keycloakDashConnectLib.keycloakDashConnectMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenContent extends js.Object {
  var exp: scala.Double
  var realm_access: js.UndefOr[keycloakDashConnectLib.Anon_Roles] = js.undefined
  var resource_access: js.UndefOr[js.Any] = js.undefined
}

object TokenContent {
  @scala.inline
  def apply(
    exp: scala.Double,
    realm_access: keycloakDashConnectLib.Anon_Roles = null,
    resource_access: js.Any = null
  ): TokenContent = {
    val __obj = js.Dynamic.literal(exp = exp)
    if (realm_access != null) __obj.updateDynamic("realm_access")(realm_access)
    if (resource_access != null) __obj.updateDynamic("resource_access")(resource_access)
    __obj.asInstanceOf[TokenContent]
  }
}

