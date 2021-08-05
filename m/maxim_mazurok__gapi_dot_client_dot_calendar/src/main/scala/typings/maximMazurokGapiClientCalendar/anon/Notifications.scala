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
  
  inline def apply(): Notifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setNotifications(value: js.Array[CalendarNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: CalendarNotification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
