package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationSet extends js.Object {
  
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
  implicit class NotificationSetOps[Self <: NotificationSet] (val x: Self) extends AnyVal {
    
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
    def setNotificationVarargs(value: Notification*): Self = this.set("notification", js.Array(value :_*))
    
    @scala.inline
    def setNotification(value: js.Array[Notification]): Self = this.set("notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    
    @scala.inline
    def setNotificationSetId(value: String): Self = this.set("notificationSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationSetId: Self = this.set("notificationSetId", js.undefined)
  }
}
