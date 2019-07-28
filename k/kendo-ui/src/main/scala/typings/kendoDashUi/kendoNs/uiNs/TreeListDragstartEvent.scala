package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDragstartEvent extends TreeListEvent {
  var source: js.UndefOr[TreeListModel] = js.undefined
}

object TreeListDragstartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    source: TreeListModel = null
  ): TreeListDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[TreeListDragstartEvent]
  }
}

