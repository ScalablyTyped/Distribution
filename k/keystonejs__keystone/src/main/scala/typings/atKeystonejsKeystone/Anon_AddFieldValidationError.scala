package typings.atKeystonejsKeystone

import typings.atKeystonejsKeystone.atKeystonejsKeystoneMod.ResolveInputHooksOptions
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.addFieldValidationError
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.context
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.existingItem
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.list
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.originalInput
import typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.updatedItem
import typings.std.Omit
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddFieldValidationError extends js.Object {
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

object Anon_AddFieldValidationError {
  @scala.inline
  def apply(
    afterChange: Pick[
      ResolveInputHooksOptions[_], 
      updatedItem | existingItem | originalInput | context | list
    ] => Unit,
    afterDelete: Pick[ResolveInputHooksOptions[_], existingItem | context | list] => Unit,
    beforeChange_addFieldValidationError: Omit[ResolveInputHooksOptions[_], addFieldValidationError] => Unit,
    beforeDelete: Pick[ResolveInputHooksOptions[_], existingItem | context | list] => Unit,
    resolveInput: Omit[ResolveInputHooksOptions[_], addFieldValidationError | updatedItem] => js.Any,
    validateDelete: Pick[
      ResolveInputHooksOptions[_], 
      existingItem | context | list | addFieldValidationError
    ] => Unit,
    validateInput_updatedItem: Omit[ResolveInputHooksOptions[_], updatedItem] => Unit
  ): Anon_AddFieldValidationError = {
    val __obj = js.Dynamic.literal(afterChange = js.Any.fromFunction1(afterChange), afterDelete = js.Any.fromFunction1(afterDelete), beforeDelete = js.Any.fromFunction1(beforeDelete), resolveInput = js.Any.fromFunction1(resolveInput), validateDelete = js.Any.fromFunction1(validateDelete))
    __obj.updateDynamic("beforeChange")(js.Any.fromFunction1(beforeChange_addFieldValidationError))
    __obj.updateDynamic("validateInput")(js.Any.fromFunction1(validateInput_updatedItem))
    __obj.asInstanceOf[Anon_AddFieldValidationError]
  }
}

