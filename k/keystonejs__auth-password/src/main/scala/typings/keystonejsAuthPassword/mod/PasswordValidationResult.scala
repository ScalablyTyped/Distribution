package typings.keystonejsAuthPassword.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordValidationResult extends js.Object {
  var item: js.Any
  var list: js.Any
  var message: String
  var success: Boolean
}

object PasswordValidationResult {
  @scala.inline
  def apply(item: js.Any, list: js.Any, message: String, success: Boolean): PasswordValidationResult = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PasswordValidationResult]
  }
}

