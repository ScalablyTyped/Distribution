package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationMaxNumber extends js.Object {
  
  var notificationMaxNumber: Double = js.native
}
object NotificationMaxNumber {
  
  @scala.inline
  def apply(notificationMaxNumber: Double): NotificationMaxNumber = {
    val __obj = js.Dynamic.literal(notificationMaxNumber = notificationMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMaxNumber]
  }
  
  @scala.inline
  implicit class NotificationMaxNumberOps[Self <: NotificationMaxNumber] (val x: Self) extends AnyVal {
    
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
    def setNotificationMaxNumber(value: Double): Self = this.set("notificationMaxNumber", value.asInstanceOf[js.Any])
  }
}
