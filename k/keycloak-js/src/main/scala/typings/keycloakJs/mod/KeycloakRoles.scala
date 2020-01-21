package typings.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakRoles extends js.Object {
  var roles: js.Array[String]
}

object KeycloakRoles {
  @scala.inline
  def apply(roles: js.Array[String]): KeycloakRoles = {
    val __obj = js.Dynamic.literal(roles = roles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeycloakRoles]
  }
}

