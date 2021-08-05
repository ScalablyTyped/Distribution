package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorSeriesItemStack extends StObject {
  
  var group: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StockChartNavigatorSeriesItemStack {
  
  inline def apply(): StockChartNavigatorSeriesItemStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorSeriesItemStack]
  }
  
  extension [Self <: StockChartNavigatorSeriesItemStack](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
