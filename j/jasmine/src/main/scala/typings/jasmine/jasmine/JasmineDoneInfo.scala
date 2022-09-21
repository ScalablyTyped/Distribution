package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineDoneInfo extends StObject {
  
  var deprecationWarnings: js.Array[ExpectationResult]
  
  var failedExpectations: js.Array[ExpectationResult]
  
  var incompleteReason: String
  
  var order: Order
  
  var overallStatus: String
  
  var totalTime: Double
}
object JasmineDoneInfo {
  
  inline def apply(
    deprecationWarnings: js.Array[ExpectationResult],
    failedExpectations: js.Array[ExpectationResult],
    incompleteReason: String,
    order: Order,
    overallStatus: String,
    totalTime: Double
  ): JasmineDoneInfo = {
    val __obj = js.Dynamic.literal(deprecationWarnings = deprecationWarnings.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], incompleteReason = incompleteReason.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overallStatus = overallStatus.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JasmineDoneInfo]
  }
  
  extension [Self <: JasmineDoneInfo](x: Self) {
    
    inline def setDeprecationWarnings(value: js.Array[ExpectationResult]): Self = StObject.set(x, "deprecationWarnings", value.asInstanceOf[js.Any])
    
    inline def setDeprecationWarningsVarargs(value: ExpectationResult*): Self = StObject.set(x, "deprecationWarnings", js.Array(value*))
    
    inline def setFailedExpectations(value: js.Array[ExpectationResult]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailedExpectationsVarargs(value: ExpectationResult*): Self = StObject.set(x, "failedExpectations", js.Array(value*))
    
    inline def setIncompleteReason(value: String): Self = StObject.set(x, "incompleteReason", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOverallStatus(value: String): Self = StObject.set(x, "overallStatus", value.asInstanceOf[js.Any])
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
  }
}
