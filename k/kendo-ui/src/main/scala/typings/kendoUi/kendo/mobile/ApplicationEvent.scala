package typings.kendoUi.kendo.mobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationEvent extends StObject {
  
  var sender: Application = js.native
}
object ApplicationEvent {
  
  @scala.inline
  def apply(sender: Application): ApplicationEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvent]
  }
  
  @scala.inline
  implicit class ApplicationEventMutableBuilder[Self <: ApplicationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSender(value: Application): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
