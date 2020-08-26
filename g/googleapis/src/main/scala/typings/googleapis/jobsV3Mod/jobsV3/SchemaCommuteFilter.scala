package typings.googleapis.jobsV3Mod.jobsV3

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
  def apply(): SchemaCommuteFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteFilter]
  }
  @scala.inline
  implicit class SchemaCommuteFilterOps[Self <: SchemaCommuteFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowImpreciseAddresses(value: Boolean): Self = this.set("allowImpreciseAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowImpreciseAddresses: Self = this.set("allowImpreciseAddresses", js.undefined)
    @scala.inline
    def setCommuteMethod(value: String): Self = this.set("commuteMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommuteMethod: Self = this.set("commuteMethod", js.undefined)
    @scala.inline
    def setDepartureTime(value: SchemaTimeOfDay): Self = this.set("departureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartureTime: Self = this.set("departureTime", js.undefined)
    @scala.inline
    def setRoadTraffic(value: String): Self = this.set("roadTraffic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoadTraffic: Self = this.set("roadTraffic", js.undefined)
    @scala.inline
    def setStartCoordinates(value: SchemaLatLng): Self = this.set("startCoordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartCoordinates: Self = this.set("startCoordinates", js.undefined)
    @scala.inline
    def setTravelDuration(value: String): Self = this.set("travelDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTravelDuration: Self = this.set("travelDuration", js.undefined)
  }
  
}

