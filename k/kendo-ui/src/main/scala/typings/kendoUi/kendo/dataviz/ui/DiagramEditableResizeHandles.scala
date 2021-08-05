package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableResizeHandles extends StObject {
  
  var fill: js.UndefOr[String | DiagramEditableResizeHandlesFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hover: js.UndefOr[DiagramEditableResizeHandlesHover] = js.undefined
  
  var stroke: js.UndefOr[DiagramEditableResizeHandlesStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramEditableResizeHandles {
  
  inline def apply(): DiagramEditableResizeHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResizeHandles]
  }
  
  extension [Self <: DiagramEditableResizeHandles](x: Self) {
    
    inline def setFill(value: String | DiagramEditableResizeHandlesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHover(value: DiagramEditableResizeHandlesHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setStroke(value: DiagramEditableResizeHandlesStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
