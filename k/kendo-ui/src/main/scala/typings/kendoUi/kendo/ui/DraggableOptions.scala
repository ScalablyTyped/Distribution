package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableOptions extends js.Object {
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var axis: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[JQuery] = js.native
  
  var cursorOffset: js.UndefOr[js.Any] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var dragcancel: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var dragend: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var dragstart: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[js.Function | JQuery] = js.native
  
  var hold: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.native
  
  var holdToDrag: js.UndefOr[Boolean] = js.native
  
  var ignore: js.UndefOr[String] = js.native
}
object DraggableOptions {
  
  @scala.inline
  def apply(): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOptions]
  }
  
  @scala.inline
  implicit class DraggableOptionsOps[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCursorOffset(value: js.Any): Self = this.set("cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorOffset: Self = this.set("cursorOffset", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DraggableEvent => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragcancel(value: /* e */ DraggableEvent => Unit): Self = this.set("dragcancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragcancel: Self = this.set("dragcancel", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ DraggableEvent => Unit): Self = this.set("dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragend: Self = this.set("dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ DraggableEvent => Unit): Self = this.set("dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragstart: Self = this.set("dragstart", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHint(value: js.Function | JQuery): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setHold(value: /* e */ DraggableEvent => Unit): Self = this.set("hold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHold: Self = this.set("hold", js.undefined)
    
    @scala.inline
    def setHoldToDrag(value: Boolean): Self = this.set("holdToDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoldToDrag: Self = this.set("holdToDrag", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
  }
}
