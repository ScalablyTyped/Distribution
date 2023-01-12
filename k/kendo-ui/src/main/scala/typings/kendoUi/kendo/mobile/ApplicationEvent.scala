package typings.kendoUi.kendo.mobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationEvent extends StObject {
  
  var sender: Application
}
object ApplicationEvent {
  
  inline def apply(sender: Application): ApplicationEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationEvent] (val x: Self) extends AnyVal {
    
    inline def setSender(value: Application): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
