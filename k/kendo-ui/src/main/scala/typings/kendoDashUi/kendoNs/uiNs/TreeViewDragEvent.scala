package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragEvent extends TreeViewEvent {
  var dropTarget: js.UndefOr[Element] = js.undefined
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var setStatusClass: js.UndefOr[js.Function] = js.undefined
  var sourceNode: js.UndefOr[Element] = js.undefined
  var statusClass: js.UndefOr[String] = js.undefined
}

object TreeViewDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: TreeView,
    dropTarget: Element = null,
    pageX: Int | Double = null,
    pageY: Int | Double = null,
    setStatusClass: js.Function = null,
    sourceNode: Element = null,
    statusClass: String = null
  ): TreeViewDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    if (setStatusClass != null) __obj.updateDynamic("setStatusClass")(setStatusClass)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode)
    if (statusClass != null) __obj.updateDynamic("statusClass")(statusClass)
    __obj.asInstanceOf[TreeViewDragEvent]
  }
}

