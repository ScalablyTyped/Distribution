package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLayerDefaultsShapeStyle extends StObject {
  
  var fill: js.UndefOr[MapLayerDefaultsShapeStyleFill] = js.undefined
  
  var stroke: js.UndefOr[MapLayerDefaultsShapeStyleStroke] = js.undefined
}
object MapLayerDefaultsShapeStyle {
  
  inline def apply(): MapLayerDefaultsShapeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapLayerDefaultsShapeStyle]
  }
  
  extension [Self <: MapLayerDefaultsShapeStyle](x: Self) {
    
    inline def setFill(value: MapLayerDefaultsShapeStyleFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: MapLayerDefaultsShapeStyleStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
