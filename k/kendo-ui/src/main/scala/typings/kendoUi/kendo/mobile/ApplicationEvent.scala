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
  
  extension [Self <: ApplicationEvent](x: Self) {
    
    inline def setSender(value: Application): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
