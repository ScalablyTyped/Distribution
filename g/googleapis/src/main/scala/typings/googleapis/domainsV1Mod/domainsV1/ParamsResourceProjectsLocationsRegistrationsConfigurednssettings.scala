package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsConfigurednssettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` whose DNS settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    */
  var registration: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConfigureDnsSettingsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsConfigurednssettings {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsConfigurednssettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsConfigurednssettings]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsConfigurednssettings](x: Self) {
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRequestBody(value: SchemaConfigureDnsSettingsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
