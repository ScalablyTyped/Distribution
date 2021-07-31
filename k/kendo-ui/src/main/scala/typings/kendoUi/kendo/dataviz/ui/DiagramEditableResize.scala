package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableResize extends StObject {
  
  var handles: js.UndefOr[DiagramEditableResizeHandles] = js.undefined
}
object DiagramEditableResize {
  
  @scala.inline
  def apply(): DiagramEditableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResize]
  }
  
  @scala.inline
  implicit class DiagramEditableResizeMutableBuilder[Self <: DiagramEditableResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandles(value: DiagramEditableResizeHandles): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
