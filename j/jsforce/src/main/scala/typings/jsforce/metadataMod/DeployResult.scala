package typings.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeployResult extends js.Object {
  
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
  implicit class DeployResultOps[Self <: DeployResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckOnly(value: Boolean): Self = this.set("checkOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDate(value: String): Self = this.set("completedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentErrors(value: Double): Self = this.set("numberComponentErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentsDeployed(value: Double): Self = this.set("numberComponentsDeployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberComponentsTotal(value: Double): Self = this.set("numberComponentsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestErrors(value: Double): Self = this.set("numberTestErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestsCompleted(value: Double): Self = this.set("numberTestsCompleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberTestsTotal(value: Double): Self = this.set("numberTestsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsVarargs(value: js.Object*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[js.Object]): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setErrorStatusCode(value: String): Self = this.set("errorStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorStatusCode: Self = this.set("errorStatusCode", js.undefined)
    
    @scala.inline
    def setIgnoreWarnings(value: Boolean): Self = this.set("ignoreWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreWarnings: Self = this.set("ignoreWarnings", js.undefined)
    
    @scala.inline
    def setRollbackOnError(value: Boolean): Self = this.set("rollbackOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollbackOnError: Self = this.set("rollbackOnError", js.undefined)
  }
}
