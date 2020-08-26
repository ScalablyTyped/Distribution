package typings.knockoutValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutValidationAsyncCallbackArgs extends js.Object {
  var isValid: Boolean = js.native
  var message: String = js.native
}

object KnockoutValidationAsyncCallbackArgs {
  @scala.inline
  def apply(isValid: Boolean, message: String): KnockoutValidationAsyncCallbackArgs = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationAsyncCallbackArgs]
  }
  @scala.inline
  implicit class KnockoutValidationAsyncCallbackArgsOps[Self <: KnockoutValidationAsyncCallbackArgs] (val x: Self) extends AnyVal {
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

