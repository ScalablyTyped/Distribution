package typings.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationMaxNumber extends StObject {
  
  var notificationMaxNumber: Double = js.native
}
object NotificationMaxNumber {
  
  @scala.inline
  def apply(notificationMaxNumber: Double): NotificationMaxNumber = {
    val __obj = js.Dynamic.literal(notificationMaxNumber = notificationMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMaxNumber]
  }
  
  @scala.inline
  implicit class NotificationMaxNumberMutableBuilder[Self <: NotificationMaxNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotificationMaxNumber(value: Double): Self = StObject.set(x, "notificationMaxNumber", value.asInstanceOf[js.Any])
  }
}
