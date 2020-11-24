package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarNotification extends js.Object {
  
  /**
    * The method used to deliver the notification. The possible value is:
    * - "email" - Notifications are sent via email.
    * Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.native
  
  /**
    * The type of notification. Possible values are:
    * - "eventCreation" - Notification sent when a new event is put on the calendar.
    * - "eventChange" - Notification sent when an event is changed.
    * - "eventCancellation" - Notification sent when an event is cancelled.
    * - "eventResponse" - Notification sent when an attendee responds to the event invitation.
    * - "agenda" - An agenda with the events of the day (sent out in the morning).
    * Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.native
}
object CalendarNotification {
  
  @scala.inline
  def apply(): CalendarNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarNotification]
  }
  
  @scala.inline
  implicit class CalendarNotificationOps[Self <: CalendarNotification] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
