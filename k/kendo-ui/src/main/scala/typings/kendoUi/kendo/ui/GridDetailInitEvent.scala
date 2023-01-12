package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.kendo.data.ObservableObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridDetailInitEvent
  extends StObject
     with GridEvent {
  
  var data: js.UndefOr[ObservableObject] = js.undefined
  
  var detailCell: js.UndefOr[JQuery] = js.undefined
  
  var detailRow: js.UndefOr[JQuery] = js.undefined
  
  var masterRow: js.UndefOr[JQuery] = js.undefined
}
object GridDetailInitEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridDetailInitEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailInitEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridDetailInitEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: ObservableObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDetailCell(value: JQuery): Self = StObject.set(x, "detailCell", value.asInstanceOf[js.Any])
    
    inline def setDetailCellUndefined: Self = StObject.set(x, "detailCell", js.undefined)
    
    inline def setDetailRow(value: JQuery): Self = StObject.set(x, "detailRow", value.asInstanceOf[js.Any])
    
    inline def setDetailRowUndefined: Self = StObject.set(x, "detailRow", js.undefined)
    
    inline def setMasterRow(value: JQuery): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
    
    inline def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
  }
}
