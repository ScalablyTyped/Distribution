package typings.hapiDashAuthDashJwt2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credentials extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: Boolean
}

object Anon_Credentials {
  @scala.inline
  def apply(isValid: Boolean, credentials: js.Any = null): Anon_Credentials = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Credentials]
  }
}

