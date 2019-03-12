package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragendEvent extends TreeViewEvent {
  var destinationNode: js.UndefOr[stdLib.Element] = js.undefined
  var dropPosition: js.UndefOr[java.lang.String] = js.undefined
  var sourceNode: js.UndefOr[stdLib.Element] = js.undefined
}

object TreeViewDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: TreeView,
    destinationNode: stdLib.Element = null,
    dropPosition: java.lang.String = null,
    sourceNode: stdLib.Element = null
  ): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (destinationNode != null) __obj.updateDynamic("destinationNode")(destinationNode)
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
}

