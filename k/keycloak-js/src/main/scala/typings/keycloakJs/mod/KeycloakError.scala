package typings.keycloakJs.mod

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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeycloakError]
  }
}

