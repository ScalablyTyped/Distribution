package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetAreaDragleaveEvent extends DropTargetAreaEvent {
  
  var draggable: js.UndefOr[Draggable] = js.native
  
  var dropTarget: js.UndefOr[JQuery] = js.native
  
  var target: js.UndefOr[Element] = js.native
}
object DropTargetAreaDragleaveEvent {
  
  @scala.inline
  def apply(sender: DropTargetArea): DropTargetAreaDragleaveEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaDragleaveEvent]
  }
  
  @scala.inline
  implicit class DropTargetAreaDragleaveEventOps[Self <: DropTargetAreaDragleaveEvent] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
