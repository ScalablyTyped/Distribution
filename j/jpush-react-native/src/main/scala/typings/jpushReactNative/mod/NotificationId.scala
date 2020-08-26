package typings.jpushReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationId extends js.Object {
  /**
    * 通知 ID
    * */
  var notificationId: String = js.native
}

object NotificationId {
  @scala.inline
  def apply(notificationId: String): NotificationId = {
    val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationId]
  }
  @scala.inline
  implicit class NotificationIdOps[Self <: NotificationId] (val x: Self) extends AnyVal {
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
    def setNotificationId(value: String): Self = this.set("notificationId", value.asInstanceOf[js.Any])
  }
  
}

