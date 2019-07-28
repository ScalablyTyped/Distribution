package typings.knockoutDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncCallbackArgs extends js.Object {
  var isValid: Boolean
  var message: String
}

object KnockoutValidationAsyncCallbackArgs {
  @scala.inline
  def apply(isValid: Boolean, message: String): KnockoutValidationAsyncCallbackArgs = {
    val __obj = js.Dynamic.literal(isValid = isValid, message = message)
  
    __obj.asInstanceOf[KnockoutValidationAsyncCallbackArgs]
  }
}

