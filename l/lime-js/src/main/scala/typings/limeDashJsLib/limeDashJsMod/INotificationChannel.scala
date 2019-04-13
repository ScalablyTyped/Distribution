package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationChannel extends js.Object {
  def onNotification(notification: Notification): js.Any
  def sendNotification(notification: Notification): scala.Unit
}

object INotificationChannel {
  @scala.inline
  def apply(onNotification: Notification => js.Any, sendNotification: Notification => scala.Unit): INotificationChannel = {
    val __obj = js.Dynamic.literal(onNotification = js.Any.fromFunction1(onNotification), sendNotification = js.Any.fromFunction1(sendNotification))
  
    __obj.asInstanceOf[INotificationChannel]
  }
}

