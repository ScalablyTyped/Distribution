package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Trip – a vehicle stopping at a set of stops at specific times
  */
@js.native
trait Trip extends js.Object {
  
  var alternatives: js.UndefOr[js.Array[Alternative]] = js.native
  
  var arrival: js.UndefOr[String] = js.native
  
  var arrivalDelay: js.UndefOr[Double] = js.native
  
  var arrivalPlatform: js.UndefOr[String] = js.native
  
  var cancelled: js.UndefOr[Boolean] = js.native
  
  var cycle: js.UndefOr[Cycle] = js.native
  
  var departure: js.UndefOr[String] = js.native
  
  var departureDelay: js.UndefOr[Double] = js.native
  
  var departurePlatform: js.UndefOr[String] = js.native
  
  var destination: Station | Stop = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var line: js.UndefOr[Line] = js.native
  
  var loadFactor: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[Double] = js.native
  
  var origin: Station | Stop = js.native
  
  var plannedArrival: js.UndefOr[String] = js.native
  
  var plannedArrivalPlatform: js.UndefOr[String] = js.native
  
  var plannedDeparture: js.UndefOr[String] = js.native
  
  var plannedDeparturePlatform: js.UndefOr[String] = js.native
  
  var polyline: js.UndefOr[FeatureCollection] = js.native
  
  var price: js.UndefOr[Price] = js.native
  
  var prognosedArrival: js.UndefOr[String] = js.native
  
  var prognosedArrivalPlatform: js.UndefOr[String] = js.native
  
  var prognosedDeparture: js.UndefOr[String] = js.native
  
  var prognosedDeparturePlatform: js.UndefOr[String] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var reachable: js.UndefOr[Boolean] = js.native
  
  var remarks: js.UndefOr[js.Array[Hint | Warning]] = js.native
  
  var schedule: js.UndefOr[Double] = js.native
  
  var stopovers: js.UndefOr[js.Array[StopOver]] = js.native
  
  var transfer: js.UndefOr[Boolean] = js.native
  
  var walking: js.UndefOr[Boolean] = js.native
}
object Trip {
  
  @scala.inline
  def apply(destination: Station | Stop, id: String, origin: Station | Stop): Trip = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
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
    def setDestination(value: Station | Stop): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: Station | Stop): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesVarargs(value: Alternative*): Self = this.set("alternatives", js.Array(value :_*))
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = this.set("alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternatives: Self = this.set("alternatives", js.undefined)
    
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
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    
    @scala.inline
    def setCycle(value: Cycle): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
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
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLoadFactor(value: String): Self = this.set("loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadFactor: Self = this.set("loadFactor", js.undefined)
    
    @scala.inline
    def setOperator(value: Double): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
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
    def setPolyline(value: FeatureCollection): Self = this.set("polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolyline: Self = this.set("polyline", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setPrognosedArrival(value: String): Self = this.set("prognosedArrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedArrival: Self = this.set("prognosedArrival", js.undefined)
    
    @scala.inline
    def setPrognosedArrivalPlatform(value: String): Self = this.set("prognosedArrivalPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedArrivalPlatform: Self = this.set("prognosedArrivalPlatform", js.undefined)
    
    @scala.inline
    def setPrognosedDeparture(value: String): Self = this.set("prognosedDeparture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedDeparture: Self = this.set("prognosedDeparture", js.undefined)
    
    @scala.inline
    def setPrognosedDeparturePlatform(value: String): Self = this.set("prognosedDeparturePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedDeparturePlatform: Self = this.set("prognosedDeparturePlatform", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setReachable(value: Boolean): Self = this.set("reachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReachable: Self = this.set("reachable", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = this.set("remarks", js.Array(value :_*))
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = this.set("remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    
    @scala.inline
    def setSchedule(value: Double): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setStopoversVarargs(value: StopOver*): Self = this.set("stopovers", js.Array(value :_*))
    
    @scala.inline
    def setStopovers(value: js.Array[StopOver]): Self = this.set("stopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopovers: Self = this.set("stopovers", js.undefined)
    
    @scala.inline
    def setTransfer(value: Boolean): Self = this.set("transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransfer: Self = this.set("transfer", js.undefined)
    
    @scala.inline
    def setWalking(value: Boolean): Self = this.set("walking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWalking: Self = this.set("walking", js.undefined)
  }
}
