package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the `Registration` whose authorization code is being retrieved, in the format `projects/x/locations/x/registrations/x`.
    */
  var registration: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsRetrieveauthorizationcode](x: Self) {
    
    inline def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    inline def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
  }
}
