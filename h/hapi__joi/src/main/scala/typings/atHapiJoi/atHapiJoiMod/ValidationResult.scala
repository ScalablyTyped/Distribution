package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var error: ValidationError
  var errors: ValidationError
  var value: js.Any
  var warning: ValidationError
}

object ValidationResult {
  @scala.inline
  def apply(error: ValidationError, errors: ValidationError, value: js.Any, warning: ValidationError): ValidationResult = {
    val __obj = js.Dynamic.literal(error = error, errors = errors, value = value, warning = warning)
  
    __obj.asInstanceOf[ValidationResult]
  }
}

