package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaImportUserEventsRequest extends StObject {
  
  /**
    * The desired location of errors incurred during the Import. Cannot be set for inline user event imports.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaImportErrorsConfig] = js.undefined
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaUserEventInputConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaImportUserEventsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaImportUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaImportUserEventsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaImportUserEventsRequest](x: Self) {
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2alphaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2alphaUserEventInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
