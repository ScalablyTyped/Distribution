package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSet extends StObject {
  
  /** The notifications received, or empty if no notifications are present. */
  var notification: js.UndefOr[js.Array[Notification]] = js.native
  
  /** The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no notifications are present. */
  var notificationSetId: js.UndefOr[String] = js.native
}
object NotificationSet {
  
  @scala.inline
  def apply(): NotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationSet]
  }
  
  @scala.inline
  implicit class NotificationSetMutableBuilder[Self <: NotificationSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotification(value: js.Array[Notification]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setNotificationVarargs(value: Notification*): Self = StObject.set(x, "notification", js.Array(value :_*))
  }
}
