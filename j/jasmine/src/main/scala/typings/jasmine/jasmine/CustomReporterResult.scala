package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomReporterResult extends StObject {
  
  var description: String = js.native
  
  var failedExpectations: js.UndefOr[js.Array[FailedExpectation]] = js.native
  
  var fullName: String = js.native
  
  var id: String = js.native
  
  var passedExpectations: js.UndefOr[js.Array[PassedExpectation]] = js.native
  
  var pendingReason: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object CustomReporterResult {
  
  @scala.inline
  def apply(description: String, fullName: String, id: String): CustomReporterResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomReporterResult]
  }
  
  @scala.inline
  implicit class CustomReporterResultMutableBuilder[Self <: CustomReporterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExpectations(value: js.Array[FailedExpectation]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedExpectationsUndefined: Self = StObject.set(x, "failedExpectations", js.undefined)
    
    @scala.inline
    def setFailedExpectationsVarargs(value: FailedExpectation*): Self = StObject.set(x, "failedExpectations", js.Array(value :_*))
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedExpectations(value: js.Array[PassedExpectation]): Self = StObject.set(x, "passedExpectations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassedExpectationsUndefined: Self = StObject.set(x, "passedExpectations", js.undefined)
    
    @scala.inline
    def setPassedExpectationsVarargs(value: PassedExpectation*): Self = StObject.set(x, "passedExpectations", js.Array(value :_*))
    
    @scala.inline
    def setPendingReason(value: String): Self = StObject.set(x, "pendingReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingReasonUndefined: Self = StObject.set(x, "pendingReason", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
