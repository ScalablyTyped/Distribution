package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotificationChannel extends StObject {
  
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
  implicit class INotificationChannelMutableBuilder[Self <: INotificationChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnNotification(value: Notification => js.Any): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendNotification(value: Notification => Unit): Self = StObject.set(x, "sendNotification", js.Any.fromFunction1(value))
  }
}
