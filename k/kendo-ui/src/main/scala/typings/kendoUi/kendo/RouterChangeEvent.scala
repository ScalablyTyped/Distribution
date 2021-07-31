package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterChangeEvent
  extends StObject
     with RouterEvent {
  
  var backButtonPressed: Boolean
  
  var params: js.Any
}
object RouterChangeEvent {
  
  @scala.inline
  def apply(
    backButtonPressed: Boolean,
    isDefaultPrevented: () => Boolean,
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterChangeEvent = {
    val __obj = js.Dynamic.literal(backButtonPressed = backButtonPressed.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterChangeEvent]
  }
  
  @scala.inline
  implicit class RouterChangeEventMutableBuilder[Self <: RouterChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackButtonPressed(value: Boolean): Self = StObject.set(x, "backButtonPressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
