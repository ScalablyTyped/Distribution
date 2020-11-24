package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the Check method.
  */
@js.native
trait SchemaCheckResponse extends js.Object {
  
  /**
    * Indicate the decision of the check.  If no check errors are present, the
    * service should process the operation. Otherwise the service should use
    * the list of errors to determine the appropriate action.
    */
  var checkErrors: js.UndefOr[js.Array[SchemaCheckError]] = js.native
  
  /**
    * Feedback data returned from the server during processing a Check request.
    */
  var checkInfo: js.UndefOr[SchemaCheckInfo] = js.native
  
  /**
    * The same operation_id value used in the CheckRequest. Used for logging
    * and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Quota information for the check request associated with this response.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.native
  
  /**
    * The actual config id used to process the request.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}
object SchemaCheckResponse {
  
  @scala.inline
  def apply(): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckResponse]
  }
  
  @scala.inline
  implicit class SchemaCheckResponseOps[Self <: SchemaCheckResponse] (val x: Self) extends AnyVal {
    
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
    def setCheckErrorsVarargs(value: SchemaCheckError*): Self = this.set("checkErrors", js.Array(value :_*))
    
    @scala.inline
    def setCheckErrors(value: js.Array[SchemaCheckError]): Self = this.set("checkErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckErrors: Self = this.set("checkErrors", js.undefined)
    
    @scala.inline
    def setCheckInfo(value: SchemaCheckInfo): Self = this.set("checkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckInfo: Self = this.set("checkInfo", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setQuotaInfo(value: SchemaQuotaInfo): Self = this.set("quotaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaInfo: Self = this.set("quotaInfo", js.undefined)
    
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
}
