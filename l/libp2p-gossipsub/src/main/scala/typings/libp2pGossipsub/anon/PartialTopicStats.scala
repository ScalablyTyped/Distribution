package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-stats.TopicStats> */
@js.native
trait PartialTopicStats extends StObject {
  
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
  implicit class PartialTopicStatsMutableBuilder[Self <: PartialTopicStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstMessageDeliveries(value: Double): Self = StObject.set(x, "firstMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesUndefined: Self = StObject.set(x, "firstMessageDeliveries", js.undefined)
    
    @scala.inline
    def setGraftTime(value: Double): Self = StObject.set(x, "graftTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraftTimeUndefined: Self = StObject.set(x, "graftTime", js.undefined)
    
    @scala.inline
    def setInMesh(value: Boolean): Self = StObject.set(x, "inMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMeshUndefined: Self = StObject.set(x, "inMesh", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveries(value: Double): Self = StObject.set(x, "invalidMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveriesUndefined: Self = StObject.set(x, "invalidMessageDeliveries", js.undefined)
    
    @scala.inline
    def setMeshFailurePenalty(value: Double): Self = StObject.set(x, "meshFailurePenalty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenaltyUndefined: Self = StObject.set(x, "meshFailurePenalty", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveries(value: Double): Self = StObject.set(x, "meshMessageDeliveries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesActive(value: Boolean): Self = StObject.set(x, "meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesActiveUndefined: Self = StObject.set(x, "meshMessageDeliveriesActive", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesUndefined: Self = StObject.set(x, "meshMessageDeliveries", js.undefined)
    
    @scala.inline
    def setMeshTime(value: Double): Self = StObject.set(x, "meshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshTimeUndefined: Self = StObject.set(x, "meshTime", js.undefined)
  }
}
