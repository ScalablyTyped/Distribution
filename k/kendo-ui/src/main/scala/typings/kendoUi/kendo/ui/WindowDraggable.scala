package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowDraggable extends StObject {
  
  var axis: js.UndefOr[String] = js.undefined
  
  var containment: js.UndefOr[js.Any | String] = js.undefined
  
  var dragHandle: js.UndefOr[js.Any | String] = js.undefined
}
object WindowDraggable {
  
  inline def apply(): WindowDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowDraggable]
  }
  
  extension [Self <: WindowDraggable](x: Self) {
    
    inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setContainment(value: js.Any | String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
    
    inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
    
    inline def setDragHandle(value: js.Any | String): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
    
    inline def setDragHandleUndefined: Self = StObject.set(x, "dragHandle", js.undefined)
  }
}
