package typings.isDashMyDashJsonDashValid.isDashMyDashJsonDashValidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var field: String
  var message: String
  var `type`: String
  var value: js.Any
}

object ValidationError {
  @scala.inline
  def apply(field: String, message: String, `type`: String, value: js.Any): ValidationError = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

