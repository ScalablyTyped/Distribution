package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemMarkersFrom extends StObject {
  
  var background: js.UndefOr[String | js.Function] = js.undefined
  
  var border: js.UndefOr[js.Function | ChartSeriesItemMarkersFromBorder] = js.undefined
  
  var rotation: js.UndefOr[Double | js.Function] = js.undefined
  
  var size: js.UndefOr[Double | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String | js.Function] = js.undefined
  
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
  
  var visual: js.UndefOr[js.Function] = js.undefined
}
object ChartSeriesItemMarkersFrom {
  
  inline def apply(): ChartSeriesItemMarkersFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemMarkersFrom]
  }
  
  extension [Self <: ChartSeriesItemMarkersFrom](x: Self) {
    
    inline def setBackground(value: String | js.Function): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: js.Function | ChartSeriesItemMarkersFromBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setRotation(value: Double | js.Function): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String | js.Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean | js.Function): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setVisual(value: js.Function): Self = StObject.set(x, "visual", value.asInstanceOf[js.Any])
    
    inline def setVisualUndefined: Self = StObject.set(x, "visual", js.undefined)
  }
}
