package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaDropEvent extends DropTargetAreaEvent {
  var draggable: js.UndefOr[Draggable] = js.undefined
  var dropTarget: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
}

object DropTargetAreaDropEvent {
  @scala.inline
  def apply(
    sender: DropTargetArea,
    draggable: Draggable = null,
    dropTarget: kendoDashUiLib.JQuery = null,
    target: stdLib.Element = null
  ): DropTargetAreaDropEvent = {
    val __obj = js.Dynamic.literal(sender = sender)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DropTargetAreaDropEvent]
  }
}

