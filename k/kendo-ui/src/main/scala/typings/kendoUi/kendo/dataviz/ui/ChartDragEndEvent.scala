package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartDragEndEvent
  extends StObject
     with ChartEvent {
  
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}
object ChartDragEndEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartDragEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDragEndEvent]
  }
  
  extension [Self <: ChartDragEndEvent](x: Self) {
    
    inline def setAxisRanges(value: js.Any): Self = StObject.set(x, "axisRanges", value.asInstanceOf[js.Any])
    
    inline def setAxisRangesUndefined: Self = StObject.set(x, "axisRanges", js.undefined)
    
    inline def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
