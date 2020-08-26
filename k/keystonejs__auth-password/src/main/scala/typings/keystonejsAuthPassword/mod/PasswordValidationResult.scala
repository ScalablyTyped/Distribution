package typings.keystonejsAuthPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasswordValidationResult extends js.Object {
  var item: js.Any = js.native
  var list: js.Any = js.native
  var message: String = js.native
  var success: Boolean = js.native
}

object PasswordValidationResult {
  @scala.inline
  def apply(item: js.Any, list: js.Any, message: String, success: Boolean): PasswordValidationResult = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordValidationResult]
  }
  @scala.inline
  implicit class PasswordValidationResultOps[Self <: PasswordValidationResult] (val x: Self) extends AnyVal {
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
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: js.Any): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

