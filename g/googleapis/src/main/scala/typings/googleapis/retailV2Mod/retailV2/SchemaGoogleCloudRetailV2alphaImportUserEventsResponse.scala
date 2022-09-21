package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaImportUserEventsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Echoes the destination for the complete errors if this field was set in the request.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaImportErrorsConfig] = js.undefined
  
  /**
    * Aggregated statistics of user event import status.
    */
  var importSummary: js.UndefOr[SchemaGoogleCloudRetailV2alphaUserEventImportSummary] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaImportUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaImportUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaImportUserEventsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2alphaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setImportSummary(value: SchemaGoogleCloudRetailV2alphaUserEventImportSummary): Self = StObject.set(x, "importSummary", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryUndefined: Self = StObject.set(x, "importSummary", js.undefined)
  }
}
