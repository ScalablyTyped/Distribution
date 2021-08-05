package typings.kendoUi.kendo.dataviz.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartCategoryAxisItemSelect extends StObject {
  
  var from: js.UndefOr[String | Date] = js.undefined
  
  var max: js.UndefOr[js.Any] = js.undefined
  
  var min: js.UndefOr[js.Any] = js.undefined
  
  var mousewheel: js.UndefOr[StockChartCategoryAxisItemSelectMousewheel] = js.undefined
  
  var to: js.UndefOr[String | Date] = js.undefined
}
object StockChartCategoryAxisItemSelect {
  
  inline def apply(): StockChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemSelect]
  }
  
  extension [Self <: StockChartCategoryAxisItemSelect](x: Self) {
    
    inline def setFrom(value: String | Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMousewheel(value: StockChartCategoryAxisItemSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setTo(value: String | Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
