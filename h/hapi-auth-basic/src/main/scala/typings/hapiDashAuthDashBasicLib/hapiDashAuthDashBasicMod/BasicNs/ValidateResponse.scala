package typings
package hapiDashAuthDashBasicLib.hapiDashAuthDashBasicMod.BasicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: scala.Boolean
}

object ValidateResponse {
  @scala.inline
  def apply(isValid: scala.Boolean, credentials: js.Any = null): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[ValidateResponse]
  }
}

