package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alternative extends js.Object {
  
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
  implicit class AlternativeOps[Self <: Alternative] (val x: Self) extends AnyVal {
    
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
    def setTripId(value: String): Self = this.set("tripId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelled(value: Boolean): Self = this.set("cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled: Self = this.set("cancelled", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLoadFactor(value: String): Self = this.set("loadFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadFactor: Self = this.set("loadFactor", js.undefined)
    
    @scala.inline
    def setNextStopoversVarargs(value: StopOver*): Self = this.set("nextStopovers", js.Array(value :_*))
    
    @scala.inline
    def setNextStopovers(value: js.Array[StopOver]): Self = this.set("nextStopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextStopovers: Self = this.set("nextStopovers", js.undefined)
    
    @scala.inline
    def setPlannedPlatform(value: String): Self = this.set("plannedPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedPlatform: Self = this.set("plannedPlatform", js.undefined)
    
    @scala.inline
    def setPlannedWhen(value: String): Self = this.set("plannedWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlannedWhen: Self = this.set("plannedWhen", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPreviousStopoversVarargs(value: StopOver*): Self = this.set("previousStopovers", js.Array(value :_*))
    
    @scala.inline
    def setPreviousStopovers(value: js.Array[StopOver]): Self = this.set("previousStopovers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousStopovers: Self = this.set("previousStopovers", js.undefined)
    
    @scala.inline
    def setPrognosedPlatform(value: String): Self = this.set("prognosedPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedPlatform: Self = this.set("prognosedPlatform", js.undefined)
    
    @scala.inline
    def setPrognosedWhen(value: String): Self = this.set("prognosedWhen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrognosedWhen: Self = this.set("prognosedWhen", js.undefined)
    
    @scala.inline
    def setProvenance(value: String): Self = this.set("provenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvenance: Self = this.set("provenance", js.undefined)
    
    @scala.inline
    def setRemarksVarargs(value: (Hint | Warning)*): Self = this.set("remarks", js.Array(value :_*))
    
    @scala.inline
    def setRemarks(value: js.Array[Hint | Warning]): Self = this.set("remarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarks: Self = this.set("remarks", js.undefined)
    
    @scala.inline
    def setStop(value: Station | Stop): Self = this.set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setWhen(value: String): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
