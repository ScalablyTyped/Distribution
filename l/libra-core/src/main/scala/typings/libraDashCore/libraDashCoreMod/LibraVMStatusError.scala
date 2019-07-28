package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraVMStatusError extends js.Object {
  var deserializationError: js.UndefOr[LibraDeserializationError] = js.undefined
  var errorType: LibraErrorType | Double
  var executionError: js.UndefOr[LibraExecutionError] = js.undefined
  var invariantViolation: js.UndefOr[LibraInvariantViolationError] = js.undefined
  var validationStatus: js.UndefOr[LibraValidationStatusError] = js.undefined
  var verificationStatusList: js.UndefOr[js.Array[LibraVerificationStatusError]] = js.undefined
}

object LibraVMStatusError {
  @scala.inline
  def apply(
    errorType: LibraErrorType | Double,
    deserializationError: LibraDeserializationError = null,
    executionError: LibraExecutionError = null,
    invariantViolation: LibraInvariantViolationError = null,
    validationStatus: LibraValidationStatusError = null,
    verificationStatusList: js.Array[LibraVerificationStatusError] = null
  ): LibraVMStatusError = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any])
    if (deserializationError != null) __obj.updateDynamic("deserializationError")(deserializationError)
    if (executionError != null) __obj.updateDynamic("executionError")(executionError)
    if (invariantViolation != null) __obj.updateDynamic("invariantViolation")(invariantViolation)
    if (validationStatus != null) __obj.updateDynamic("validationStatus")(validationStatus)
    if (verificationStatusList != null) __obj.updateDynamic("verificationStatusList")(verificationStatusList)
    __obj.asInstanceOf[LibraVMStatusError]
  }
}

