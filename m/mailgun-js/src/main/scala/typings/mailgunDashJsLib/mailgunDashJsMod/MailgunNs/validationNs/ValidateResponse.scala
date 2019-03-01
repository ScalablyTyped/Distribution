package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var address: java.lang.String
  var did_you_mean: java.lang.String | scala.Null
  var is_disposable_address: scala.Boolean
  var is_role_address: scala.Boolean
  var is_valid: scala.Boolean
  var mailbox_verification: mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false` | mailgunDashJsLib.mailgunDashJsLibStrings.unknown | scala.Null
  var parts: mailgunDashJsLib.Anon_Displayname
}

object ValidateResponse {
  @scala.inline
  def apply(
    address: java.lang.String,
    is_disposable_address: scala.Boolean,
    is_role_address: scala.Boolean,
    is_valid: scala.Boolean,
    parts: mailgunDashJsLib.Anon_Displayname,
    did_you_mean: java.lang.String = null,
    mailbox_verification: mailgunDashJsLib.mailgunDashJsLibStrings.`true` | mailgunDashJsLib.mailgunDashJsLibStrings.`false` | mailgunDashJsLib.mailgunDashJsLibStrings.unknown = null
  ): ValidateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("is_disposable_address")(is_disposable_address)
    __obj.updateDynamic("is_role_address")(is_role_address)
    __obj.updateDynamic("is_valid")(is_valid)
    __obj.updateDynamic("parts")(parts)
    if (did_you_mean != null) __obj.updateDynamic("did_you_mean")(did_you_mean)
    if (mailbox_verification != null) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResponse]
  }
}

