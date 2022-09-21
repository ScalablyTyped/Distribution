package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationFilter extends StObject {
  
  /**
    * Optional. The address name, such as "Mountain View" or "Bay Area".
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The distance_in_miles is applied when the location being searched for is identified as a city or smaller. When the location being searched for is a state or larger, this field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The latitude and longitude of the geographic center from which to search. This field's ignored if `address` is provided.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Optional. CLDR region code of the country/region. This field may be used in two ways: 1) If telecommute preference is not set, this field is used address ambiguity of the user-input address. For example, "Liverpool" may refer to "Liverpool, NY, US" or "Liverpool, UK". This region code biases the address resolution toward a specific country or territory. If this field is not set, address resolution is biased toward the United States by default. 2) If telecommute preference is set to TELECOMMUTE_ALLOWED, the telecommute location filter will be limited to the region specified in this field. If this field is not set, the telecommute job locations will not be limited. See https://unicode-org.github.io/cldr-staging/charts/latest/supplemental/territory_information.html for details. Example: "CH" for Switzerland.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Allows the client to return jobs without a set location, specifically, telecommuting jobs (telecommuting is considered by the service as a special location). Job.posting_region indicates if a job permits telecommuting. If this field is set to TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED, the telecommute status of the jobs is ignored. Jobs that have PostingRegion.TELECOMMUTE and have additional Job.addresses may still be matched based on other location filters using address or latlng. This filter can be used by itself to search exclusively for telecommuting jobs, or it can be combined with another location filter to search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when used in combination with other location filters, telecommuting jobs can be treated as less relevant than other jobs in the search response.
    */
  var telecommutePreference: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocationFilter {
  
  inline def apply(): SchemaLocationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationFilter]
  }
  
  extension [Self <: SchemaLocationFilter](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDistanceInMiles(value: Double): Self = StObject.set(x, "distanceInMiles", value.asInstanceOf[js.Any])
    
    inline def setDistanceInMilesNull: Self = StObject.set(x, "distanceInMiles", null)
    
    inline def setDistanceInMilesUndefined: Self = StObject.set(x, "distanceInMiles", js.undefined)
    
    inline def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setTelecommutePreference(value: String): Self = StObject.set(x, "telecommutePreference", value.asInstanceOf[js.Any])
    
    inline def setTelecommutePreferenceNull: Self = StObject.set(x, "telecommutePreference", null)
    
    inline def setTelecommutePreferenceUndefined: Self = StObject.set(x, "telecommutePreference", js.undefined)
  }
}
