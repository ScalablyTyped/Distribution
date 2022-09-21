package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorSelect extends StObject {
  
  var from: js.UndefOr[js.Date] = js.undefined
  
  var mousewheel: js.UndefOr[Boolean | StockChartNavigatorSelectMousewheel] = js.undefined
  
  var to: js.UndefOr[js.Date] = js.undefined
}
object StockChartNavigatorSelect {
  
  inline def apply(): StockChartNavigatorSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSelect]
  }
  
  extension [Self <: StockChartNavigatorSelect](x: Self) {
    
    inline def setFrom(value: js.Date): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setMousewheel(value: Boolean | StockChartNavigatorSelectMousewheel): Self = StObject.set(x, "mousewheel", value.asInstanceOf[js.Any])
    
    inline def setMousewheelUndefined: Self = StObject.set(x, "mousewheel", js.undefined)
    
    inline def setTo(value: js.Date): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
