package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomReporterResult extends StObject {
  
  var description: String
  
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.undefined
  
  var fullName: String
  
  var id: String
  
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.undefined
  
  var pendingReason: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object CustomReporterResult {
  
  inline def apply(description: String, fullName: String, id: String): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReporterResult]
  }
  
  extension [Self <: CustomReporterResult](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFailedExpectations(value: js.Array[FailedExpectation]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailedExpectationsUndefined: Self = StObject.set(x, "failedExpectations", js.undefined)
    
    inline def setFailedExpectationsVarargs(value: FailedExpectation*): Self = StObject.set(x, "failedExpectations", js.Array(value :_*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPassedExpectations(value: js.Array[PassedExpectation]): Self = StObject.set(x, "passedExpectations", value.asInstanceOf[js.Any])
    
    inline def setPassedExpectationsUndefined: Self = StObject.set(x, "passedExpectations", js.undefined)
    
    inline def setPassedExpectationsVarargs(value: PassedExpectation*): Self = StObject.set(x, "passedExpectations", js.Array(value :_*))
    
    inline def setPendingReason(value: String): Self = StObject.set(x, "pendingReason", value.asInstanceOf[js.Any])
    
    inline def setPendingReasonUndefined: Self = StObject.set(x, "pendingReason", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
