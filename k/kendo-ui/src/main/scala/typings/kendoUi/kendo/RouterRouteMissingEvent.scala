package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterRouteMissingEvent
  extends StObject
     with RouterEvent {
  
  var params: js.Any
}
object RouterRouteMissingEvent {
  
  inline def apply(
    isDefaultPrevented: () => Boolean,
    params: js.Any,
    preventDefault: js.Function,
    sender: Router,
    url: String
  ): RouterRouteMissingEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), params = params.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterRouteMissingEvent]
  }
  
  extension [Self <: RouterRouteMissingEvent](x: Self) {
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
