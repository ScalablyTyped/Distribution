package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartLegendInactiveItems extends StObject {
  
  var labels: js.UndefOr[StockChartLegendInactiveItemsLabels] = js.undefined
  
  var markers: js.UndefOr[StockChartLegendInactiveItemsMarkers] = js.undefined
}
object StockChartLegendInactiveItems {
  
  inline def apply(): StockChartLegendInactiveItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartLegendInactiveItems]
  }
  
  extension [Self <: StockChartLegendInactiveItems](x: Self) {
    
    inline def setLabels(value: StockChartLegendInactiveItemsLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMarkers(value: StockChartLegendInactiveItemsMarkers): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
  }
}
