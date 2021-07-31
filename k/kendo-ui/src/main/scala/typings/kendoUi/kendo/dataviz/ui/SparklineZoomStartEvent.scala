package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineZoomStartEvent
  extends StObject
     with SparklineEvent {
  
  var axisRanges: js.UndefOr[js.Any] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}
object SparklineZoomStartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sparkline): SparklineZoomStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineZoomStartEvent]
  }
  
  @scala.inline
  implicit class SparklineZoomStartEventMutableBuilder[Self <: SparklineZoomStartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisRanges(value: js.Any): Self = StObject.set(x, "axisRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisRangesUndefined: Self = StObject.set(x, "axisRanges", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
  }
}
