package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The domain name. Unicode domain names must be expressed in Punycode format.
    */
  var domainName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The location. Must be in the format `projects/x/locations/x`.
    */
  var location: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsRetrievetransferparameters](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
