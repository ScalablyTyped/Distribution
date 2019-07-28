package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragstartEvent extends TreeViewEvent {
  var sourceNode: js.UndefOr[Element] = js.undefined
}

object TreeViewDragstartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeView,
    sourceNode: Element = null
  ): TreeViewDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    __obj.asInstanceOf[TreeViewDragstartEvent]
  }
}

