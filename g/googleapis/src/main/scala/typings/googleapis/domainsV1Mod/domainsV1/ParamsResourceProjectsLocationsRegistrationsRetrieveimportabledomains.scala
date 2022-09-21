package typings.googleapis.domainsV1Mod.domainsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location. Must be in the format `projects/x/locations/x`.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * When set to the `next_page_token` from a prior response, provides the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains {
  
  inline def apply(): ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRegistrationsRetrieveimportabledomains](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
