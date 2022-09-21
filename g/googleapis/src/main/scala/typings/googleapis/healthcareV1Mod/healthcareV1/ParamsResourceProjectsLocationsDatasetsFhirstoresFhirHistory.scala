package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistory
  extends StObject
     with StandardParameters {
  
  /**
    * Only include resource versions that were current at some point during the time period specified in the date time value. The date parameter format is yyyy-mm-ddThh:mm:ss[Z|(+|-)hh:mm] Clients may specify any of the following: * An entire year: `_at=2019` * An entire month: `_at=2019-01` * A specific day: `_at=2019-01-20` * A specific second: `_at=2018-12-31T23:59:58Z`
    */
  var _at: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of search results on a page. If not specified, 100 is used. May not be larger than 1000.
    */
  var _count: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to retrieve the first, previous, next, or last page of resource versions when using pagination. Value should be set to the value of `_page_token` set in next or previous page links' URLs. Next and previous page are returned in the response bundle's links field, where `link.relation` is "previous" or "next". Omit `_page_token` if no previous request has been made.
    */
  var _page_token: js.UndefOr[String] = js.undefined
  
  /**
    * Only include resource versions that were created at or after the given instant in time. The instant in time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz (for example 2015-02-07T13:28:17.239+02:00 or 2017-01-01T00:00:00Z). The time must be specified to the second and include a time zone.
    */
  var _since: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistory {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistory]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirHistory](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def set_at(value: String): Self = StObject.set(x, "_at", value.asInstanceOf[js.Any])
    
    inline def set_atUndefined: Self = StObject.set(x, "_at", js.undefined)
    
    inline def set_count(value: Double): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_countUndefined: Self = StObject.set(x, "_count", js.undefined)
    
    inline def set_page_token(value: String): Self = StObject.set(x, "_page_token", value.asInstanceOf[js.Any])
    
    inline def set_page_tokenUndefined: Self = StObject.set(x, "_page_token", js.undefined)
    
    inline def set_since(value: String): Self = StObject.set(x, "_since", value.asInstanceOf[js.Any])
    
    inline def set_sinceUndefined: Self = StObject.set(x, "_since", js.undefined)
  }
}
