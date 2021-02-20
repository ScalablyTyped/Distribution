package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Trip – a vehicle stopping at a set of stops at specific times
  */
@js.native
trait Trip extends StObject {
  
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
  implicit class TripMutableBuilder[Self <: Trip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    @scala.inline
    def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    @scala.inline
    def setArrival(value: String): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalDelay(value: Double): Self = StObject.set(x, "arrivalDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalDelayUndefined: Self = StObject.set(x, "arrivalDelay", js.undefined)
    
    @scala.inline
    def setArrivalPlatform(value: String): Self = StObject.set(x, "arrivalPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrivalPlatformUndefined: Self = StObject.set(x, "arrivalPlatform", js.undefined)
    
    @scala.inline
    def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    @scala.inline
    def setCycle(value: Cycle): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    @scala.inline
    def setDeparture(value: String): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureDelay(value: Double): Self = StObject.set(x, "departureDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartureDelayUndefined: Self = StObject.set(x, "departureDelay", js.undefined)
    
    @scala.inline
    def setDeparturePlatform(value: String): Self = StObject.set(x, "departurePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparturePlatformUndefined: Self = StObject.set(x, "departurePlatform", js.undefined)
    
    @scala.inline
    def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
    
    @scala.inline
    def setDestination(value: Station | Stop): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    @scala.inline
    def setOperator(value: Double): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setOrigin(value: Station | Stop): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedArrival(value: String): Self = StObject.set(x, "plannedArrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedArrivalPlatform(value: String): Self = StObject.set(x, "plannedArrivalPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedArrivalPlatformUndefined: Self = StObject.set(x, "plannedArrivalPlatform", js.undefined)
    
    @scala.inline
    def setPlannedArrivalUndefined: Self = StObject.set(x, "plannedArrival", js.undefined)
    
    @scala.inline
    def setPlannedDeparture(value: String): Self = StObject.set(x, "plannedDeparture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedDeparturePlatform(value: String): Self = StObject.set(x, "plannedDeparturePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedDeparturePlatformUndefined: Self = StObject.set(x, "plannedDeparturePlatform", js.undefined)
    
    @scala.inline
    def setPlannedDepartureUndefined: Self = StObject.set(x, "plannedDeparture", js.undefined)
    
    @scala.inline
    def setPolyline(value: FeatureCollection): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setPrognosedArrival(value: String): Self = StObject.set(x, "prognosedArrival", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedArrivalPlatform(value: String): Self = StObject.set(x, "prognosedArrivalPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedArrivalPlatformUndefined: Self = StObject.set(x, "prognosedArrivalPlatform", js.undefined)
    
    @scala.inline
    def setPrognosedArrivalUndefined: Self = StObject.set(x, "prognosedArrival", js.undefined)
    
    @scala.inline
    def setPrognosedDeparture(value: String): Self = StObject.set(x, "prognosedDeparture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedDeparturePlatform(value: String): Self = StObject.set(x, "prognosedDeparturePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedDeparturePlatformUndefined: Self = StObject.set(x, "prognosedDeparturePlatform", js.undefined)
    
    @scala.inline
    def setPrognosedDepartureUndefined: Self = StObject.set(x, "prognosedDeparture", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setReachable(value: Boolean): Self = StObject.set(x, "reachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachableUndefined: Self = StObject.set(x, "reachable", js.undefined)
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = StObject.set(x, "remarks", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    @scala.inline
    def setStopoversVarargs(value: StopOver*): Self = StObject.set(x, "stopovers", js.Array(value :_*))
    
    @scala.inline
    def setTransfer(value: Boolean): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    @scala.inline
    def setWalking(value: Boolean): Self = StObject.set(x, "walking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWalkingUndefined: Self = StObject.set(x, "walking", js.undefined)
  }
}
