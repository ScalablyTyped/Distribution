package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` whose management settings are being updated, in the format `projects/x/locations/x/registrations/x`.
    */
  var registration: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConfigureManagementSettingsRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsConfiguremanagementsettings](x: Self) {
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRequestBody(value: SchemaConfigureManagementSettingsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
