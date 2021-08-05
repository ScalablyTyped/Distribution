package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridDetailExpandEvent
  extends StObject
     with GridEvent {
  
  var detailRow: js.UndefOr[JQuery] = js.undefined
  
  var masterRow: js.UndefOr[JQuery] = js.undefined
}
object GridDetailExpandEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridDetailExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailExpandEvent]
  }
  
  extension [Self <: GridDetailExpandEvent](x: Self) {
    
    inline def setDetailRow(value: JQuery): Self = StObject.set(x, "detailRow", value.asInstanceOf[js.Any])
    
    inline def setDetailRowUndefined: Self = StObject.set(x, "detailRow", js.undefined)
    
    inline def setMasterRow(value: JQuery): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
    
    inline def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
  }
}
