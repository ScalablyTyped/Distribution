package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartLegendInactiveItems extends StObject {
  
  var labels: js.UndefOr[StockChartLegendInactiveItemsLabels] = js.native
  
  var markers: js.UndefOr[StockChartLegendInactiveItemsMarkers] = js.native
}
object StockChartLegendInactiveItems {
  
  @scala.inline
  def apply(): StockChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegendInactiveItems]
  }
  
  @scala.inline
  implicit class StockChartLegendInactiveItemsMutableBuilder[Self <: StockChartLegendInactiveItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(value: StockChartLegendInactiveItemsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMarkers(value: StockChartLegendInactiveItemsMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
  }
}
