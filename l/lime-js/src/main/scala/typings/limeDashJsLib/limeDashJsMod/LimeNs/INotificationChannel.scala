package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationChannel extends js.Object {
  def onNotification(notification: Notification): js.Any
  def sendNotification(notification: Notification): scala.Unit
}

object INotificationChannel {
  @scala.inline
  def apply(
    onNotification: js.Function1[Notification, js.Any],
    sendNotification: js.Function1[Notification, scala.Unit]
  ): INotificationChannel = {
    val __obj = js.Dynamic.literal(onNotification = onNotification, sendNotification = sendNotification)
  
    __obj.asInstanceOf[INotificationChannel]
  }
}

