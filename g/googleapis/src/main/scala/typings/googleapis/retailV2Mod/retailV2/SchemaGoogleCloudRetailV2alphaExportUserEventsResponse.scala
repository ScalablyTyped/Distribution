package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaExportUserEventsResponse extends StObject {
  
  /**
    * A sample of errors encountered while processing the request.
    */
  var errorSamples: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * This field is never set.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaExportErrorsConfig] = js.undefined
  
  /**
    * Output result indicating where the data were exported to.
    */
  var outputResult: js.UndefOr[SchemaGoogleCloudRetailV2alphaOutputResult] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaExportUserEventsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaExportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaExportUserEventsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaExportUserEventsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2alphaExportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setOutputResult(value: SchemaGoogleCloudRetailV2alphaOutputResult): Self = StObject.set(x, "outputResult", value.asInstanceOf[js.Any])
    
    inline def setOutputResultUndefined: Self = StObject.set(x, "outputResult", js.undefined)
  }
}
