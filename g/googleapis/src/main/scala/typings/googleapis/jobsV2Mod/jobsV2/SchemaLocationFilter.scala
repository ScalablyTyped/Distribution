package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Geographic region of the search.
  */
@js.native
trait SchemaLocationFilter extends js.Object {
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
  def apply(
    distanceInMiles: js.UndefOr[Double] = js.undefined,
    isTelecommute: js.UndefOr[Boolean] = js.undefined,
    latLng: SchemaLatLng = null,
    name: String = null,
    regionCode: String = null
  ): SchemaLocationFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distanceInMiles)) __obj.updateDynamic("distanceInMiles")(distanceInMiles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTelecommute)) __obj.updateDynamic("isTelecommute")(isTelecommute.get.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationFilter]
  }
}

