package typings.keycloakDashJs.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakError extends js.Object {
  var error: String
  var error_description: String
}

object KeycloakError {
  @scala.inline
  def apply(error: String, error_description: String): KeycloakError = {
    val __obj = js.Dynamic.literal(error = error, error_description = error_description)
  
    __obj.asInstanceOf[KeycloakError]
  }
}

