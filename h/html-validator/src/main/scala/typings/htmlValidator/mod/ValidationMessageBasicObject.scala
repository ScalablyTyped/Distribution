package typings.htmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationMessageBasicObject extends js.Object {
  var message: String
}

object ValidationMessageBasicObject {
  @scala.inline
  def apply(message: String): ValidationMessageBasicObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationMessageBasicObject]
  }
}

