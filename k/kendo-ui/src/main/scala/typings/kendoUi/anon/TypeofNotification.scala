package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofNotification extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Notification
  
  /* static member */
  var fn: Notification
}
object TypeofNotification {
  
  @scala.inline
  def apply(extend: js.Object => Notification, fn: Notification): TypeofNotification = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNotification]
  }
  
  @scala.inline
  implicit class TypeofNotificationMutableBuilder[Self <: TypeofNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Notification): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Notification): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
