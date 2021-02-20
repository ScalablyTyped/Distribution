package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternative extends StObject {
  
  var cancelled: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var line: js.UndefOr[Line] = js.native
  
  var loadFactor: js.UndefOr[String] = js.native
  
  var nextStopovers: js.UndefOr[js.Array[StopOver]] = js.native
  
  var plannedPlatform: js.UndefOr[String] = js.native
  
  var plannedWhen: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var previousStopovers: js.UndefOr[js.Array[StopOver]] = js.native
  
  var prognosedPlatform: js.UndefOr[String] = js.native
  
  var prognosedWhen: js.UndefOr[String] = js.native
  
  var provenance: js.UndefOr[String] = js.native
  
  var remarks: js.UndefOr[js.Array[Hint | Warning]] = js.native
  
  var stop: js.UndefOr[Station | Stop] = js.native
  
  var tripId: String = js.native
  
  var when: js.UndefOr[String] = js.native
}
object Alternative {
  
  @scala.inline
  def apply(tripId: String): Alternative = {
    val __obj = js.Dynamic.literal(tripId = tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternative]
  }
  
  @scala.inline
  implicit class AlternativeMutableBuilder[Self <: Alternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setLine(value: Line): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setLoadFactor(value: String): Self = StObject.set(x, "loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadFactorUndefined: Self = StObject.set(x, "loadFactor", js.undefined)
    
    @scala.inline
    def setNextStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "nextStopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStopoversUndefined: Self = StObject.set(x, "nextStopovers", js.undefined)
    
    @scala.inline
    def setNextStopoversVarargs(value: StopOver*): Self = StObject.set(x, "nextStopovers", js.Array(value :_*))
    
    @scala.inline
    def setPlannedPlatform(value: String): Self = StObject.set(x, "plannedPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedPlatformUndefined: Self = StObject.set(x, "plannedPlatform", js.undefined)
    
    @scala.inline
    def setPlannedWhen(value: String): Self = StObject.set(x, "plannedWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlannedWhenUndefined: Self = StObject.set(x, "plannedWhen", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setPreviousStopovers(value: js.Array[StopOver]): Self = StObject.set(x, "previousStopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousStopoversUndefined: Self = StObject.set(x, "previousStopovers", js.undefined)
    
    @scala.inline
    def setPreviousStopoversVarargs(value: StopOver*): Self = StObject.set(x, "previousStopovers", js.Array(value :_*))
    
    @scala.inline
    def setPrognosedPlatform(value: String): Self = StObject.set(x, "prognosedPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedPlatformUndefined: Self = StObject.set(x, "prognosedPlatform", js.undefined)
    
    @scala.inline
    def setPrognosedWhen(value: String): Self = StObject.set(x, "prognosedWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrognosedWhenUndefined: Self = StObject.set(x, "prognosedWhen", js.undefined)
    
    @scala.inline
    def setProvenance(value: String): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = StObject.set(x, "remarks", js.Array(value :_*))
    
    @scala.inline
    def setStop(value: Station | Stop): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
