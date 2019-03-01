package typings
package keycloakDashJsLib.keycloakDashJsMod.KeycloakNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakError extends js.Object {
  var error: java.lang.String
  var error_description: java.lang.String
}

object KeycloakError {
  @scala.inline
  def apply(error: java.lang.String, error_description: java.lang.String): KeycloakError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("error_description")(error_description)
    __obj.asInstanceOf[KeycloakError]
  }
}

