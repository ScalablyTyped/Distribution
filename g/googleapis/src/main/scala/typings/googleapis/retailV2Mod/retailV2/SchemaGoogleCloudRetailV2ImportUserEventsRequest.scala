package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ImportUserEventsRequest extends StObject {
  
  /**
    * The desired location of errors incurred during the Import. Cannot be set for inline user event imports.
    */
  var errorsConfig: js.UndefOr[SchemaGoogleCloudRetailV2ImportErrorsConfig] = js.undefined
  
  /**
    * Required. The desired input location of the data.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudRetailV2UserEventInputConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2ImportUserEventsRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2ImportUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ImportUserEventsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ImportUserEventsRequest](x: Self) {
    
    inline def setErrorsConfig(value: SchemaGoogleCloudRetailV2ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: SchemaGoogleCloudRetailV2UserEventInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
