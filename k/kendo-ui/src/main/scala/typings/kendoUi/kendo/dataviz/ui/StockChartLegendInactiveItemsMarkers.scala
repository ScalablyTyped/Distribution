package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartLegendInactiveItemsMarkers extends StObject {
  
  var color: js.UndefOr[String] = js.native
}
object StockChartLegendInactiveItemsMarkers {
  
  @scala.inline
  def apply(): StockChartLegendInactiveItemsMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegendInactiveItemsMarkers]
  }
  
  @scala.inline
  implicit class StockChartLegendInactiveItemsMarkersMutableBuilder[Self <: StockChartLegendInactiveItemsMarkers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
