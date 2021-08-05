package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingErrorEvent extends StObject {
  
  var error: IError
}
object RoutingErrorEvent {
  
  inline def apply(error: IError): RoutingErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingErrorEvent]
  }
  
  extension [Self <: RoutingErrorEvent](x: Self) {
    
    inline def setError(value: IError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
