package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaImportUserEventsRequest extends StObject {
  
  /**
    * The desired location of errors incurred during the Import. Cannot be set for inline user event imports.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaImportErrorsConfig] = js.undefined
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2betaUserEventInputConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2betaImportUserEventsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaImportUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaImportUserEventsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaImportUserEventsRequest](x: Self) {
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2betaImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2betaUserEventInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
