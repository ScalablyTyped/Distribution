package typings
package hapiDashAuthDashJwt2Lib.hapiDashAuthDashJwt2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: scala.Boolean
  var response: js.UndefOr[hapiLib.hapiMod.ResponseObject] = js.undefined
}

object ValidationResult {
  @scala.inline
  def apply(
    isValid: scala.Boolean,
    credentials: js.Any = null,
    response: hapiLib.hapiMod.ResponseObject = null
  ): ValidationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[ValidationResult]
  }
}

