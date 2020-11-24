package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridDetailCollapseEvent extends GridEvent {
  
  var detailRow: js.UndefOr[JQuery] = js.native
  
  var masterRow: js.UndefOr[JQuery] = js.native
}
object GridDetailCollapseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Grid): GridDetailCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridDetailCollapseEvent]
  }
  
  @scala.inline
  implicit class GridDetailCollapseEventOps[Self <: GridDetailCollapseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetailRow(value: JQuery): Self = this.set("detailRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailRow: Self = this.set("detailRow", js.undefined)
    
    @scala.inline
    def setMasterRow(value: JQuery): Self = this.set("masterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterRow: Self = this.set("masterRow", js.undefined)
  }
}
