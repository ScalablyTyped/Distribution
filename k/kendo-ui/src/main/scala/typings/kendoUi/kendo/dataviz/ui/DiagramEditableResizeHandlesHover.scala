package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableResizeHandlesHover extends StObject {
  
  var fill: js.UndefOr[String | DiagramEditableResizeHandlesHoverFill] = js.undefined
  
  var stroke: js.UndefOr[DiagramEditableResizeHandlesHoverStroke] = js.undefined
}
object DiagramEditableResizeHandlesHover {
  
  @scala.inline
  def apply(): DiagramEditableResizeHandlesHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResizeHandlesHover]
  }
  
  @scala.inline
  implicit class DiagramEditableResizeHandlesHoverMutableBuilder[Self <: DiagramEditableResizeHandlesHover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String | DiagramEditableResizeHandlesHoverFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setStroke(value: DiagramEditableResizeHandlesHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
