package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` whose authorization code is being reset, in the format `projects/x/locations/x/registrations/x`.
    */
  var registration: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResetAuthorizationCodeRequest] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsResetauthorizationcode](x: Self) {
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    inline def setRequestBody(value: SchemaResetAuthorizationCodeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
