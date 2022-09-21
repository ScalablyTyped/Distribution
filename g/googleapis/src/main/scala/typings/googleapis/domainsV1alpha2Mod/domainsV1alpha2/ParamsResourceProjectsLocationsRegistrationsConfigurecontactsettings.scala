package typings.googleapis.domainsV1alpha2Mod.domainsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` whose contact settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    */
  var registration: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConfigureContactSettingsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsConfigurecontactsettings](x: Self) {
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRequestBody(value: SchemaConfigureContactSettingsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
