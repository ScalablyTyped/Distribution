package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ImportUserEventsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * Echoes the destination for the complete errors if this field was set in the request.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.undefined
  
  /**
    * Aggregated statistics of user event import status.
    */
  var importSummary: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1UserEventImportSummary] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ImportUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ImportUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ImportUserEventsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setImportSummary(value: SchemaGoogleCloudRecommendationengineV1beta1UserEventImportSummary): Self = StObject.set(x, "importSummary", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryUndefined: Self = StObject.set(x, "importSummary", js.undefined)
  }
}
