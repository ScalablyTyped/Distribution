package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventReminder extends js.Object {
  
  /**
    * The method used by this reminder. Possible values are:
    * - "email" - Reminders are sent via email.
    * - "popup" - Reminders are sent via a UI popup.
    * Required when adding a reminder.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * Number of minutes before the start of the event when the reminder should trigger. Valid values are between 0 and 40320 (4 weeks in minutes).
    * Required when adding a reminder.
    */
  var minutes: js.UndefOr[Double] = js.native
}
object EventReminder {
  
  @scala.inline
  def apply(): EventReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventReminder]
  }
  
  @scala.inline
  implicit class EventReminderOps[Self <: EventReminder] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
  }
}
