package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Leg of journey
  */
trait Leg extends js.Object {
  var alternatives: js.UndefOr[js.Array[Alternative]] = js.undefined
  var arrival: js.UndefOr[String] = js.undefined
  var arrivalDelay: js.UndefOr[Double] = js.undefined
  var arrivalPlatform: js.UndefOr[String] = js.undefined
  var cancelled: js.UndefOr[Boolean] = js.undefined
  var cycle: js.UndefOr[Cycle] = js.undefined
  var departure: js.UndefOr[String] = js.undefined
  var departureDelay: js.UndefOr[Double] = js.undefined
  var departurePlatform: js.UndefOr[String] = js.undefined
  var destination: Station | Stop
  var direction: js.UndefOr[String] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Line] = js.undefined
  var loadFactor: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[Double] = js.undefined
  var origin: Station | Stop
  var plannedArrival: String
  var plannedArrivalPlatform: js.UndefOr[String] = js.undefined
  var plannedDeparture: String
  var plannedDeparturePlatform: js.UndefOr[String] = js.undefined
  var polyline: js.UndefOr[FeatureCollection] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var reachable: js.UndefOr[Boolean] = js.undefined
  var remarks: js.UndefOr[js.Array[Hint]] = js.undefined
  var schedule: js.UndefOr[Double] = js.undefined
  var stopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  var transfer: js.UndefOr[Boolean] = js.undefined
  var tripId: js.UndefOr[String] = js.undefined
  var walking: js.UndefOr[Boolean] = js.undefined
}

object Leg {
  @scala.inline
  def apply(
    destination: Station | Stop,
    origin: Station | Stop,
    plannedArrival: String,
    plannedDeparture: String,
    alternatives: js.Array[Alternative] = null,
    arrival: String = null,
    arrivalDelay: js.UndefOr[Double] = js.undefined,
    arrivalPlatform: String = null,
    cancelled: js.UndefOr[Boolean] = js.undefined,
    cycle: Cycle = null,
    departure: String = null,
    departureDelay: js.UndefOr[Double] = js.undefined,
    departurePlatform: String = null,
    direction: String = null,
    distance: js.UndefOr[Double] = js.undefined,
    line: Line = null,
    loadFactor: String = null,
    operator: js.UndefOr[Double] = js.undefined,
    plannedArrivalPlatform: String = null,
    plannedDeparturePlatform: String = null,
    polyline: FeatureCollection = null,
    price: Price = null,
    public: js.UndefOr[Boolean] = js.undefined,
    reachable: js.UndefOr[Boolean] = js.undefined,
    remarks: js.Array[Hint] = null,
    schedule: js.UndefOr[Double] = js.undefined,
    stopovers: js.Array[StopOver] = null,
    transfer: js.UndefOr[Boolean] = js.undefined,
    tripId: String = null,
    walking: js.UndefOr[Boolean] = js.undefined
  ): Leg = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plannedArrival = plannedArrival.asInstanceOf[js.Any], plannedDeparture = plannedDeparture.asInstanceOf[js.Any])
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (arrival != null) __obj.updateDynamic("arrival")(arrival.asInstanceOf[js.Any])
    if (!js.isUndefined(arrivalDelay)) __obj.updateDynamic("arrivalDelay")(arrivalDelay.get.asInstanceOf[js.Any])
    if (arrivalPlatform != null) __obj.updateDynamic("arrivalPlatform")(arrivalPlatform.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelled)) __obj.updateDynamic("cancelled")(cancelled.get.asInstanceOf[js.Any])
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (departure != null) __obj.updateDynamic("departure")(departure.asInstanceOf[js.Any])
    if (!js.isUndefined(departureDelay)) __obj.updateDynamic("departureDelay")(departureDelay.get.asInstanceOf[js.Any])
    if (departurePlatform != null) __obj.updateDynamic("departurePlatform")(departurePlatform.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (loadFactor != null) __obj.updateDynamic("loadFactor")(loadFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(operator)) __obj.updateDynamic("operator")(operator.get.asInstanceOf[js.Any])
    if (plannedArrivalPlatform != null) __obj.updateDynamic("plannedArrivalPlatform")(plannedArrivalPlatform.asInstanceOf[js.Any])
    if (plannedDeparturePlatform != null) __obj.updateDynamic("plannedDeparturePlatform")(plannedDeparturePlatform.asInstanceOf[js.Any])
    if (polyline != null) __obj.updateDynamic("polyline")(polyline.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reachable)) __obj.updateDynamic("reachable")(reachable.get.asInstanceOf[js.Any])
    if (remarks != null) __obj.updateDynamic("remarks")(remarks.asInstanceOf[js.Any])
    if (!js.isUndefined(schedule)) __obj.updateDynamic("schedule")(schedule.get.asInstanceOf[js.Any])
    if (stopovers != null) __obj.updateDynamic("stopovers")(stopovers.asInstanceOf[js.Any])
    if (!js.isUndefined(transfer)) __obj.updateDynamic("transfer")(transfer.get.asInstanceOf[js.Any])
    if (tripId != null) __obj.updateDynamic("tripId")(tripId.asInstanceOf[js.Any])
    if (!js.isUndefined(walking)) __obj.updateDynamic("walking")(walking.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
}

