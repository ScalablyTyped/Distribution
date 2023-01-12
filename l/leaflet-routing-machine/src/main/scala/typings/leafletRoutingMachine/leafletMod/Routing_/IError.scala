package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
trait IError extends StObject {
  
  var message: String
  
  var status: String | Double
}
object IError {
  
  inline def apply(message: String, status: String | Double): IError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String | Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
