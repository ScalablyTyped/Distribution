package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropTargetEvent extends JQueryEventObject {
  var draggable: js.UndefOr[Draggable] = js.native
  var dropTarget: js.UndefOr[JQuery] = js.native
  var sender: js.UndefOr[DropTarget] = js.native
}

object DropTargetEvent {
  @scala.inline
  def apply(): DropTargetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetEvent]
  }
  @scala.inline
  implicit class DropTargetEventOps[Self <: DropTargetEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDraggable(value: Draggable): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDropTarget(value: JQuery): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    @scala.inline
    def setSender(value: DropTarget): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSender: Self = this.set("sender", js.undefined)
  }
  
}

