package typings.hapiDashAuthDashJwt2.hapiDashAuthDashJwt2Mod

import typings.atHapiHapi.atHapiHapiMod.ResponseObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: Boolean
  var response: js.UndefOr[ResponseObject] = js.undefined
}

object ValidationResult {
  @scala.inline
  def apply(isValid: Boolean, credentials: js.Any = null, response: ResponseObject = null): ValidationResult = {
    val __obj = js.Dynamic.literal(isValid = isValid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (response != null) __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[ValidationResult]
  }
}

