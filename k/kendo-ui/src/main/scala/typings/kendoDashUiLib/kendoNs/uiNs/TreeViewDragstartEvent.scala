package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragstartEvent extends TreeViewEvent {
  var sourceNode: js.UndefOr[stdLib.Element] = js.undefined
}

object TreeViewDragstartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    sourceNode: stdLib.Element = null
  ): TreeViewDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    __obj.asInstanceOf[TreeViewDragstartEvent]
  }
}

