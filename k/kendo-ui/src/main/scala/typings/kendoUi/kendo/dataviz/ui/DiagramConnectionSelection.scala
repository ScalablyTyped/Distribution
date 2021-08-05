package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionSelection extends StObject {
  
  var handles: js.UndefOr[DiagramConnectionSelectionHandles] = js.undefined
}
object DiagramConnectionSelection {
  
  inline def apply(): DiagramConnectionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionSelection]
  }
  
  extension [Self <: DiagramConnectionSelection](x: Self) {
    
    inline def setHandles(value: DiagramConnectionSelectionHandles): Self = StObject.set(x, "handles", value.asInstanceOf[js.Any])
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
  }
}
