package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayOperationMetadata extends StObject {
  
  /** Output only. API version used to start the operation. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Diagnostics generated during processing of configuration source files. */
  var diagnostics: js.UndefOr[js.Array[ApigatewayOperationMetadataDiagnostic]] = js.undefined
  
  /** Output only. The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Identifies whether the user has requested cancellation of the operation. Operations that have successfully been cancelled have Operation.error value with a
    * google.rpc.Status.code of 1, corresponding to `Code.CANCELLED`.
    */
  var requestedCancellation: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Human-readable status of the operation, if any. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** Output only. Server-defined resource path for the target of the operation. */
  var target: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.undefined
}
object ApigatewayOperationMetadata {
  
  @scala.inline
  def apply(): ApigatewayOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayOperationMetadata]
  }
  
  @scala.inline
  implicit class ApigatewayOperationMetadataMutableBuilder[Self <: ApigatewayOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDiagnostics(value: js.Array[ApigatewayOperationMetadataDiagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: ApigatewayOperationMetadataDiagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setRequestedCancellation(value: Boolean): Self = StObject.set(x, "requestedCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedCancellationUndefined: Self = StObject.set(x, "requestedCancellation", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
