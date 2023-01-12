package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alternative extends StObject {
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  var currentTripPosition: js.UndefOr[Location] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var destination: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var frames: js.UndefOr[js.Array[Frame]] = js.undefined
  
  var line: js.UndefOr[Line] = js.undefined
  
  var loadFactor: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[Location] = js.undefined
  
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  
  var origin: js.UndefOr[Station | Stop | Location] = js.undefined
  
  var plannedPlatform: js.UndefOr[String] = js.undefined
  
  var plannedWhen: js.UndefOr[String] = js.undefined
  
  var platform: js.UndefOr[String] = js.undefined
  
  var polyline: js.UndefOr[FeatureCollection] = js.undefined
  
  var previousStopovers: js.UndefOr[js.Array[StopOver]] = js.undefined
  
  var prognosedPlatform: js.UndefOr[String] = js.undefined
  
  var prognosedWhen: js.UndefOr[String] = js.undefined
  
  var prognosisType: js.UndefOr[PrognosisType] = js.undefined
  
  var provenance: js.UndefOr[String] = js.undefined
  
  var remarks: js.UndefOr[js.Array[Hint | Status | Warning]] = js.undefined
  
  var stop: js.UndefOr[Station | Stop] = js.undefined
  
  var tripId: String
  
  var when: js.UndefOr[String] = js.undefined
}
object Alternative {
  
  inline def apply(tripId: String): Alternative = {
    val __obj = js.Dynamic.literal(tripId = tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setCurrentTripPosition(value: Location): Self = StObject.set(x, "currentTripPosition", value.asInstanceOf[js.Any])
    
    inline def setCurrentTripPositionUndefined: Self = StObject.set(x, "currentTripPosition", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDestination(value: Station | Stop | Location): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setFrames(value: js.Array[Frame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
    
    inline def setFramesVarargs(value: Frame*): Self = StObject.set(x, "frames", js.Array(value*))
    
    inline def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    inline def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNextStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "nextStopovers", value.asInstanceOf[js.Any])
    
    inline def setNextStopoversUndefined: Self = StObject.set(x, "nextStopovers", js.undefined)
    
    inline def setNextStopoversVarargs(value: StopOver*): Self = StObject.set(x, "nextStopovers", js.Array(value*))
    
    inline def setOrigin(value: Station | Stop | Location): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPlannedPlatform(value: String): Self = StObject.set(x, "plannedPlatform", value.asInstanceOf[js.Any])
    
    inline def setPlannedPlatformUndefined: Self = StObject.set(x, "plannedPlatform", js.undefined)
    
    inline def setPlannedWhen(value: String): Self = StObject.set(x, "plannedWhen", value.asInstanceOf[js.Any])
    
    inline def setPlannedWhenUndefined: Self = StObject.set(x, "plannedWhen", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPolyline(value: FeatureCollection): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
    
    inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
    
    inline def setPreviousStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "previousStopovers", value.asInstanceOf[js.Any])
    
    inline def setPreviousStopoversUndefined: Self = StObject.set(x, "previousStopovers", js.undefined)
    
    inline def setPreviousStopoversVarargs(value: StopOver*): Self = StObject.set(x, "previousStopovers", js.Array(value*))
    
    inline def setPrognosedPlatform(value: String): Self = StObject.set(x, "prognosedPlatform", value.asInstanceOf[js.Any])
    
    inline def setPrognosedPlatformUndefined: Self = StObject.set(x, "prognosedPlatform", js.undefined)
    
    inline def setPrognosedWhen(value: String): Self = StObject.set(x, "prognosedWhen", value.asInstanceOf[js.Any])
    
    inline def setPrognosedWhenUndefined: Self = StObject.set(x, "prognosedWhen", js.undefined)
    
    inline def setPrognosisType(value: PrognosisType): Self = StObject.set(x, "prognosisType", value.asInstanceOf[js.Any])
    
    inline def setPrognosisTypeUndefined: Self = StObject.set(x, "prognosisType", js.undefined)
    
    inline def setProvenance(value: String): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    inline def setRemarks(value: js.Array[Hint | Status | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setRemarksVarargs(value: (Hint | Status | Warning)*): Self = StObject.set(x, "remarks", js.Array(value*))
    
    inline def setStop(value: Station | Stop): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
