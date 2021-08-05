package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartCategoryAxisItemSelectMousewheel extends StObject {
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var zoom: js.UndefOr[String] = js.undefined
}
object StockChartCategoryAxisItemSelectMousewheel {
  
  inline def apply(): StockChartCategoryAxisItemSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartCategoryAxisItemSelectMousewheel]
  }
  
  extension [Self <: StockChartCategoryAxisItemSelectMousewheel](x: Self) {
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
