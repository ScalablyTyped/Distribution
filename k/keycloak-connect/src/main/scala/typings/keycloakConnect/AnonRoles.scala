package typings.keycloakConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoles extends js.Object {
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonRoles {
  @scala.inline
  def apply(roles: js.Array[String] = null): AnonRoles = {
    val __obj = js.Dynamic.literal()
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoles]
  }
}

