package typings.maximMazurokGapiClientCalendar.anon

import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.CalendarNotification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  /** The list of notifications set for this calendar. */
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
}
object Notifications {
  
  @scala.inline
  def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  
  @scala.inline
  implicit class NotificationsMutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifications(value: js.Array[CalendarNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: CalendarNotification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
