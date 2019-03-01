package typings
package hapiDashAuthDashJwt2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credentials extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var isValid: scala.Boolean
}

object Anon_Credentials {
  @scala.inline
  def apply(isValid: scala.Boolean, credentials: js.Any = null): Anon_Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[Anon_Credentials]
  }
}

