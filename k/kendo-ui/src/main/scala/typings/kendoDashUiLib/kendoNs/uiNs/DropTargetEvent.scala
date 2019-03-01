package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetEvent
  extends kendoDashUiLib.JQueryEventObject {
  var draggable: js.UndefOr[Draggable] = js.undefined
  var dropTarget: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var sender: js.UndefOr[DropTarget] = js.undefined
}

object DropTargetEvent {
  @scala.inline
  def apply(draggable: Draggable = null, dropTarget: kendoDashUiLib.JQuery = null, sender: DropTarget = null): DropTargetEvent = {
    val __obj = js.Dynamic.literal()
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[DropTargetEvent]
  }
}

