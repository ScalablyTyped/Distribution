package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableOptions extends StObject {
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[JQuery] = js.undefined
  
  var cursorOffset: js.UndefOr[js.Any] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var dragcancel: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var dragend: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var dragstart: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[js.Function | JQuery] = js.undefined
  
  var hold: js.UndefOr[js.Function1[/* e */ DraggableEvent, Unit]] = js.undefined
  
  var holdToDrag: js.UndefOr[Boolean] = js.undefined
  
  var ignore: js.UndefOr[String] = js.undefined
}
object DraggableOptions {
  
  @scala.inline
  def apply(): DraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableOptions]
  }
  
  @scala.inline
  implicit class DraggableOptionsMutableBuilder[Self <: DraggableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCursorOffset(value: js.Any): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDragcancel(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "dragcancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragcancelUndefined: Self = StObject.set(x, "dragcancel", js.undefined)
    
    @scala.inline
    def setDragend(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "dragend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragendUndefined: Self = StObject.set(x, "dragend", js.undefined)
    
    @scala.inline
    def setDragstart(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "dragstart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragstartUndefined: Self = StObject.set(x, "dragstart", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setHint(value: js.Function | JQuery): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setHold(value: /* e */ DraggableEvent => Unit): Self = StObject.set(x, "hold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoldToDrag(value: Boolean): Self = StObject.set(x, "holdToDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldToDragUndefined: Self = StObject.set(x, "holdToDrag", js.undefined)
    
    @scala.inline
    def setHoldUndefined: Self = StObject.set(x, "hold", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
  }
}
