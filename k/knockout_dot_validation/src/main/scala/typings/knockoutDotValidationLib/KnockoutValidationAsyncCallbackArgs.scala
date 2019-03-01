package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncCallbackArgs extends js.Object {
  var isValid: scala.Boolean
  var message: java.lang.String
}

object KnockoutValidationAsyncCallbackArgs {
  @scala.inline
  def apply(isValid: scala.Boolean, message: java.lang.String): KnockoutValidationAsyncCallbackArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[KnockoutValidationAsyncCallbackArgs]
  }
}

