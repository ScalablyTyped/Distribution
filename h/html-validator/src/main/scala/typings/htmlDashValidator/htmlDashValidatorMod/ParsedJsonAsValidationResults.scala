package typings.htmlDashValidator.htmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedJsonAsValidationResults extends js.Object {
  var messages: js.Array[ValidationMessageObject]
}

object ParsedJsonAsValidationResults {
  @scala.inline
  def apply(messages: js.Array[ValidationMessageObject]): ParsedJsonAsValidationResults = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedJsonAsValidationResults]
  }
}

