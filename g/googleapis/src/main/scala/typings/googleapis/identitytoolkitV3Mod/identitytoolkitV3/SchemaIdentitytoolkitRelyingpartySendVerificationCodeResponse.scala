package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for Identitytoolkit-SendVerificationCode
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse extends js.Object {
  /**
    * Encrypted session information
    */
  var sessionInfo: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse {
  @scala.inline
  def apply(sessionInfo: String = null): SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (sessionInfo != null) __obj.updateDynamic("sessionInfo")(sessionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySendVerificationCodeResponse]
  }
}

