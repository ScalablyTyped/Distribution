package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trip extends js.Object {
  var arrival: String = js.native
  var arrivalDelay: js.UndefOr[Double] = js.native
  var arrivalPlatform: js.UndefOr[String] = js.native
  var departure: String = js.native
  var departureDelay: js.UndefOr[Double] = js.native
  var departurePlatform: js.UndefOr[String] = js.native
  var destination: Stop = js.native
  var direction: js.UndefOr[String] = js.native
  var id: String = js.native
  var line: js.UndefOr[Line] = js.native
  var origin: Stop = js.native
  var plannedArrival: String = js.native
  var plannedArrivalPlatform: js.UndefOr[String] = js.native
  var plannedDeparture: String = js.native
  var plannedDeparturePlatform: js.UndefOr[String] = js.native
  var polyline: js.UndefOr[FeatureCollection] = js.native
  var reachable: js.UndefOr[Boolean] = js.native
  var remarks: js.UndefOr[js.Array[Hint]] = js.native
  var stopovers: js.Array[StopOver] = js.native
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
    stopovers: js.Array[StopOver]
  ): Trip = {
    val __obj = js.Dynamic.literal(arrival = arrival.asInstanceOf[js.Any], departure = departure.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], plannedArrival = plannedArrival.asInstanceOf[js.Any], plannedDeparture = plannedDeparture.asInstanceOf[js.Any], stopovers = stopovers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trip]
  }
  @scala.inline
  implicit class TripOps[Self <: Trip] (val x: Self) extends AnyVal {
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
    def setArrival(value: String): Self = this.set("arrival", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeparture(value: String): Self = this.set("departure", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: Stop): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: Stop): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlannedArrival(value: String): Self = this.set("plannedArrival", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlannedDeparture(value: String): Self = this.set("plannedDeparture", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopoversVarargs(value: StopOver*): Self = this.set("stopovers", js.Array(value :_*))
    @scala.inline
    def setStopovers(value: js.Array[StopOver]): Self = this.set("stopovers", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrivalDelay(value: Double): Self = this.set("arrivalDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalDelay: Self = this.set("arrivalDelay", js.undefined)
    @scala.inline
    def setArrivalPlatform(value: String): Self = this.set("arrivalPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalPlatform: Self = this.set("arrivalPlatform", js.undefined)
    @scala.inline
    def setDepartureDelay(value: Double): Self = this.set("departureDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartureDelay: Self = this.set("departureDelay", js.undefined)
    @scala.inline
    def setDeparturePlatform(value: String): Self = this.set("departurePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeparturePlatform: Self = this.set("departurePlatform", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPlannedArrivalPlatform(value: String): Self = this.set("plannedArrivalPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedArrivalPlatform: Self = this.set("plannedArrivalPlatform", js.undefined)
    @scala.inline
    def setPlannedDeparturePlatform(value: String): Self = this.set("plannedDeparturePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedDeparturePlatform: Self = this.set("plannedDeparturePlatform", js.undefined)
    @scala.inline
    def setPolyline(value: FeatureCollection): Self = this.set("polyline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    @scala.inline
    def setReachable(value: Boolean): Self = this.set("reachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachable: Self = this.set("reachable", js.undefined)
    @scala.inline
    def setRemarksVarargs(value: Hint*): Self = this.set("remarks", js.Array(value :_*))
    @scala.inline
    def setRemarks(value: js.Array[Hint]): Self = this.set("remarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
  }
  
}

