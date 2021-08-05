package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsSelectionHandles extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionDefaultsSelectionHandlesFill] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsSelectionHandlesStroke] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DiagramConnectionDefaultsSelectionHandles {
  
  inline def apply(): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
  
  extension [Self <: DiagramConnectionDefaultsSelectionHandles](x: Self) {
    
    inline def setFill(value: String | DiagramConnectionDefaultsSelectionHandlesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setStroke(value: DiagramConnectionDefaultsSelectionHandlesStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
