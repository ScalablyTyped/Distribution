package typings.jqueryValidationUnobtrusive.JQueryValidation

import typings.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorStatic extends js.Object {
  var unobtrusive: Validator
}

object ValidatorStatic {
  @scala.inline
  def apply(unobtrusive: Validator): ValidatorStatic = {
    val __obj = js.Dynamic.literal(unobtrusive = unobtrusive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorStatic]
  }
}

