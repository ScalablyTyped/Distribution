package typings
package atHapiCookieLib.atHapiCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var credentials: js.UndefOr[atHapiHapiLib.atHapiHapiMod.AuthCredentials] = js.undefined
  var valid: scala.Boolean
}

object ValidateResponse {
  @scala.inline
  def apply(valid: scala.Boolean, credentials: atHapiHapiLib.atHapiHapiMod.AuthCredentials = null): ValidateResponse = {
    val __obj = js.Dynamic.literal(valid = valid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[ValidateResponse]
  }
}

