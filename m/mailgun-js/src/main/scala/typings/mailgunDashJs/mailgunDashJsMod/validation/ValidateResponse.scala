package typings.mailgunDashJs.mailgunDashJsMod.validation

import typings.mailgunDashJs.Anon_Displayname
import typings.mailgunDashJs.mailgunDashJsStrings.false_
import typings.mailgunDashJs.mailgunDashJsStrings.true_
import typings.mailgunDashJs.mailgunDashJsStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateResponse extends js.Object {
  var address: String
  var did_you_mean: String | Null
  var is_disposable_address: Boolean
  var is_role_address: Boolean
  var is_valid: Boolean
  var mailbox_verification: true_ | false_ | unknown | Null
  var parts: Anon_Displayname
}

object ValidateResponse {
  @scala.inline
  def apply(
    address: String,
    is_disposable_address: Boolean,
    is_role_address: Boolean,
    is_valid: Boolean,
    parts: Anon_Displayname,
    did_you_mean: String = null,
    mailbox_verification: true_ | false_ | unknown = null
  ): ValidateResponse = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], is_disposable_address = is_disposable_address.asInstanceOf[js.Any], is_role_address = is_role_address.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    if (did_you_mean != null) __obj.updateDynamic("did_you_mean")(did_you_mean.asInstanceOf[js.Any])
    if (mailbox_verification != null) __obj.updateDynamic("mailbox_verification")(mailbox_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResponse]
  }
}

