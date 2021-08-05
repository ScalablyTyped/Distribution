package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramShapeHoverFill] = js.undefined
}
object DiagramShapeHover {
  
  inline def apply(): DiagramShapeHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeHover]
  }
  
  extension [Self <: DiagramShapeHover](x: Self) {
    
    inline def setFill(value: String | DiagramShapeHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
