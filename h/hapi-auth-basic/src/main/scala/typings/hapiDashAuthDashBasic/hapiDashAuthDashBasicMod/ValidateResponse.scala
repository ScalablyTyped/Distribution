package typings.hapiDashAuthDashBasic.hapiDashAuthDashBasicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: Boolean
}

object ValidateResponse {
  @scala.inline
  def apply(isValid: Boolean, credentials: js.Any = null): ValidateResponse = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResponse]
  }
}

