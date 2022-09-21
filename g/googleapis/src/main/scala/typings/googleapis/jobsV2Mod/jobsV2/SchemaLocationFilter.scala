package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationFilter extends StObject {
  
  /**
    * Optional. The distance_in_miles is applied when the location being searched for is identified as a city or smaller. When the location being searched for is a state or larger, this field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Allows the client to return jobs without a set location, specifically, telecommuting jobs (telecomuting is considered by the service as a special location. Job.allow_telecommute indicates if a job permits telecommuting. If this field is true, telecommuting jobs are searched, and name and lat_lng are ignored. This filter can be used by itself to search exclusively for telecommuting jobs, or it can be combined with another location filter to search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when used in combination with other location filters, telecommuting jobs can be treated as less relevant than other jobs in the search response.
    */
  var isTelecommute: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. The latitude and longitude of the geographic center from which to search. This field is ignored if `location_name` is provided.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Optional. The address name, such as "Mountain View" or "Bay Area".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. CLDR region code of the country/region of the address. This will be used to address ambiguity of the user-input location, e.g. "Liverpool" against "Liverpool, NY, US" or "Liverpool, UK". Set this field if all the jobs to search against are from a same region, or jobs are world-wide but the job seeker is from a specific region. See http://cldr.unicode.org/ and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationFilter {
  
  inline def apply(): SchemaLocationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationFilter]
  }
  
  extension [Self <: SchemaLocationFilter](x: Self) {
    
    inline def setDistanceInMiles(value: Double): Self = StObject.set(x, "distanceInMiles", value.asInstanceOf[js.Any])
    
    inline def setDistanceInMilesNull: Self = StObject.set(x, "distanceInMiles", null)
    
    inline def setDistanceInMilesUndefined: Self = StObject.set(x, "distanceInMiles", js.undefined)
    
    inline def setIsTelecommute(value: Boolean): Self = StObject.set(x, "isTelecommute", value.asInstanceOf[js.Any])
    
    inline def setIsTelecommuteNull: Self = StObject.set(x, "isTelecommute", null)
    
    inline def setIsTelecommuteUndefined: Self = StObject.set(x, "isTelecommute", js.undefined)
    
    inline def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
