package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridDetailExpandEvent extends GridEvent {
  
  var detailRow: js.UndefOr[JQuery] = js.native
  
  var masterRow: js.UndefOr[JQuery] = js.native
}
object GridDetailExpandEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridDetailExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailExpandEvent]
  }
  
  @scala.inline
  implicit class GridDetailExpandEventMutableBuilder[Self <: GridDetailExpandEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetailRow(value: JQuery): Self = StObject.set(x, "detailRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailRowUndefined: Self = StObject.set(x, "detailRow", js.undefined)
    
    @scala.inline
    def setMasterRow(value: JQuery): Self = StObject.set(x, "masterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterRowUndefined: Self = StObject.set(x, "masterRow", js.undefined)
  }
}
