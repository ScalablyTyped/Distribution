package typings
package isDashMyDashJsonDashValidLib.isDashMyDashJsonDashValidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var field: java.lang.String
  var message: java.lang.String
  var `type`: java.lang.String
  var value: js.Any
}

object ValidationError {
  @scala.inline
  def apply(field: java.lang.String, message: java.lang.String, `type`: java.lang.String, value: js.Any): ValidationError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValidationError]
  }
}

