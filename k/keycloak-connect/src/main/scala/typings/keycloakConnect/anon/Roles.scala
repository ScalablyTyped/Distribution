package typings.keycloakConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Roles extends js.Object {
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}

object Roles {
  @scala.inline
  def apply(roles: js.Array[String] = null): Roles = {
    val __obj = js.Dynamic.literal()
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Roles]
  }
}

