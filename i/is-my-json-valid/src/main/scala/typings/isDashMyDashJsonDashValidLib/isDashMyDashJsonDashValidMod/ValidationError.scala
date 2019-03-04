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
    val __obj = js.Dynamic.literal(field = field, message = message, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValidationError]
  }
}

