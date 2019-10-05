package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.TreeListModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListDragendEvent extends TreeListEvent {
  var destination: js.UndefOr[TreeListModel] = js.undefined
  var source: js.UndefOr[TreeListModel] = js.undefined
}

object TreeListDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeList,
    destination: TreeListModel = null,
    source: TreeListModel = null
  ): TreeListDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[TreeListDragendEvent]
  }
}

