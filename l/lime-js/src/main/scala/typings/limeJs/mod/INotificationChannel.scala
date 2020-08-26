package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotificationChannel extends js.Object {
  def onNotification(notification: Notification): js.Any = js.native
  def sendNotification(notification: Notification): Unit = js.native
}

object INotificationChannel {
  @scala.inline
  def apply(onNotification: Notification => js.Any, sendNotification: Notification => Unit): INotificationChannel = {
    val __obj = js.Dynamic.literal(onNotification = js.Any.fromFunction1(onNotification), sendNotification = js.Any.fromFunction1(sendNotification))
    __obj.asInstanceOf[INotificationChannel]
  }
  @scala.inline
  implicit class INotificationChannelOps[Self <: INotificationChannel] (val x: Self) extends AnyVal {
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
    def setOnNotification(value: Notification => js.Any): Self = this.set("onNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setSendNotification(value: Notification => Unit): Self = this.set("sendNotification", js.Any.fromFunction1(value))
  }
  
}

