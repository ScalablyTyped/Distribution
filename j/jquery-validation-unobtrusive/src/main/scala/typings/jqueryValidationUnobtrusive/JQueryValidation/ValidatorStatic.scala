package typings.jqueryValidationUnobtrusive.JQueryValidation

import typings.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorStatic extends js.Object {
  var unobtrusive: Validator = js.native
}

object ValidatorStatic {
  @scala.inline
  def apply(unobtrusive: Validator): ValidatorStatic = {
    val __obj = js.Dynamic.literal(unobtrusive = unobtrusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorStatic]
  }
  @scala.inline
  implicit class ValidatorStaticOps[Self <: ValidatorStatic] (val x: Self) extends AnyVal {
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
    def setUnobtrusive(value: Validator): Self = this.set("unobtrusive", value.asInstanceOf[js.Any])
  }
  
}

