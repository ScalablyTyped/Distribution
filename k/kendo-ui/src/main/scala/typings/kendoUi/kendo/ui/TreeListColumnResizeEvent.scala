package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeListColumnResizeEvent
  extends StObject
     with TreeListEvent {
  
  var column: js.UndefOr[Any] = js.undefined
  
  var newWidth: js.UndefOr[Double] = js.undefined
  
  var oldWidth: js.UndefOr[Double] = js.undefined
}
object TreeListColumnResizeEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeList): TreeListColumnResizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeListColumnResizeEvent]
  }
  
  extension [Self <: TreeListColumnResizeEvent](x: Self) {
    
    inline def setColumn(value: Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
    
    inline def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
    
    inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
    
    inline def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
  }
}
