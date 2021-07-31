package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortableOptions extends StObject {
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var axis: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ SortableCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ SortableChangeEvent, Unit]] = js.undefined
  
  var connectWith: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String | JQuery] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var cursorOffset: js.UndefOr[SortableCursorOffset] = js.undefined
  
  var disabled: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[js.Function1[/* e */ SortableEndEvent, Unit]] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var handler: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[js.Function | String | JQuery] = js.undefined
  
  var holdToDrag: js.UndefOr[Boolean] = js.undefined
  
  var ignore: js.UndefOr[String] = js.undefined
  
  var move: js.UndefOr[js.Function1[/* e */ SortableMoveEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var placeholder: js.UndefOr[js.Function | String | JQuery] = js.undefined
  
  var start: js.UndefOr[js.Function1[/* e */ SortableStartEvent, Unit]] = js.undefined
}
object SortableOptions {
  
  @scala.inline
  def apply(): SortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions]
  }
  
  @scala.inline
  implicit class SortableOptionsMutableBuilder[Self <: SortableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ SortableCancelEvent => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ SortableChangeEvent => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setConnectWith(value: String): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
    
    @scala.inline
    def setContainer(value: String | JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorOffset(value: SortableCursorOffset): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEnd(value: /* e */ SortableEndEvent => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setHandler(value: String): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    @scala.inline
    def setHint(value: js.Function | String | JQuery): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setHoldToDrag(value: Boolean): Self = StObject.set(x, "holdToDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldToDragUndefined: Self = StObject.set(x, "holdToDrag", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setMove(value: /* e */ SortableMoveEvent => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: js.Function | String | JQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setStart(value: /* e */ SortableStartEvent => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
