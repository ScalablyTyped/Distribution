package typings
package hapiDashAuthDashCookieLib.hapiDashAuthDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var credentials: js.UndefOr[hapiLib.hapiMod.AuthCredentials] = js.undefined
  var valid: scala.Boolean
}

object ValidateResponse {
  @scala.inline
  def apply(valid: scala.Boolean, credentials: hapiLib.hapiMod.AuthCredentials = null): ValidateResponse = {
    val __obj = js.Dynamic.literal(valid = valid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[ValidateResponse]
  }
}

