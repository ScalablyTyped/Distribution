package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetAreaDragenterEvent extends DropTargetAreaEvent {
  var draggable: js.UndefOr[Draggable] = js.undefined
  var dropTarget: js.UndefOr[JQuery] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object DropTargetAreaDragenterEvent {
  @scala.inline
  def apply(
    sender: DropTargetArea,
    draggable: Draggable = null,
    dropTarget: JQuery = null,
    target: Element = null
  ): DropTargetAreaDragenterEvent = {
    val __obj = js.Dynamic.literal(sender = sender)
    if (draggable != null) __obj.updateDynamic("draggable")(draggable)
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DropTargetAreaDragenterEvent]
  }
}

