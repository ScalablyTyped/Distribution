package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trip extends js.Object {
  var arrival: String
  var arrivalDelay: js.UndefOr[Double] = js.undefined
  var arrivalPlatform: js.UndefOr[String] = js.undefined
  var departure: String
  var departureDelay: js.UndefOr[Double] = js.undefined
  var departurePlatform: js.UndefOr[String] = js.undefined
  var destination: Stop
  var direction: js.UndefOr[String] = js.undefined
  var id: String
  var line: js.UndefOr[Line] = js.undefined
  var origin: Stop
  var plannedArrival: String
  var plannedArrivalPlatform: js.UndefOr[String] = js.undefined
  var plannedDeparture: String
  var plannedDeparturePlatform: js.UndefOr[String] = js.undefined
  var reachable: js.UndefOr[Boolean] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var stopovers: js.Array[StopOver]
}

object Trip {
  @scala.inline
  def apply(
    arrival: String,
    departure: String,
    destination: Stop,
    id: String,
    origin: Stop,
    plannedArrival: String,
    plannedDeparture: String,
    stopovers: js.Array[StopOver],
    arrivalDelay: js.UndefOr[Double] = js.undefined,
    arrivalPlatform: String = null,
    departureDelay: js.UndefOr[Double] = js.undefined,
    departurePlatform: String = null,
    direction: String = null,
    line: Line = null,
    plannedArrivalPlatform: String = null,
    plannedDeparturePlatform: String = null,
    reachable: js.UndefOr[Boolean] = js.undefined,
    remarks: js.Array[Hint] = null
  ): Trip = {
    val __obj = js.Dynamic.literal(arrival = arrival.asInstanceOf[js.Any], departure = departure.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plannedArrival = plannedArrival.asInstanceOf[js.Any], plannedDeparture = plannedDeparture.asInstanceOf[js.Any], stopovers = stopovers.asInstanceOf[js.Any])
    if (!js.isUndefined(arrivalDelay)) __obj.updateDynamic("arrivalDelay")(arrivalDelay.get.asInstanceOf[js.Any])
    if (arrivalPlatform != null) __obj.updateDynamic("arrivalPlatform")(arrivalPlatform.asInstanceOf[js.Any])
    if (!js.isUndefined(departureDelay)) __obj.updateDynamic("departureDelay")(departureDelay.get.asInstanceOf[js.Any])
    if (departurePlatform != null) __obj.updateDynamic("departurePlatform")(departurePlatform.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (plannedArrivalPlatform != null) __obj.updateDynamic("plannedArrivalPlatform")(plannedArrivalPlatform.asInstanceOf[js.Any])
    if (plannedDeparturePlatform != null) __obj.updateDynamic("plannedDeparturePlatform")(plannedDeparturePlatform.asInstanceOf[js.Any])
    if (!js.isUndefined(reachable)) __obj.updateDynamic("reachable")(reachable.get.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trip]
  }
}

