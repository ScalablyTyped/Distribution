package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSelectEndEvent
  extends StObject
     with ChartEvent {
  
  var axis: js.UndefOr[js.Any] = js.undefined
  
  var from: js.UndefOr[js.Any] = js.undefined
  
  var to: js.UndefOr[js.Any] = js.undefined
}
object ChartSelectEndEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartSelectEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSelectEndEvent]
  }
  
  @scala.inline
  implicit class ChartSelectEndEventMutableBuilder[Self <: ChartSelectEndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setFrom(value: js.Any): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setTo(value: js.Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
