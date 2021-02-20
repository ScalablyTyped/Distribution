package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramEditableResizeHandles extends StObject {
  
  var fill: js.UndefOr[String | DiagramEditableResizeHandlesFill] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[DiagramEditableResizeHandlesHover] = js.native
  
  var stroke: js.UndefOr[DiagramEditableResizeHandlesStroke] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DiagramEditableResizeHandles {
  
  @scala.inline
  def apply(): DiagramEditableResizeHandles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResizeHandles]
  }
  
  @scala.inline
  implicit class DiagramEditableResizeHandlesMutableBuilder[Self <: DiagramEditableResizeHandles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramEditableResizeHandlesFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHover(value: DiagramEditableResizeHandlesHover): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramEditableResizeHandlesStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
