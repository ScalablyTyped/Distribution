package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesEditable extends js.Object {
  
  var confirmation: js.UndefOr[String] = js.native
}
object SchedulerMessagesEditable {
  
  @scala.inline
  def apply(): SchedulerMessagesEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesEditable]
  }
  
  @scala.inline
  implicit class SchedulerMessagesEditableOps[Self <: SchedulerMessagesEditable] (val x: Self) extends AnyVal {
    
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
    def setConfirmation(value: String): Self = this.set("confirmation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmation: Self = this.set("confirmation", js.undefined)
  }
}
