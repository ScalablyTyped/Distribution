package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineStartedInfo extends StObject {
  
  var order: Order
  
  var totalSpecsDefined: Double
}
object JasmineStartedInfo {
  
  inline def apply(order: Order, totalSpecsDefined: Double): JasmineStartedInfo = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], totalSpecsDefined = totalSpecsDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineStartedInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JasmineStartedInfo] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setTotalSpecsDefined(value: Double): Self = StObject.set(x, "totalSpecsDefined", value.asInstanceOf[js.Any])
  }
}
