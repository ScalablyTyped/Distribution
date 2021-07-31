package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A stopover represents a vehicle stopping at a stop/station at a specific time.
  */
trait StopOver extends StObject {
  
  /** null, if first stopOver of trip */
  var arrival: js.UndefOr[String] = js.undefined
  
  var arrivalDelay: js.UndefOr[Double] = js.undefined
  
  var arrivalPlatform: js.UndefOr[String] = js.undefined
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  /** null, if last stopOver of trip */
  var departure: js.UndefOr[String] = js.undefined
  
  var departureDelay: js.UndefOr[Double] = js.undefined
  
  var departurePlatform: js.UndefOr[String] = js.undefined
  
  var passBy: js.UndefOr[Boolean] = js.undefined
  
  var plannedArrival: js.UndefOr[String] = js.undefined
  
  var plannedArrivalPlatform: js.UndefOr[String] = js.undefined
  
  var plannedDeparture: js.UndefOr[String] = js.undefined
  
  var plannedDeparturePlatform: js.UndefOr[String] = js.undefined
  
  var prognosedArrival: js.UndefOr[String] = js.undefined
  
  var prognosedArrivalPlatform: js.UndefOr[String] = js.undefined
  
  var prognosedDeparture: js.UndefOr[String] = js.undefined
  
  var prognosedDeparturePlatform: js.UndefOr[String] = js.undefined
  
  var remarks: js.UndefOr[js.Array[Hint | Warning]] = js.undefined
  
  var stop: Station | Stop
}
object StopOver {
  
  @scala.inline
  def apply(stop: Station | Stop): StopOver = {
    val __obj = js.Dynamic.literal(stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopOver]
  }
  
  @scala.inline
  implicit class StopOverMutableBuilder[Self <: StopOver] (val x: Self) extends AnyVal {
    
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
    def setPassBy(value: Boolean): Self = StObject.set(x, "passBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassByUndefined: Self = StObject.set(x, "passBy", js.undefined)
    
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
    def setRemarks(value: js.Array[Hint | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = StObject.set(x, "remarks", js.Array(value :_*))
    
    @scala.inline
    def setStop(value: Station | Stop): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
