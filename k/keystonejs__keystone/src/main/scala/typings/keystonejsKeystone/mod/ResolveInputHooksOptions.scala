package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.AnonQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveInputHooksOptions[Record /* <: js.Object */] extends js.Object {
  var context: js.Any
   // todo: check
  var existingItem: Record
   // not clear in the documentation
  var list: AnonQuery[Record]
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
    list: AnonQuery[Record],
    originalInput: js.Any,
    resolvedData: js.Any,
    updatedItem: Record
  ): ResolveInputHooksOptions[Record] = {
    val __obj = js.Dynamic.literal(addFieldValidationError = js.Any.fromFunction1(addFieldValidationError), context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveInputHooksOptions[Record]]
  }
}

