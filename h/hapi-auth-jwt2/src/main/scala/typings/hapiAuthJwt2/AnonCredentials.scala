package typings.hapiAuthJwt2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCredentials extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: Boolean
}

object AnonCredentials {
  @scala.inline
  def apply(isValid: Boolean, credentials: js.Any = null): AnonCredentials = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCredentials]
  }
}

