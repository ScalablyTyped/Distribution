package typings.libp2pGossipsub.peerStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicStats extends js.Object {
  
  /**
    * first message deliveries
    */
  var firstMessageDeliveries: Double = js.native
  
  /**
    * time when the peer was (last) GRAFTed; valid only when in mesh
    */
  var graftTime: Double = js.native
  
  /**
    * true if the peer is in the mesh
    */
  var inMesh: Boolean = js.native
  
  /**
    * invalid message counter
    */
  var invalidMessageDeliveries: Double = js.native
  
  /**
    * sticky mesh rate failure penalty counter
    */
  var meshFailurePenalty: Double = js.native
  
  /**
    * mesh message deliveries
    */
  var meshMessageDeliveries: Double = js.native
  
  /**
    * true if the peer has been enough time in the mesh to activate mess message deliveries
    */
  var meshMessageDeliveriesActive: Boolean = js.native
  
  /**
    * time in mesh (updated during refresh/decay to avoid calling gettimeofday on
    * every score invocation)
    */
  var meshTime: Double = js.native
}
object TopicStats {
  
  @scala.inline
  def apply(
    firstMessageDeliveries: Double,
    graftTime: Double,
    inMesh: Boolean,
    invalidMessageDeliveries: Double,
    meshFailurePenalty: Double,
    meshMessageDeliveries: Double,
    meshMessageDeliveriesActive: Boolean,
    meshTime: Double
  ): TopicStats = {
    val __obj = js.Dynamic.literal(firstMessageDeliveries = firstMessageDeliveries.asInstanceOf[js.Any], graftTime = graftTime.asInstanceOf[js.Any], inMesh = inMesh.asInstanceOf[js.Any], invalidMessageDeliveries = invalidMessageDeliveries.asInstanceOf[js.Any], meshFailurePenalty = meshFailurePenalty.asInstanceOf[js.Any], meshMessageDeliveries = meshMessageDeliveries.asInstanceOf[js.Any], meshMessageDeliveriesActive = meshMessageDeliveriesActive.asInstanceOf[js.Any], meshTime = meshTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicStats]
  }
  
  @scala.inline
  implicit class TopicStatsOps[Self <: TopicStats] (val x: Self) extends AnyVal {
    
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
    def setGraftTime(value: Double): Self = this.set("graftTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMesh(value: Boolean): Self = this.set("inMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveries(value: Double): Self = this.set("invalidMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenalty(value: Double): Self = this.set("meshFailurePenalty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveries(value: Double): Self = this.set("meshMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesActive(value: Boolean): Self = this.set("meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshTime(value: Double): Self = this.set("meshTime", value.asInstanceOf[js.Any])
  }
}
