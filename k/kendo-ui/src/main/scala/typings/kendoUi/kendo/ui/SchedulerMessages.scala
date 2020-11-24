package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerMessages extends js.Object {
  
  var allDay: js.UndefOr[String] = js.native
  
  var ariaEventLabel: js.UndefOr[String] = js.native
  
  var ariaSlotLabel: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[String] = js.native
  
  var date: js.UndefOr[String] = js.native
  
  var defaultRowText: js.UndefOr[String] = js.native
  
  var deleteWindowTitle: js.UndefOr[String] = js.native
  
  var destroy: js.UndefOr[String] = js.native
  
  var editable: js.UndefOr[SchedulerMessagesEditable] = js.native
  
  var editor: js.UndefOr[SchedulerMessagesEditor] = js.native
  
  var event: js.UndefOr[String] = js.native
  
  var next: js.UndefOr[String] = js.native
  
  var pdf: js.UndefOr[String] = js.native
  
  var previous: js.UndefOr[String] = js.native
  
  var recurrenceEditor: js.UndefOr[SchedulerMessagesRecurrenceEditor] = js.native
  
  var recurrenceMessages: js.UndefOr[SchedulerMessagesRecurrenceMessages] = js.native
  
  var save: js.UndefOr[String] = js.native
  
  var showFullDay: js.UndefOr[String] = js.native
  
  var showWorkDay: js.UndefOr[String] = js.native
  
  var time: js.UndefOr[String] = js.native
  
  var today: js.UndefOr[String] = js.native
  
  var views: js.UndefOr[SchedulerMessagesViews] = js.native
}
object SchedulerMessages {
  
  @scala.inline
  def apply(): SchedulerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerMessages]
  }
  
  @scala.inline
  implicit class SchedulerMessagesOps[Self <: SchedulerMessages] (val x: Self) extends AnyVal {
    
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
    def setAllDay(value: String): Self = this.set("allDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllDay: Self = this.set("allDay", js.undefined)
    
    @scala.inline
    def setAriaEventLabel(value: String): Self = this.set("ariaEventLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaEventLabel: Self = this.set("ariaEventLabel", js.undefined)
    
    @scala.inline
    def setAriaSlotLabel(value: String): Self = this.set("ariaSlotLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaSlotLabel: Self = this.set("ariaSlotLabel", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDefaultRowText(value: String): Self = this.set("defaultRowText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRowText: Self = this.set("defaultRowText", js.undefined)
    
    @scala.inline
    def setDeleteWindowTitle(value: String): Self = this.set("deleteWindowTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteWindowTitle: Self = this.set("deleteWindowTitle", js.undefined)
    
    @scala.inline
    def setDestroy(value: String): Self = this.set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEditable(value: SchedulerMessagesEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    
    @scala.inline
    def setEditor(value: SchedulerMessagesEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditor: Self = this.set("editor", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPdf(value: String): Self = this.set("pdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdf: Self = this.set("pdf", js.undefined)
    
    @scala.inline
    def setPrevious(value: String): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setRecurrenceEditor(value: SchedulerMessagesRecurrenceEditor): Self = this.set("recurrenceEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceEditor: Self = this.set("recurrenceEditor", js.undefined)
    
    @scala.inline
    def setRecurrenceMessages(value: SchedulerMessagesRecurrenceMessages): Self = this.set("recurrenceMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrenceMessages: Self = this.set("recurrenceMessages", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setShowFullDay(value: String): Self = this.set("showFullDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFullDay: Self = this.set("showFullDay", js.undefined)
    
    @scala.inline
    def setShowWorkDay(value: String): Self = this.set("showWorkDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWorkDay: Self = this.set("showWorkDay", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    
    @scala.inline
    def setToday(value: String): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
    
    @scala.inline
    def setViews(value: SchedulerMessagesViews): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
