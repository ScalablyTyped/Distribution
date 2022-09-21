package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatienteverything
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of resources in a page. If not specified, 100 is used. May not be larger than 1000.
    */
  var _count: js.UndefOr[Double] = js.undefined
  
  /**
    * Used to retrieve the next or previous page of results when using pagination. Set `_page_token` to the value of _page_token set in next or previous page links' url. Next and previous page are returned in the response bundle's links field, where `link.relation` is "previous" or "next". Omit `_page_token` if no previous request has been made.
    */
  var _page_token: js.UndefOr[String] = js.undefined
  
  /**
    * If provided, only resources updated after this time are returned. The time uses the format YYYY-MM-DDThh:mm:ss.sss+zz:zz. For example, `2015-02-07T13:28:17.239+02:00` or `2017-01-01T00:00:00Z`. The time must be specified to the second and include a time zone.
    */
  var _since: js.UndefOr[String] = js.undefined
  
  /**
    * String of comma-delimited FHIR resource types. If provided, only resources of the specified resource type(s) are returned.
    */
  var _type: js.UndefOr[String] = js.undefined
  
  /**
    * The response includes records prior to the end date. The date uses the format YYYY-MM-DD. If no end date is provided, all records subsequent to the start date are in scope.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the `Patient` resource for which the information is required.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The response includes records subsequent to the start date. The date uses the format YYYY-MM-DD. If no start date is provided, all records prior to the end date are in scope.
    */
  var start: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatienteverything {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatienteverything = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatienteverything]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirPatienteverything](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def set_count(value: Double): Self = StObject.set(x, "_count", value.asInstanceOf[js.Any])
    
    inline def set_countUndefined: Self = StObject.set(x, "_count", js.undefined)
    
    inline def set_page_token(value: String): Self = StObject.set(x, "_page_token", value.asInstanceOf[js.Any])
    
    inline def set_page_tokenUndefined: Self = StObject.set(x, "_page_token", js.undefined)
    
    inline def set_since(value: String): Self = StObject.set(x, "_since", value.asInstanceOf[js.Any])
    
    inline def set_sinceUndefined: Self = StObject.set(x, "_since", js.undefined)
    
    inline def set_type(value: String): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
