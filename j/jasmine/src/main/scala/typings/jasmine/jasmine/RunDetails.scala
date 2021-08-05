package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunDetails extends StObject {
  
  var failedExpectations: js.Array[ExpectationResult]
  
  var order: Order
}
object RunDetails {
  
  inline def apply(failedExpectations: js.Array[ExpectationResult], order: Order): RunDetails = {
    val __obj = js.Dynamic.literal(failedExpectations = failedExpectations.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunDetails]
  }
  
  extension [Self <: RunDetails](x: Self) {
    
    inline def setFailedExpectations(value: js.Array[ExpectationResult]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailedExpectationsVarargs(value: ExpectationResult*): Self = StObject.set(x, "failedExpectations", js.Array(value :_*))
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
