package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationSet extends StObject {
  
  /** The notifications received, or empty if no notifications are present. */
  var notification: js.UndefOr[js.Array[Notification]] = js.undefined
  
  /** The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no notifications are present. */
  var notificationSetId: js.UndefOr[String] = js.undefined
}
object NotificationSet {
  
  inline def apply(): NotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSet]
  }
  
  extension [Self <: NotificationSet](x: Self) {
    
    inline def setNotification(value: js.Array[Notification]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setNotificationVarargs(value: Notification*): Self = StObject.set(x, "notification", js.Array(value*))
  }
}
