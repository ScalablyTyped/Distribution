package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Geographic region of the search.
  */
@js.native
trait SchemaLocationFilter extends StObject {
  
  /**
    * Optional.   The distance_in_miles is applied when the location being
    * searched for is identified as a city or smaller. When the location being
    * searched for is a state or larger, this field is ignored.
    */
  var distanceInMiles: js.UndefOr[Double] = js.native
  
  /**
    * Optional.  Allows the client to return jobs without a set location,
    * specifically, telecommuting jobs (telecomuting is considered by the
    * service as a special location. Job.allow_telecommute indicates if a job
    * permits telecommuting. If this field is true, telecommuting jobs are
    * searched, and name and lat_lng are ignored. This filter can be used by
    * itself to search exclusively for telecommuting jobs, or it can be
    * combined with another location filter to search for a combination of job
    * locations, such as &quot;Mountain View&quot; or &quot;telecommuting&quot;
    * jobs. However, when used in combination with other location filters,
    * telecommuting jobs can be treated as less relevant than other jobs in the
    * search response.
    */
  var isTelecommute: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.  The latitude and longitude of the geographic center from which
    * to search. This field is ignored if `location_name` is provided.
    */
  var latLng: js.UndefOr[SchemaLatLng] = js.native
  
  /**
    * Optional.  The address name, such as &quot;Mountain View&quot; or
    * &quot;Bay Area&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional.  CLDR region code of the country/region of the address. This
    * will be used to address ambiguity of the user-input location, e.g.
    * &quot;Liverpool&quot; against &quot;Liverpool, NY, US&quot; or
    * &quot;Liverpool, UK&quot;.  Set this field if all the jobs to search
    * against are from a same region, or jobs are world-wide but the job seeker
    * is from a specific region.  See http://cldr.unicode.org/ and
    * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
    * for details. Example: &quot;CH&quot; for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.native
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
    def setDistanceInMiles(value: Double): Self = StObject.set(x, "distanceInMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceInMilesUndefined: Self = StObject.set(x, "distanceInMiles", js.undefined)
    
    @scala.inline
    def setIsTelecommute(value: Boolean): Self = StObject.set(x, "isTelecommute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTelecommuteUndefined: Self = StObject.set(x, "isTelecommute", js.undefined)
    
    @scala.inline
    def setLatLng(value: SchemaLatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
