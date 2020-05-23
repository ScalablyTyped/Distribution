package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopOver extends js.Object {
  var arrival: js.UndefOr[String] = js.undefined
   // null, if first stopOver of trip
  var arrivalDelay: js.UndefOr[Double] = js.undefined
  var arrivalPlatform: js.UndefOr[String] = js.undefined
  var departure: js.UndefOr[String] = js.undefined
   // null, if last stopOver of trip
  var departureDelay: js.UndefOr[Double] = js.undefined
  var departurePlatform: js.UndefOr[String] = js.undefined
  var plannedArrival: js.UndefOr[String] = js.undefined
  var plannedArrivalPlatform: js.UndefOr[String] = js.undefined
  var plannedDeparture: js.UndefOr[String] = js.undefined
  var plannedDeparturePlatform: js.UndefOr[String] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var stop: Station | Stop
}

object StopOver {
  @scala.inline
  def apply(
    stop: Station | Stop,
    arrival: String = null,
    arrivalDelay: js.UndefOr[Double] = js.undefined,
    arrivalPlatform: String = null,
    departure: String = null,
    departureDelay: js.UndefOr[Double] = js.undefined,
    departurePlatform: String = null,
    plannedArrival: String = null,
    plannedArrivalPlatform: String = null,
    plannedDeparture: String = null,
    plannedDeparturePlatform: String = null,
    remarks: js.Array[Hint] = null
  ): StopOver = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any])
    if (arrival != null) __obj.updateDynamic("arrival")(arrival.asInstanceOf[js.Any])
    if (!js.isUndefined(arrivalDelay)) __obj.updateDynamic("arrivalDelay")(arrivalDelay.get.asInstanceOf[js.Any])
    if (arrivalPlatform != null) __obj.updateDynamic("arrivalPlatform")(arrivalPlatform.asInstanceOf[js.Any])
    if (departure != null) __obj.updateDynamic("departure")(departure.asInstanceOf[js.Any])
    if (!js.isUndefined(departureDelay)) __obj.updateDynamic("departureDelay")(departureDelay.get.asInstanceOf[js.Any])
    if (departurePlatform != null) __obj.updateDynamic("departurePlatform")(departurePlatform.asInstanceOf[js.Any])
    if (plannedArrival != null) __obj.updateDynamic("plannedArrival")(plannedArrival.asInstanceOf[js.Any])
    if (plannedArrivalPlatform != null) __obj.updateDynamic("plannedArrivalPlatform")(plannedArrivalPlatform.asInstanceOf[js.Any])
    if (plannedDeparture != null) __obj.updateDynamic("plannedDeparture")(plannedDeparture.asInstanceOf[js.Any])
    if (plannedDeparturePlatform != null) __obj.updateDynamic("plannedDeparturePlatform")(plannedDeparturePlatform.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOver]
  }
}

