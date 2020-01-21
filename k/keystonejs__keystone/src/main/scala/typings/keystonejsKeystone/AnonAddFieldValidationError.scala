package typings.keystonejsKeystone

import typings.keystonejsKeystone.keystonejsKeystoneStrings.addFieldValidationError
import typings.keystonejsKeystone.keystonejsKeystoneStrings.context
import typings.keystonejsKeystone.keystonejsKeystoneStrings.existingItem
import typings.keystonejsKeystone.keystonejsKeystoneStrings.list
import typings.keystonejsKeystone.keystonejsKeystoneStrings.originalInput
import typings.keystonejsKeystone.keystonejsKeystoneStrings.updatedItem
import typings.keystonejsKeystone.mod.ResolveInputHooksOptions
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddFieldValidationError extends js.Object {
  def afterChange(
    opts: Pick[
      ResolveInputHooksOptions[_], 
      updatedItem | existingItem | originalInput | context | list
    ]
  ): Unit
  def afterDelete(opts: Pick[ResolveInputHooksOptions[_], existingItem | context | list]): Unit
  @JSName("beforeChange")
  def beforeChange_addFieldValidationError(opts: Omit[ResolveInputHooksOptions[_], addFieldValidationError]): Unit
  def beforeDelete(opts: Pick[ResolveInputHooksOptions[_], existingItem | context | list]): Unit
  def resolveInput(opts: Omit[ResolveInputHooksOptions[_], addFieldValidationError | updatedItem]): js.Any
  def validateDelete(
    opts: Pick[
      ResolveInputHooksOptions[_], 
      existingItem | context | list | addFieldValidationError
    ]
  ): Unit
   // TODO: return the same shape as resolvedData
  @JSName("validateInput")
  def validateInput_updatedItem(opts: Omit[ResolveInputHooksOptions[_], updatedItem]): Unit
}

object AnonAddFieldValidationError {
  @scala.inline
  def apply(
    afterChange: Pick[
      ResolveInputHooksOptions[_], 
      updatedItem | existingItem | originalInput | context | list
    ] => Unit,
    afterDelete: Pick[ResolveInputHooksOptions[_], existingItem | context | list] => Unit,
    beforeChange: Omit[ResolveInputHooksOptions[_], addFieldValidationError] => Unit,
    beforeDelete: Pick[ResolveInputHooksOptions[_], existingItem | context | list] => Unit,
    resolveInput: Omit[ResolveInputHooksOptions[_], addFieldValidationError | updatedItem] => js.Any,
    validateDelete: Pick[
      ResolveInputHooksOptions[_], 
      existingItem | context | list | addFieldValidationError
    ] => Unit,
    validateInput: Omit[ResolveInputHooksOptions[_], updatedItem] => Unit
  ): AnonAddFieldValidationError = {
    val __obj = js.Dynamic.literal(afterChange = js.Any.fromFunction1(afterChange), afterDelete = js.Any.fromFunction1(afterDelete), beforeChange = js.Any.fromFunction1(beforeChange), beforeDelete = js.Any.fromFunction1(beforeDelete), resolveInput = js.Any.fromFunction1(resolveInput), validateDelete = js.Any.fromFunction1(validateDelete), validateInput = js.Any.fromFunction1(validateInput))
  
    __obj.asInstanceOf[AnonAddFieldValidationError]
  }
}

