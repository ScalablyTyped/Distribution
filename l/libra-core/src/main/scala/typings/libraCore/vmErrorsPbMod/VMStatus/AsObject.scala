package typings.libraCore.vmErrorsPbMod.VMStatus

import typings.libraCore.vmErrorsPbMod.BinaryError
import typings.libraCore.vmErrorsPbMod.VMInvariantViolationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var deserialization: BinaryError
  var execution: js.UndefOr[typings.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject] = js.undefined
  var invariantViolation: VMInvariantViolationError
  var validation: js.UndefOr[typings.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject] = js.undefined
  var verification: js.UndefOr[typings.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    deserialization: BinaryError,
    invariantViolation: VMInvariantViolationError,
    execution: typings.libraCore.vmErrorsPbMod.ExecutionStatus.AsObject = null,
    validation: typings.libraCore.vmErrorsPbMod.VMValidationStatus.AsObject = null,
    verification: typings.libraCore.vmErrorsPbMod.VMVerificationStatusList.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(deserialization = deserialization.asInstanceOf[js.Any], invariantViolation = invariantViolation.asInstanceOf[js.Any])
    if (execution != null) __obj.updateDynamic("execution")(execution.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    if (verification != null) __obj.updateDynamic("verification")(verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

