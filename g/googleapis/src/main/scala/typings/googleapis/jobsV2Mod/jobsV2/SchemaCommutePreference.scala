package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Parameters needed for commute search.
  */
@js.native
trait SchemaCommutePreference extends js.Object {
  /**
    * Optional. If `true`, jobs without street level addresses may also be
    * returned. For city level addresses, the city center is used. For state
    * and coarser level addresses, text matching is used. If this field is set
    * to `false` or is not specified, only jobs that include street level
    * addresses will be returned by commute search.
    */
  var allowNonStreetLevelAddress: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The departure hour to use to calculate traffic impact. Accepts
    * an integer between 0 and 23, representing the hour in the time zone of
    * the start_location. Must not be present if road_traffic is specified.
    */
  var departureHourLocal: js.UndefOr[Double] = js.native
  /**
    * Required.  The method of transportation for which to calculate the
    * commute time.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * Optional.  Specifies the traffic density to use when calculating commute
    * time. Must not be present if departure_hour_local is specified.
    */
  var roadTraffic: js.UndefOr[String] = js.native
  /**
    * Required.  The latitude and longitude of the location from which to
    * calculate the commute time.
    */
  var startLocation: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Required.  The maximum travel time in seconds. The maximum allowed value
    * is `3600s` (one hour). Format is `123s`.
    */
  var travelTime: js.UndefOr[String] = js.native
}

object SchemaCommutePreference {
  @scala.inline
  def apply(
    allowNonStreetLevelAddress: js.UndefOr[Boolean] = js.undefined,
    departureHourLocal: js.UndefOr[Double] = js.undefined,
    method: String = null,
    roadTraffic: String = null,
    startLocation: SchemaLatLng = null,
    travelTime: String = null
  ): SchemaCommutePreference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNonStreetLevelAddress)) __obj.updateDynamic("allowNonStreetLevelAddress")(allowNonStreetLevelAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(departureHourLocal)) __obj.updateDynamic("departureHourLocal")(departureHourLocal.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (roadTraffic != null) __obj.updateDynamic("roadTraffic")(roadTraffic.asInstanceOf[js.Any])
    if (startLocation != null) __obj.updateDynamic("startLocation")(startLocation.asInstanceOf[js.Any])
    if (travelTime != null) __obj.updateDynamic("travelTime")(travelTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommutePreference]
  }
}

