package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramEditableResize extends StObject {
  
  var handles: js.UndefOr[DiagramEditableResizeHandles] = js.undefined
}
object DiagramEditableResize {
  
  inline def apply(): DiagramEditableResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramEditableResize]
  }
  
  extension [Self <: DiagramEditableResize](x: Self) {
    
    inline def setHandles(value: DiagramEditableResizeHandles): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
