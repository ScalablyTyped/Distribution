package typings.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResult extends js.Object {
  var error: js.UndefOr[ValidationError] = js.undefined
  var errors: js.UndefOr[ValidationError] = js.undefined
  var value: js.Any
  var warning: js.UndefOr[ValidationError] = js.undefined
}

object ValidationResult {
  @scala.inline
  def apply(
    value: js.Any,
    error: ValidationError = null,
    errors: ValidationError = null,
    warning: ValidationError = null
  ): ValidationResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResult]
  }
}

