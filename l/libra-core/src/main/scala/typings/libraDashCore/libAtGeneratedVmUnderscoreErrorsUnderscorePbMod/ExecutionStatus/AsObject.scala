package typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ExecutionStatus

import typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.RuntimeStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var arithmeticError: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.AsObject
  ] = js.undefined
  var assertionFailure: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.AssertionFailure.AsObject
  ] = js.undefined
  var referenceError: js.UndefOr[
    typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.AsObject
  ] = js.undefined
  var runtimeStatus: RuntimeStatus
}

object AsObject {
  @scala.inline
  def apply(
    runtimeStatus: RuntimeStatus,
    arithmeticError: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.ArithmeticError.AsObject = null,
    assertionFailure: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.AssertionFailure.AsObject = null,
    referenceError: typings.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.DynamicReferenceError.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(runtimeStatus = runtimeStatus)
    if (arithmeticError != null) __obj.updateDynamic("arithmeticError")(arithmeticError)
    if (assertionFailure != null) __obj.updateDynamic("assertionFailure")(assertionFailure)
    if (referenceError != null) __obj.updateDynamic("referenceError")(referenceError)
    __obj.asInstanceOf[AsObject]
  }
}

