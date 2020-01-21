package typings.libraCore.vmErrorsPbMod.ExecutionStatus

import typings.libraCore.vmErrorsPbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject] = js.undefined
  var assertionFailure: js.UndefOr[typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject] = js.undefined
  var referenceError: js.UndefOr[typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject] = js.undefined
  var runtimeStatus: RuntimeStatus
}

object AsObject {
  @scala.inline
  def apply(
    runtimeStatus: RuntimeStatus,
    arithmeticError: typings.libraCore.vmErrorsPbMod.ArithmeticError.AsObject = null,
    assertionFailure: typings.libraCore.vmErrorsPbMod.AssertionFailure.AsObject = null,
    referenceError: typings.libraCore.vmErrorsPbMod.DynamicReferenceError.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus.asInstanceOf[js.Any])
    if (arithmeticError != null) __obj.updateDynamic("arithmeticError")(arithmeticError.asInstanceOf[js.Any])
    if (assertionFailure != null) __obj.updateDynamic("assertionFailure")(assertionFailure.asInstanceOf[js.Any])
    if (referenceError != null) __obj.updateDynamic("referenceError")(referenceError.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

