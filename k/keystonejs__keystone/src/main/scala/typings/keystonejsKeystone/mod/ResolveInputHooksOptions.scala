package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.anon.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveInputHooksOptions[Record /* <: js.Object */] extends js.Object {
  var context: js.Any = js.native
   // todo: check
  var existingItem: Record = js.native
   // not clear in the documentation
  var list: Query[Record] = js.native
  var originalInput: js.Any = js.native
  var resolvedData: js.Any = js.native
  var updatedItem: Record = js.native
   // TODO: use apollo context
  def addFieldValidationError(error: String): js.Any = js.native
}

object ResolveInputHooksOptions {
  @scala.inline
  def apply[/* <: js.Object */ Record](
    addFieldValidationError: String => js.Any,
    context: js.Any,
    existingItem: Record,
    list: Query[Record],
    originalInput: js.Any,
    resolvedData: js.Any,
    updatedItem: Record
  ): ResolveInputHooksOptions[Record] = {
    val __obj = js.Dynamic.literal(addFieldValidationError = js.Any.fromFunction1(addFieldValidationError), context = context.asInstanceOf[js.Any], existingItem = existingItem.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], originalInput = originalInput.asInstanceOf[js.Any], resolvedData = resolvedData.asInstanceOf[js.Any], updatedItem = updatedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveInputHooksOptions[Record]]
  }
  @scala.inline
  implicit class ResolveInputHooksOptionsOps[Self <: ResolveInputHooksOptions[_], /* <: js.Object */ Record] (val x: Self with ResolveInputHooksOptions[Record]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFieldValidationError(value: String => js.Any): Self = this.set("addFieldValidationError", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setExistingItem(value: Record): Self = this.set("existingItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Query[Record]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalInput(value: js.Any): Self = this.set("originalInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedData(value: js.Any): Self = this.set("resolvedData", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedItem(value: Record): Self = this.set("updatedItem", value.asInstanceOf[js.Any])
  }
  
}

