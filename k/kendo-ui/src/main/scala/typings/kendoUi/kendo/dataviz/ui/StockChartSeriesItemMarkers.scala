package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartSeriesItemMarkers extends StObject {
  
  var background: js.UndefOr[String | js.Function] = js.undefined
  
  var border: js.UndefOr[js.Function | StockChartSeriesItemMarkersBorder] = js.undefined
  
  var rotation: js.UndefOr[Double | js.Function] = js.undefined
  
  var size: js.UndefOr[Double | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String | js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
}
object StockChartSeriesItemMarkers {
  
  @scala.inline
  def apply(): StockChartSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartSeriesItemMarkers]
  }
  
  @scala.inline
  implicit class StockChartSeriesItemMarkersMutableBuilder[Self <: StockChartSeriesItemMarkers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String | js.Function): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: js.Function | StockChartSeriesItemMarkersBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setRotation(value: Double | js.Function): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
