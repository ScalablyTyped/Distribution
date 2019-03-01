package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakRoles extends js.Object {
  var roles: js.Array[java.lang.String]
}

object KeycloakRoles {
  @scala.inline
  def apply(roles: js.Array[java.lang.String]): KeycloakRoles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[KeycloakRoles]
  }
}

