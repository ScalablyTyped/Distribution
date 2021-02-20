package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployResult extends StObject {
  
  var checkOnly: Boolean = js.native
  
  var completedDate: String = js.native
  
  var createdDate: String = js.native
  
  var details: js.UndefOr[js.Array[js.Object]] = js.native
  
  var done: Boolean = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var errorStatusCode: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  
  var lastModifiedDate: String = js.native
  
  var numberComponentErrors: Double = js.native
  
  var numberComponentsDeployed: Double = js.native
  
  var numberComponentsTotal: Double = js.native
  
  var numberTestErrors: Double = js.native
  
  var numberTestsCompleted: Double = js.native
  
  var numberTestsTotal: Double = js.native
  
  var rollbackOnError: js.UndefOr[Boolean] = js.native
  
  var startDate: String = js.native
  
  var status: String = js.native
  
  var success: Boolean = js.native
}
object DeployResult {
  
  @scala.inline
  def apply(
    checkOnly: Boolean,
    completedDate: String,
    createdDate: String,
    done: Boolean,
    id: String,
    lastModifiedDate: String,
    numberComponentErrors: Double,
    numberComponentsDeployed: Double,
    numberComponentsTotal: Double,
    numberTestErrors: Double,
    numberTestsCompleted: Double,
    numberTestsTotal: Double,
    startDate: String,
    status: String,
    success: Boolean
  ): DeployResult = {
    val __obj = js.Dynamic.literal(checkOnly = checkOnly.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], numberComponentErrors = numberComponentErrors.asInstanceOf[js.Any], numberComponentsDeployed = numberComponentsDeployed.asInstanceOf[js.Any], numberComponentsTotal = numberComponentsTotal.asInstanceOf[js.Any], numberTestErrors = numberTestErrors.asInstanceOf[js.Any], numberTestsCompleted = numberTestsCompleted.asInstanceOf[js.Any], numberTestsTotal = numberTestsTotal.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployResult]
  }
  
  @scala.inline
  implicit class DeployResultMutableBuilder[Self <: DeployResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setErrorStatusCode(value: String): Self = StObject.set(x, "errorStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorStatusCodeUndefined: Self = StObject.set(x, "errorStatusCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentErrors(value: Double): Self = StObject.set(x, "numberComponentErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentsDeployed(value: Double): Self = StObject.set(x, "numberComponentsDeployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentsTotal(value: Double): Self = StObject.set(x, "numberComponentsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestErrors(value: Double): Self = StObject.set(x, "numberTestErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestsCompleted(value: Double): Self = StObject.set(x, "numberTestsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestsTotal(value: Double): Self = StObject.set(x, "numberTestsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackOnError(value: Boolean): Self = StObject.set(x, "rollbackOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackOnErrorUndefined: Self = StObject.set(x, "rollbackOnError", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
