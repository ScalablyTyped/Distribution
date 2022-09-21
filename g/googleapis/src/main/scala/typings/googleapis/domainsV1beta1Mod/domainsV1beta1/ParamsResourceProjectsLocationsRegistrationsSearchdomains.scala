package typings.googleapis.domainsV1beta1Mod.domainsV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsSearchdomains
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location. Must be in the format `projects/x/locations/x`.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Required. String used to search for available domain names.
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsSearchdomains {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsSearchdomains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsSearchdomains]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsSearchdomains](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
