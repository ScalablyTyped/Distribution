package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeConnectorHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeConnectorHoverFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramShapeConnectorHoverStroke] = js.undefined
}
object DiagramShapeConnectorHover {
  
  inline def apply(): DiagramShapeConnectorHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeConnectorHover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramShapeConnectorHover] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | DiagramShapeConnectorHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | DiagramShapeConnectorHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
