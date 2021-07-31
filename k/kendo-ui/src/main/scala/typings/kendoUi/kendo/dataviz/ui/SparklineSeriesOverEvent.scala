package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SparklineSeriesOverEvent
  extends StObject
     with SparklineEvent {
  
  var category: js.UndefOr[js.Any] = js.undefined
  
  var dataItem: js.UndefOr[js.Any] = js.undefined
  
  var element: js.UndefOr[js.Any] = js.undefined
  
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  
  var percentage: js.UndefOr[js.Any] = js.undefined
  
  var series: js.UndefOr[SparklineSeriesOverEventSeries] = js.undefined
  
  var stackValue: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object SparklineSeriesOverEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Sparkline): SparklineSeriesOverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesOverEvent]
  }
  
  @scala.inline
  implicit class SparklineSeriesOverEventMutableBuilder[Self <: SparklineSeriesOverEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: js.Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setDataItem(value: js.Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    @scala.inline
    def setPercentage(value: js.Any): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    @scala.inline
    def setSeries(value: SparklineSeriesOverEventSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setStackValue(value: js.Any): Self = StObject.set(x, "stackValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackValueUndefined: Self = StObject.set(x, "stackValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
