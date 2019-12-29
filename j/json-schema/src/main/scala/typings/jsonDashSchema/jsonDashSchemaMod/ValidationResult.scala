package typings.jsonDashSchema.jsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var errors: js.Array[ValidationError]
  var valid: Boolean
}

object ValidationResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], valid: Boolean): ValidationResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationResult]
  }
}

