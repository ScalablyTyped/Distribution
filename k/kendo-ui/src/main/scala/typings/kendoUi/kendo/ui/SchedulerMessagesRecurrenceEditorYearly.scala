package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessagesRecurrenceEditorYearly extends js.Object {
  
  var interval: js.UndefOr[String] = js.native
  
  var of: js.UndefOr[String] = js.native
  
  var repeatEvery: js.UndefOr[String] = js.native
  
  var repeatOn: js.UndefOr[String] = js.native
}
object SchedulerMessagesRecurrenceEditorYearly {
  
  @scala.inline
  def apply(): SchedulerMessagesRecurrenceEditorYearly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessagesRecurrenceEditorYearly]
  }
  
  @scala.inline
  implicit class SchedulerMessagesRecurrenceEditorYearlyOps[Self <: SchedulerMessagesRecurrenceEditorYearly] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setOf(value: String): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setRepeatEvery(value: String): Self = this.set("repeatEvery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatEvery: Self = this.set("repeatEvery", js.undefined)
    
    @scala.inline
    def setRepeatOn(value: String): Self = this.set("repeatOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatOn: Self = this.set("repeatOn", js.undefined)
  }
}
