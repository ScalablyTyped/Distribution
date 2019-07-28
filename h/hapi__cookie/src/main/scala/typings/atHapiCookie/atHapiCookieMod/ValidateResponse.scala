package typings.atHapiCookie.atHapiCookieMod

import typings.atHapiHapi.atHapiHapiMod.AuthCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var credentials: js.UndefOr[AuthCredentials] = js.undefined
  var valid: Boolean
}

object ValidateResponse {
  @scala.inline
  def apply(valid: Boolean, credentials: AuthCredentials = null): ValidateResponse = {
    val __obj = js.Dynamic.literal(valid = valid)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[ValidateResponse]
  }
}

