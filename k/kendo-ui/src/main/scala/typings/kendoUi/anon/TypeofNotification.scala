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
  
  inline def apply(extend: js.Object => Notification, fn: Notification): TypeofNotification = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofNotification]
  }
  
  extension [Self <: TypeofNotification](x: Self) {
    
    inline def setExtend(value: js.Object => Notification): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: Notification): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
