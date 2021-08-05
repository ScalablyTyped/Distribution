package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeConnectorDefaultsHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorDefaultsHoverStroke] = js.undefined
}
object DiagramShapeConnectorDefaultsHover {
  
  inline def apply(): DiagramShapeConnectorDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnectorDefaultsHover]
  }
  
  extension [Self <: DiagramShapeConnectorDefaultsHover](x: Self) {
    
    inline def setFill(value: String | DiagramShapeConnectorDefaultsHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | DiagramShapeConnectorDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
