package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartSeriesDefaultsStack extends StObject {
  
  var `type`: js.UndefOr[String] = js.native
}
object StockChartSeriesDefaultsStack {
  
  @scala.inline
  def apply(): StockChartSeriesDefaultsStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesDefaultsStack]
  }
  
  @scala.inline
  implicit class StockChartSeriesDefaultsStackMutableBuilder[Self <: StockChartSeriesDefaultsStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
