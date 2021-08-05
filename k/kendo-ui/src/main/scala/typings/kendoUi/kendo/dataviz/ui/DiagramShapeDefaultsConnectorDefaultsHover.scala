package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsConnectorDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeDefaultsConnectorDefaultsHoverStroke] = js.undefined
}
object DiagramShapeDefaultsConnectorDefaultsHover {
  
  inline def apply(): DiagramShapeDefaultsConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHover]
  }
  
  extension [Self <: DiagramShapeDefaultsConnectorDefaultsHover](x: Self) {
    
    inline def setFill(value: String | DiagramShapeDefaultsConnectorDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | DiagramShapeDefaultsConnectorDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
