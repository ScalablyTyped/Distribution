package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesHoverEvent
  extends StObject
     with ChartEvent {
  
  var category: js.UndefOr[Any] = js.undefined
  
  var categoryPoints: js.UndefOr[Any] = js.undefined
  
  var dataItem: js.UndefOr[Any] = js.undefined
  
  var element: js.UndefOr[Any] = js.undefined
  
  var originalEvent: js.UndefOr[Any] = js.undefined
  
  var percentage: js.UndefOr[Any] = js.undefined
  
  var series: js.UndefOr[ChartSeriesHoverEventSeries] = js.undefined
  
  var stackValue: js.UndefOr[Any] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object ChartSeriesHoverEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Chart): ChartSeriesHoverEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesHoverEvent]
  }
  
  extension [Self <: ChartSeriesHoverEvent](x: Self) {
    
    inline def setCategory(value: Any): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryPoints(value: Any): Self = StObject.set(x, "categoryPoints", value.asInstanceOf[js.Any])
    
    inline def setCategoryPointsUndefined: Self = StObject.set(x, "categoryPoints", js.undefined)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDataItem(value: Any): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
    
    inline def setDataItemUndefined: Self = StObject.set(x, "dataItem", js.undefined)
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOriginalEvent(value: Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    
    inline def setPercentage(value: Any): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setSeries(value: ChartSeriesHoverEventSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setStackValue(value: Any): Self = StObject.set(x, "stackValue", value.asInstanceOf[js.Any])
    
    inline def setStackValueUndefined: Self = StObject.set(x, "stackValue", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
