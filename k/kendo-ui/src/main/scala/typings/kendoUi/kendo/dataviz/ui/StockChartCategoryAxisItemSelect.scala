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
  
  @scala.inline
  def apply(): StockChartCategoryAxisItemSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemSelect]
  }
  
  @scala.inline
  implicit class StockChartCategoryAxisItemSelectMutableBuilder[Self <: StockChartCategoryAxisItemSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: String | Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMousewheel(value: StockChartCategoryAxisItemSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    @scala.inline
    def setTo(value: String | Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
