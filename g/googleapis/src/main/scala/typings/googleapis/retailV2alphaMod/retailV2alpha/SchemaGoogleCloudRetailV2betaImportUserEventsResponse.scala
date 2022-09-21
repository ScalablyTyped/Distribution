package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaImportUserEventsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Echoes the destination for the complete errors if this field was set in the request.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaImportErrorsConfig] = js.undefined
  
  /**
    * Aggregated statistics of user event import status.
    */
  var importSummary: js.UndefOr[SchemaGoogleCloudRetailV2betaUserEventImportSummary] = js.undefined
}
object SchemaGoogleCloudRetailV2betaImportUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaImportUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaImportUserEventsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2betaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setImportSummary(value: SchemaGoogleCloudRetailV2betaUserEventImportSummary): Self = StObject.set(x, "importSummary", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryUndefined: Self = StObject.set(x, "importSummary", js.undefined)
  }
}
