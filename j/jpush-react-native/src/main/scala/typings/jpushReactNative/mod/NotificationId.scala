package typings.jpushReactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationId extends js.Object {
  /**
    * 通知 ID
    * */
  var notificationId: String
}

object NotificationId {
  @scala.inline
  def apply(notificationId: String): NotificationId = {
    val __obj = js.Dynamic.literal(notificationId = notificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationId]
  }
}

