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

@JSImport("libra-core", "LibraVMStatusError")
@js.native
object LibraVMStatusError extends js.Object {
  def apply(errorType: Double): Unit = js.native
  def apply(errorType: Double, validationStatus: LibraValidationStatusError): Unit = js.native
  def apply(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): Unit = js.native
  def apply(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): Unit = js.native
  def apply(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): Unit = js.native
  def apply(
    errorType: Double,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): Unit = js.native
  def apply(errorType: LibraErrorType): Unit = js.native
  def apply(errorType: LibraErrorType, validationStatus: LibraValidationStatusError): Unit = js.native
  def apply(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError]
  ): Unit = js.native
  def apply(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError
  ): Unit = js.native
  def apply(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError
  ): Unit = js.native
  def apply(
    errorType: LibraErrorType,
    validationStatus: LibraValidationStatusError,
    verificationStatusList: js.Array[LibraVerificationStatusError],
    invariantViolation: LibraInvariantViolationError,
    deserializationError: LibraDeserializationError,
    executionError: LibraExecutionError
  ): Unit = js.native
}

