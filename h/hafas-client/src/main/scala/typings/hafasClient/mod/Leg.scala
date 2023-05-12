package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leg extends StObject {
  
  var alternatives: js.UndefOr[js.Array[Alternative]] = js.undefined
  
  var arrival: js.UndefOr[String] = js.undefined
  
  var arrivalDelay: js.UndefOr[Double] = js.undefined
  
  var arrivalPlatform: js.UndefOr[String] = js.undefined
  
  var arrivalPrognosisType: js.UndefOr[PrognosisType] = js.undefined
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  var checkin: js.UndefOr[Boolean] = js.undefined
  
  var currentLocation: js.UndefOr[Location] = js.undefined
  
  var cycle: js.UndefOr[Cycle] = js.undefined
  
  var departure: js.UndefOr[String] = js.undefined
  
  var departureDelay: js.UndefOr[Double] = js.undefined
  
  var departurePlatform: js.UndefOr[String] = js.undefined
  
  var departurePrognosisType: js.UndefOr[PrognosisType] = js.undefined
  
  var destination: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[Line] = js.undefined
  
  var loadFactor: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[Double] = js.undefined
  
  var origin: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var plannedArrival: js.UndefOr[String] = js.undefined
  
  var plannedArrivalPlatform: js.UndefOr[String] = js.undefined
  
  var plannedDeparture: js.UndefOr[String] = js.undefined
  
  var plannedDeparturePlatform: js.UndefOr[String] = js.undefined
  
  var polyline: js.UndefOr[FeatureCollection] = js.undefined
  
  var price: js.UndefOr[Price] = js.undefined
  
  var prognosedArrival: js.UndefOr[String] = js.undefined
  
  var prognosedArrivalPlatform: js.UndefOr[String] = js.undefined
  
  var prognosedDeparture: js.UndefOr[String] = js.undefined
  
  var prognosedDeparturePlatform: js.UndefOr[String] = js.undefined
  
  var public: js.UndefOr[Boolean] = js.undefined
  
  var reachable: js.UndefOr[Boolean] = js.undefined
  
  var remarks: js.UndefOr[js.Array[Hint | Status | Warning]] = js.undefined
  
  var schedule: js.UndefOr[Double] = js.undefined
  
  var stopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  
  var transfer: js.UndefOr[Boolean] = js.undefined
  
  var tripId: js.UndefOr[String] = js.undefined
  
  var walking: js.UndefOr[Boolean] = js.undefined
}
object Leg {
  
  inline def apply(): Leg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Leg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Leg] (val x: Self) extends AnyVal {
    
    inline def setAlternatives(value: js.Array[Alternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesUndefined: Self = StObject.set(x, "alternatives", js.undefined)
    
    inline def setAlternativesVarargs(value: Alternative*): Self = StObject.set(x, "alternatives", js.Array(value*))
    
    inline def setArrival(value: String): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
    
    inline def setArrivalDelay(value: Double): Self = StObject.set(x, "arrivalDelay", value.asInstanceOf[js.Any])
    
    inline def setArrivalDelayUndefined: Self = StObject.set(x, "arrivalDelay", js.undefined)
    
    inline def setArrivalPlatform(value: String): Self = StObject.set(x, "arrivalPlatform", value.asInstanceOf[js.Any])
    
    inline def setArrivalPlatformUndefined: Self = StObject.set(x, "arrivalPlatform", js.undefined)
    
    inline def setArrivalPrognosisType(value: PrognosisType): Self = StObject.set(x, "arrivalPrognosisType", value.asInstanceOf[js.Any])
    
    inline def setArrivalPrognosisTypeUndefined: Self = StObject.set(x, "arrivalPrognosisType", js.undefined)
    
    inline def setArrivalUndefined: Self = StObject.set(x, "arrival", js.undefined)
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setCheckin(value: Boolean): Self = StObject.set(x, "checkin", value.asInstanceOf[js.Any])
    
    inline def setCheckinUndefined: Self = StObject.set(x, "checkin", js.undefined)
    
    inline def setCurrentLocation(value: Location): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setCurrentLocationUndefined: Self = StObject.set(x, "currentLocation", js.undefined)
    
    inline def setCycle(value: Cycle): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
    
    inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
    
    inline def setDeparture(value: String): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
    
    inline def setDepartureDelay(value: Double): Self = StObject.set(x, "departureDelay", value.asInstanceOf[js.Any])
    
    inline def setDepartureDelayUndefined: Self = StObject.set(x, "departureDelay", js.undefined)
    
    inline def setDeparturePlatform(value: String): Self = StObject.set(x, "departurePlatform", value.asInstanceOf[js.Any])
    
    inline def setDeparturePlatformUndefined: Self = StObject.set(x, "departurePlatform", js.undefined)
    
    inline def setDeparturePrognosisType(value: PrognosisType): Self = StObject.set(x, "departurePrognosisType", value.asInstanceOf[js.Any])
    
    inline def setDeparturePrognosisTypeUndefined: Self = StObject.set(x, "departurePrognosisType", js.undefined)
    
    inline def setDepartureUndefined: Self = StObject.set(x, "departure", js.undefined)
    
    inline def setDestination(value: Station | Stop | Location): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    inline def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    inline def setOperator(value: Double): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setOrigin(value: Station | Stop | Location): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPlannedArrival(value: String): Self = StObject.set(x, "plannedArrival", value.asInstanceOf[js.Any])
    
    inline def setPlannedArrivalPlatform(value: String): Self = StObject.set(x, "plannedArrivalPlatform", value.asInstanceOf[js.Any])
    
    inline def setPlannedArrivalPlatformUndefined: Self = StObject.set(x, "plannedArrivalPlatform", js.undefined)
    
    inline def setPlannedArrivalUndefined: Self = StObject.set(x, "plannedArrival", js.undefined)
    
    inline def setPlannedDeparture(value: String): Self = StObject.set(x, "plannedDeparture", value.asInstanceOf[js.Any])
    
    inline def setPlannedDeparturePlatform(value: String): Self = StObject.set(x, "plannedDeparturePlatform", value.asInstanceOf[js.Any])
    
    inline def setPlannedDeparturePlatformUndefined: Self = StObject.set(x, "plannedDeparturePlatform", js.undefined)
    
    inline def setPlannedDepartureUndefined: Self = StObject.set(x, "plannedDeparture", js.undefined)
    
    inline def setPolyline(value: FeatureCollection): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setPrognosedArrival(value: String): Self = StObject.set(x, "prognosedArrival", value.asInstanceOf[js.Any])
    
    inline def setPrognosedArrivalPlatform(value: String): Self = StObject.set(x, "prognosedArrivalPlatform", value.asInstanceOf[js.Any])
    
    inline def setPrognosedArrivalPlatformUndefined: Self = StObject.set(x, "prognosedArrivalPlatform", js.undefined)
    
    inline def setPrognosedArrivalUndefined: Self = StObject.set(x, "prognosedArrival", js.undefined)
    
    inline def setPrognosedDeparture(value: String): Self = StObject.set(x, "prognosedDeparture", value.asInstanceOf[js.Any])
    
    inline def setPrognosedDeparturePlatform(value: String): Self = StObject.set(x, "prognosedDeparturePlatform", value.asInstanceOf[js.Any])
    
    inline def setPrognosedDeparturePlatformUndefined: Self = StObject.set(x, "prognosedDeparturePlatform", js.undefined)
    
    inline def setPrognosedDepartureUndefined: Self = StObject.set(x, "prognosedDeparture", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    inline def setReachable(value: Boolean): Self = StObject.set(x, "reachable", value.asInstanceOf[js.Any])
    
    inline def setReachableUndefined: Self = StObject.set(x, "reachable", js.undefined)
    
    inline def setRemarks(value: js.Array[Hint | Status | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setRemarksVarargs(value: (Hint | Status | Warning)*): Self = StObject.set(x, "remarks", js.Array(value*))
    
    inline def setSchedule(value: Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    inline def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    inline def setStopoversVarargs(value: StopOver*): Self = StObject.set(x, "stopovers", js.Array(value*))
    
    inline def setTransfer(value: Boolean): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
    
    inline def setWalking(value: Boolean): Self = StObject.set(x, "walking", value.asInstanceOf[js.Any])
    
    inline def setWalkingUndefined: Self = StObject.set(x, "walking", js.undefined)
  }
}
