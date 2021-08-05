package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployResult extends StObject {
  
  var checkOnly: Boolean
  
  var completedDate: String
  
  var createdDate: String
  
  var details: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var done: Boolean
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var errorStatusCode: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  
  var lastModifiedDate: String
  
  var numberComponentErrors: Double
  
  var numberComponentsDeployed: Double
  
  var numberComponentsTotal: Double
  
  var numberTestErrors: Double
  
  var numberTestsCompleted: Double
  
  var numberTestsTotal: Double
  
  var rollbackOnError: js.UndefOr[Boolean] = js.undefined
  
  var startDate: String
  
  var status: String
  
  var success: Boolean
}
object DeployResult {
  
  inline def apply(
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
  
  extension [Self <: DeployResult](x: Self) {
    
    inline def setCheckOnly(value: Boolean): Self = StObject.set(x, "checkOnly", value.asInstanceOf[js.Any])
    
    inline def setCompletedDate(value: String): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: js.Array[js.Object]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: js.Object*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorStatusCode(value: String): Self = StObject.set(x, "errorStatusCode", value.asInstanceOf[js.Any])
    
    inline def setErrorStatusCodeUndefined: Self = StObject.set(x, "errorStatusCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarnings(value: Boolean): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setLastModifiedDate(value: String): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setNumberComponentErrors(value: Double): Self = StObject.set(x, "numberComponentErrors", value.asInstanceOf[js.Any])
    
    inline def setNumberComponentsDeployed(value: Double): Self = StObject.set(x, "numberComponentsDeployed", value.asInstanceOf[js.Any])
    
    inline def setNumberComponentsTotal(value: Double): Self = StObject.set(x, "numberComponentsTotal", value.asInstanceOf[js.Any])
    
    inline def setNumberTestErrors(value: Double): Self = StObject.set(x, "numberTestErrors", value.asInstanceOf[js.Any])
    
    inline def setNumberTestsCompleted(value: Double): Self = StObject.set(x, "numberTestsCompleted", value.asInstanceOf[js.Any])
    
    inline def setNumberTestsTotal(value: Double): Self = StObject.set(x, "numberTestsTotal", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnError(value: Boolean): Self = StObject.set(x, "rollbackOnError", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnErrorUndefined: Self = StObject.set(x, "rollbackOnError", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
