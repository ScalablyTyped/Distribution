package typings.atKeystonejsKeystone.atKeystonejsKeystoneMod

import typings.atKeystonejsKeystone.Anon_ArgsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveInputHooksOptions[Record /* <: js.Object */] extends js.Object {
  var context: js.Any
   // todo: check
  var existingItem: Record
   // not clear in the documentation
  var list: Anon_ArgsContext[Record]
  var originalInput: js.Any
  var resolvedData: js.Any
  var updatedItem: Record
   // TODO: use apollo context
  def addFieldValidationError(error: String): js.Any
}

object ResolveInputHooksOptions {
  @scala.inline
  def apply[Record /* <: js.Object */](
    addFieldValidationError: String => js.Any,
    context: js.Any,
    existingItem: Record,
    list: Anon_ArgsContext[Record],
    originalInput: js.Any,
    resolvedData: js.Any,
    updatedItem: Record
  ): ResolveInputHooksOptions[Record] = {
    val __obj = js.Dynamic.literal(addFieldValidationError = js.Any.fromFunction1(addFieldValidationError), context = context, existingItem = existingItem.asInstanceOf[js.Any], list = list, originalInput = originalInput, resolvedData = resolvedData, updatedItem = updatedItem.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolveInputHooksOptions[Record]]
  }
}

