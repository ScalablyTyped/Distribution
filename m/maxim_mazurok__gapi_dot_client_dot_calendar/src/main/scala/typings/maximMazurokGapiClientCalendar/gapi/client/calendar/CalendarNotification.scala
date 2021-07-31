package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarNotification extends StObject {
  
  /**
    * The method used to deliver the notification. The possible value is:
    * - "email" - Notifications are sent via email.
    * Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The type of notification. Possible values are:
    * - "eventCreation" - Notification sent when a new event is put on the calendar.
    * - "eventChange" - Notification sent when an event is changed.
    * - "eventCancellation" - Notification sent when an event is cancelled.
    * - "eventResponse" - Notification sent when an attendee responds to the event invitation.
    * - "agenda" - An agenda with the events of the day (sent out in the morning).
    * Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object CalendarNotification {
  
  @scala.inline
  def apply(): CalendarNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarNotification]
  }
  
  @scala.inline
  implicit class CalendarNotificationMutableBuilder[Self <: CalendarNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
