package typings.keycloakConnect.mod

import typings.keycloakConnect.AnonRoles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenContent extends js.Object {
  var exp: Double
  var realm_access: js.UndefOr[AnonRoles] = js.undefined
  var resource_access: js.UndefOr[js.Any] = js.undefined
}

object TokenContent {
  @scala.inline
  def apply(exp: Double, realm_access: AnonRoles = null, resource_access: js.Any = null): TokenContent = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    if (realm_access != null) __obj.updateDynamic("realm_access")(realm_access.asInstanceOf[js.Any])
    if (resource_access != null) __obj.updateDynamic("resource_access")(resource_access.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenContent]
  }
}

