package typings.mailgunJs.mod.validation

import typings.mailgunJs.anon.Displayname
import typings.mailgunJs.mailgunJsStrings.false_
import typings.mailgunJs.mailgunJsStrings.true_
import typings.mailgunJs.mailgunJsStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateResponse extends js.Object {
  var address: String = js.native
  var did_you_mean: String | Null = js.native
  var is_disposable_address: Boolean = js.native
  var is_role_address: Boolean = js.native
  var is_valid: Boolean = js.native
  var mailbox_verification: true_ | false_ | unknown | Null = js.native
  var parts: Displayname = js.native
}

object ValidateResponse {
  @scala.inline
  def apply(
    address: String,
    is_disposable_address: Boolean,
    is_role_address: Boolean,
    is_valid: Boolean,
    parts: Displayname
  ): ValidateResponse = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], is_disposable_address = is_disposable_address.asInstanceOf[js.Any], is_role_address = is_role_address.asInstanceOf[js.Any], is_valid = is_valid.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResponse]
  }
  @scala.inline
  implicit class ValidateResponseOps[Self <: ValidateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_disposable_address(value: Boolean): Self = this.set("is_disposable_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_role_address(value: Boolean): Self = this.set("is_role_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_valid(value: Boolean): Self = this.set("is_valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setParts(value: Displayname): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setDid_you_mean(value: String): Self = this.set("did_you_mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setDid_you_meanNull: Self = this.set("did_you_mean", null)
    @scala.inline
    def setMailbox_verification(value: true_ | false_ | unknown): Self = this.set("mailbox_verification", value.asInstanceOf[js.Any])
    @scala.inline
    def setMailbox_verificationNull: Self = this.set("mailbox_verification", null)
  }
  
}

