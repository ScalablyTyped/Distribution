package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Parameters needed for commute search.
  */
@js.native
trait SchemaCommuteFilter extends js.Object {
  /**
    * Optional. If `true`, jobs without street level addresses may also be
    * returned. For city level addresses, the city center is used. For state
    * and coarser level addresses, text matching is used. If this field is set
    * to `false` or is not specified, only jobs that include street level
    * addresses will be returned by commute search.
    */
  var allowImpreciseAddresses: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The method of transportation for which to calculate the
    * commute time.
    */
  var commuteMethod: js.UndefOr[String] = js.native
  /**
    * Optional.  The departure time used to calculate traffic impact,
    * represented as google.type.TimeOfDay in local time zone.  Currently
    * traffic model is restricted to hour level resolution.
    */
  var departureTime: js.UndefOr[SchemaTimeOfDay] = js.native
  /**
    * Optional.  Specifies the traffic density to use when calculating commute
    * time.
    */
  var roadTraffic: js.UndefOr[String] = js.native
  /**
    * Required.  The latitude and longitude of the location from which to
    * calculate the commute time.
    */
  var startCoordinates: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Required.  The maximum travel time in seconds. The maximum allowed value
    * is `3600s` (one hour). Format is `123s`.
    */
  var travelDuration: js.UndefOr[String] = js.native
}

object SchemaCommuteFilter {
  @scala.inline
  def apply(
    allowImpreciseAddresses: js.UndefOr[Boolean] = js.undefined,
    commuteMethod: String = null,
    departureTime: SchemaTimeOfDay = null,
    roadTraffic: String = null,
    startCoordinates: SchemaLatLng = null,
    travelDuration: String = null
  ): SchemaCommuteFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowImpreciseAddresses)) __obj.updateDynamic("allowImpreciseAddresses")(allowImpreciseAddresses.get.asInstanceOf[js.Any])
    if (commuteMethod != null) __obj.updateDynamic("commuteMethod")(commuteMethod.asInstanceOf[js.Any])
    if (departureTime != null) __obj.updateDynamic("departureTime")(departureTime.asInstanceOf[js.Any])
    if (roadTraffic != null) __obj.updateDynamic("roadTraffic")(roadTraffic.asInstanceOf[js.Any])
    if (startCoordinates != null) __obj.updateDynamic("startCoordinates")(startCoordinates.asInstanceOf[js.Any])
    if (travelDuration != null) __obj.updateDynamic("travelDuration")(travelDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommuteFilter]
  }
}

