package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListCollapseEvent extends TreeListEvent {
  var model: js.UndefOr[TreeListModel] = js.undefined
}

object TreeListCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    model: TreeListModel = null
  ): TreeListCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[TreeListCollapseEvent]
  }
}

