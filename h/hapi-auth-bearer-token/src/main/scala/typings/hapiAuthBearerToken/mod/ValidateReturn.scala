package typings.hapiAuthBearerToken.mod

import typings.hapi.mod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined hapi.hapi.AuthenticationData & {  isValid  :boolean} */
trait ValidateReturn extends js.Object {
  var artifacts: js.UndefOr[js.Object] = js.undefined
  var credentials: AuthCredentials
  var isValid: Boolean
}

object ValidateReturn {
  @scala.inline
  def apply(credentials: AuthCredentials, isValid: Boolean, artifacts: js.Object = null): ValidateReturn = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    if (artifacts != null) __obj.updateDynamic("artifacts")(artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateReturn]
  }
}

