package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesDefaultsStack extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StockChartSeriesDefaultsStack {
  
  inline def apply(): StockChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesDefaultsStack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockChartSeriesDefaultsStack] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
