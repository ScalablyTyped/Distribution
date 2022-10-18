package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudFunctionsV2betaOperationMetadata extends StObject {
  
  /** API version used to start the operation. */
  var apiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies whether the user has requested cancellation of the operation. Operations that have successfully been cancelled have Operation.error value with a google.rpc.Status.code of
    * 1, corresponding to `Code.CANCELLED`.
    */
  var cancelRequested: js.UndefOr[Boolean] = js.undefined
  
  /** The time the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The time the operation finished running. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The original request that started the operation. */
  var requestResource: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Mechanism for reporting in-progress stages */
  var stages: js.UndefOr[js.Array[GoogleCloudFunctionsV2betaStage]] = js.undefined
  
  /** Human-readable status of the operation, if any. */
  var statusDetail: js.UndefOr[String] = js.undefined
  
  /** Server-defined resource path for the target of the operation. */
  var target: js.UndefOr[String] = js.undefined
  
  /** Name of the verb executed by the operation. */
  var verb: js.UndefOr[String] = js.undefined
}
object GoogleCloudFunctionsV2betaOperationMetadata {
  
  inline def apply(): GoogleCloudFunctionsV2betaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudFunctionsV2betaOperationMetadata]
  }
  
  extension [Self <: GoogleCloudFunctionsV2betaOperationMetadata](x: Self) {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    inline def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setRequestResource(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "requestResource", value.asInstanceOf[js.Any])
    
    inline def setRequestResourceUndefined: Self = StObject.set(x, "requestResource", js.undefined)
    
    inline def setStages(value: js.Array[GoogleCloudFunctionsV2betaStage]): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesUndefined: Self = StObject.set(x, "stages", js.undefined)
    
    inline def setStagesVarargs(value: GoogleCloudFunctionsV2betaStage*): Self = StObject.set(x, "stages", js.Array(value*))
    
    inline def setStatusDetail(value: String): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
