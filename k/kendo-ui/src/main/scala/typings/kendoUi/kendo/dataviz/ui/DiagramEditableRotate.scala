package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableRotate extends StObject {
  
  var fill: js.UndefOr[DiagramEditableRotateFill] = js.undefined
  
  var stroke: js.UndefOr[DiagramEditableRotateStroke] = js.undefined
}
object DiagramEditableRotate {
  
  inline def apply(): DiagramEditableRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableRotate]
  }
  
  extension [Self <: DiagramEditableRotate](x: Self) {
    
    inline def setFill(value: DiagramEditableRotateFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: DiagramEditableRotateStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
