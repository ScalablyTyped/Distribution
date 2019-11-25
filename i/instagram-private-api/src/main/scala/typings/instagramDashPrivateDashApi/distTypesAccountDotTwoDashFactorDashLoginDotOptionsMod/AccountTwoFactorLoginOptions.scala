package typings.instagramDashPrivateDashApi.distTypesAccountDotTwoDashFactorDashLoginDotOptionsMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`0`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTwoFactorLoginOptions extends js.Object {
  var trustThisDevice: js.UndefOr[`1` | `0`] = js.undefined
  var twoFactorIdentifier: String
  var username: String
  var verificationCode: String
  var verificationMethod: js.UndefOr[String] = js.undefined
}

object AccountTwoFactorLoginOptions {
  @scala.inline
  def apply(
    twoFactorIdentifier: String,
    username: String,
    verificationCode: String,
    trustThisDevice: `1` | `0` = null,
    verificationMethod: String = null
  ): AccountTwoFactorLoginOptions = {
    val __obj = js.Dynamic.literal(twoFactorIdentifier = twoFactorIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    if (trustThisDevice != null) __obj.updateDynamic("trustThisDevice")(trustThisDevice.asInstanceOf[js.Any])
    if (verificationMethod != null) __obj.updateDynamic("verificationMethod")(verificationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTwoFactorLoginOptions]
  }
}

