package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerStyleFill] = js.undefined
  
  var stroke: js.UndefOr[MapLayerStyleStroke] = js.undefined
}
object MapLayerStyle {
  
  inline def apply(): MapLayerStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerStyle]
  }
  
  extension [Self <: MapLayerStyle](x: Self) {
    
    inline def setFill(value: MapLayerStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: MapLayerStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
