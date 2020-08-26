package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A stopover represents a vehicle stopping at a stop/station at a specific time.
  */
@js.native
trait StopOver extends js.Object {
  /** null, if first stopOver of trip */
  var arrival: js.UndefOr[String] = js.native
  var arrivalDelay: js.UndefOr[Double] = js.native
  var arrivalPlatform: js.UndefOr[String] = js.native
  /** null, if last stopOver of trip */
  var departure: js.UndefOr[String] = js.native
  var departureDelay: js.UndefOr[Double] = js.native
  var departurePlatform: js.UndefOr[String] = js.native
  var plannedArrival: js.UndefOr[String] = js.native
  var plannedArrivalPlatform: js.UndefOr[String] = js.native
  var plannedDeparture: js.UndefOr[String] = js.native
  var plannedDeparturePlatform: js.UndefOr[String] = js.native
  var remarks: js.UndefOr[js.Array[Hint]] = js.native
  var stop: Station | Stop = js.native
}

object StopOver {
  @scala.inline
  def apply(stop: Station | Stop): StopOver = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOver]
  }
  @scala.inline
  implicit class StopOverOps[Self <: StopOver] (val x: Self) extends AnyVal {
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
    def setStop(value: Station | Stop): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrival(value: String): Self = this.set("arrival", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrival: Self = this.set("arrival", js.undefined)
    @scala.inline
    def setArrivalDelay(value: Double): Self = this.set("arrivalDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalDelay: Self = this.set("arrivalDelay", js.undefined)
    @scala.inline
    def setArrivalPlatform(value: String): Self = this.set("arrivalPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalPlatform: Self = this.set("arrivalPlatform", js.undefined)
    @scala.inline
    def setDeparture(value: String): Self = this.set("departure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeparture: Self = this.set("departure", js.undefined)
    @scala.inline
    def setDepartureDelay(value: Double): Self = this.set("departureDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepartureDelay: Self = this.set("departureDelay", js.undefined)
    @scala.inline
    def setDeparturePlatform(value: String): Self = this.set("departurePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeparturePlatform: Self = this.set("departurePlatform", js.undefined)
    @scala.inline
    def setPlannedArrival(value: String): Self = this.set("plannedArrival", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedArrival: Self = this.set("plannedArrival", js.undefined)
    @scala.inline
    def setPlannedArrivalPlatform(value: String): Self = this.set("plannedArrivalPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedArrivalPlatform: Self = this.set("plannedArrivalPlatform", js.undefined)
    @scala.inline
    def setPlannedDeparture(value: String): Self = this.set("plannedDeparture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedDeparture: Self = this.set("plannedDeparture", js.undefined)
    @scala.inline
    def setPlannedDeparturePlatform(value: String): Self = this.set("plannedDeparturePlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlannedDeparturePlatform: Self = this.set("plannedDeparturePlatform", js.undefined)
    @scala.inline
    def setRemarksVarargs(value: Hint*): Self = this.set("remarks", js.Array(value :_*))
    @scala.inline
    def setRemarks(value: js.Array[Hint]): Self = this.set("remarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
  }
  
}

