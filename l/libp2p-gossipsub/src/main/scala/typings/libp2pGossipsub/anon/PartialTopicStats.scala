package typings.libp2pGossipsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-stats.TopicStats> */
@js.native
trait PartialTopicStats extends js.Object {
  
  var firstMessageDeliveries: js.UndefOr[Double] = js.native
  
  var graftTime: js.UndefOr[Double] = js.native
  
  var inMesh: js.UndefOr[Boolean] = js.native
  
  var invalidMessageDeliveries: js.UndefOr[Double] = js.native
  
  var meshFailurePenalty: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveries: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesActive: js.UndefOr[Boolean] = js.native
  
  var meshTime: js.UndefOr[Double] = js.native
}
object PartialTopicStats {
  
  @scala.inline
  def apply(): PartialTopicStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTopicStats]
  }
  
  @scala.inline
  implicit class PartialTopicStatsOps[Self <: PartialTopicStats] (val x: Self) extends AnyVal {
    
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
    def setFirstMessageDeliveries(value: Double): Self = this.set("firstMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstMessageDeliveries: Self = this.set("firstMessageDeliveries", js.undefined)
    
    @scala.inline
    def setGraftTime(value: Double): Self = this.set("graftTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraftTime: Self = this.set("graftTime", js.undefined)
    
    @scala.inline
    def setInMesh(value: Boolean): Self = this.set("inMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInMesh: Self = this.set("inMesh", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveries(value: Double): Self = this.set("invalidMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMessageDeliveries: Self = this.set("invalidMessageDeliveries", js.undefined)
    
    @scala.inline
    def setMeshFailurePenalty(value: Double): Self = this.set("meshFailurePenalty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshFailurePenalty: Self = this.set("meshFailurePenalty", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveries(value: Double): Self = this.set("meshMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveries: Self = this.set("meshMessageDeliveries", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesActive(value: Boolean): Self = this.set("meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesActive: Self = this.set("meshMessageDeliveriesActive", js.undefined)
    
    @scala.inline
    def setMeshTime(value: Double): Self = this.set("meshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshTime: Self = this.set("meshTime", js.undefined)
  }
}
