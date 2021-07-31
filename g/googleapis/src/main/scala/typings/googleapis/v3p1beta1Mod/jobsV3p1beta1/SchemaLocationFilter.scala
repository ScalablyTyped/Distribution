package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Geographic region of the search.
  */
trait SchemaLocationFilter extends StObject {
  
  /**
    * Optional.  The address name, such as &quot;Mountain View&quot; or
    * &quot;Bay Area&quot;.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.   The distance_in_miles is applied when the location being
    * searched for is identified as a city or smaller. When the location being
    * searched for is a state or larger, this field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.  The latitude and longitude of the geographic center from which
    * to search. This field&#39;s ignored if `address` is provided.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Optional.  CLDR region code of the country/region of the address. This is
    * used to address ambiguity of the user-input location, for example,
    * &quot;Liverpool&quot; against &quot;Liverpool, NY, US&quot; or
    * &quot;Liverpool, UK&quot;.  Set this field if all the jobs to search
    * against are from a same region, or jobs are world-wide, but the job
    * seeker is from a specific region.  See http://cldr.unicode.org/ and
    * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
    * for details. Example: &quot;CH&quot; for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  Allows the client to return jobs without a set location,
    * specifically, telecommuting jobs (telecomuting is considered by the
    * service as a special location. Job.posting_region indicates if a job
    * permits telecommuting. If this field is set to
    * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are
    * searched, and address and lat_lng are ignored. If not set or set to
    * TelecommutePreference.TELECOMMUTE_EXCLUDED, telecommute job are not
    * searched.  This filter can be used by itself to search exclusively for
    * telecommuting jobs, or it can be combined with another location filter to
    * search for a combination of job locations, such as &quot;Mountain
    * View&quot; or &quot;telecommuting&quot; jobs. However, when used in
    * combination with other location filters, telecommuting jobs can be
    * treated as less relevant than other jobs in the search response.
    */
  var telecommutePreference: js.UndefOr[String] = js.undefined
}
object SchemaLocationFilter {
  
  @scala.inline
  def apply(): SchemaLocationFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationFilter]
  }
  
  @scala.inline
  implicit class SchemaLocationFilterMutableBuilder[Self <: SchemaLocationFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDistanceInMiles(value: Double): Self = StObject.set(x, "distanceInMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceInMilesUndefined: Self = StObject.set(x, "distanceInMiles", js.undefined)
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    @scala.inline
    def setTelecommutePreference(value: String): Self = StObject.set(x, "telecommutePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecommutePreferenceUndefined: Self = StObject.set(x, "telecommutePreference", js.undefined)
  }
}
