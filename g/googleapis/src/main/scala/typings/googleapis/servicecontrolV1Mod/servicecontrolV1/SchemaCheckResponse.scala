package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the Check method.
  */
@js.native
trait SchemaCheckResponse extends StObject {
  
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
  implicit class SchemaCheckResponseMutableBuilder[Self <: SchemaCheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckErrors(value: js.Array[SchemaCheckError]): Self = StObject.set(x, "checkErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckErrorsUndefined: Self = StObject.set(x, "checkErrors", js.undefined)
    
    @scala.inline
    def setCheckErrorsVarargs(value: SchemaCheckError*): Self = StObject.set(x, "checkErrors", js.Array(value :_*))
    
    @scala.inline
    def setCheckInfo(value: SchemaCheckInfo): Self = StObject.set(x, "checkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckInfoUndefined: Self = StObject.set(x, "checkInfo", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setQuotaInfo(value: SchemaQuotaInfo): Self = StObject.set(x, "quotaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaInfoUndefined: Self = StObject.set(x, "quotaInfo", js.undefined)
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
