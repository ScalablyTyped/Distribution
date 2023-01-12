package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionSelectionHandles extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionSelectionHandlesFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[DiagramConnectionSelectionHandlesStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramConnectionSelectionHandles {
  
  inline def apply(): DiagramConnectionSelectionHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelectionHandles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagramConnectionSelectionHandles] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | DiagramConnectionSelectionHandlesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setStroke(value: DiagramConnectionSelectionHandlesStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
