package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragEvent extends TreeViewEvent {
  var dropTarget: js.UndefOr[stdLib.Element] = js.undefined
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var setStatusClass: js.UndefOr[js.Function] = js.undefined
  var sourceNode: js.UndefOr[stdLib.Element] = js.undefined
  var statusClass: js.UndefOr[java.lang.String] = js.undefined
}

object TreeViewDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    dropTarget: stdLib.Element = null,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null,
    setStatusClass: js.Function = null,
    sourceNode: stdLib.Element = null,
    statusClass: java.lang.String = null
  ): TreeViewDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (setStatusClass != null) __obj.updateDynamic("setStatusClass")(setStatusClass)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    if (statusClass != null) __obj.updateDynamic("statusClass")(statusClass)
    __obj.asInstanceOf[TreeViewDragEvent]
  }
}

