package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus

import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.BinaryError
import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMInvariantViolationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deserialization: BinaryError
  var execution: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.AsObject
  ] = js.undefined
  var invariantViolation: VMInvariantViolationError
  var validation: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatus.AsObject
  ] = js.undefined
  var verification: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatusList.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    deserialization: BinaryError,
    invariantViolation: VMInvariantViolationError,
    execution: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus.AsObject = null,
    validation: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMValidationStatus.AsObject = null,
    verification: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMVerificationStatusList.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(deserialization = deserialization, invariantViolation = invariantViolation)
    if (execution != null) __obj.updateDynamic("execution")(execution)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (verification != null) __obj.updateDynamic("verification")(verification)
    __obj.asInstanceOf[AsObject]
  }
}

