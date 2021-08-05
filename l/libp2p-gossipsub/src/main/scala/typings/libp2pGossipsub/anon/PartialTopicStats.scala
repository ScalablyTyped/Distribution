package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-stats.TopicStats> */
trait PartialTopicStats extends StObject {
  
  var firstMessageDeliveries: js.UndefOr[Double] = js.undefined
  
  var graftTime: js.UndefOr[Double] = js.undefined
  
  var inMesh: js.UndefOr[Boolean] = js.undefined
  
  var invalidMessageDeliveries: js.UndefOr[Double] = js.undefined
  
  var meshFailurePenalty: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveries: js.UndefOr[Double] = js.undefined
  
  var meshMessageDeliveriesActive: js.UndefOr[Boolean] = js.undefined
  
  var meshTime: js.UndefOr[Double] = js.undefined
}
object PartialTopicStats {
  
  inline def apply(): PartialTopicStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTopicStats]
  }
  
  extension [Self <: PartialTopicStats](x: Self) {
    
    inline def setFirstMessageDeliveries(value: Double): Self = StObject.set(x, "firstMessageDeliveries", value.asInstanceOf[js.Any])
    
    inline def setFirstMessageDeliveriesUndefined: Self = StObject.set(x, "firstMessageDeliveries", js.undefined)
    
    inline def setGraftTime(value: Double): Self = StObject.set(x, "graftTime", value.asInstanceOf[js.Any])
    
    inline def setGraftTimeUndefined: Self = StObject.set(x, "graftTime", js.undefined)
    
    inline def setInMesh(value: Boolean): Self = StObject.set(x, "inMesh", value.asInstanceOf[js.Any])
    
    inline def setInMeshUndefined: Self = StObject.set(x, "inMesh", js.undefined)
    
    inline def setInvalidMessageDeliveries(value: Double): Self = StObject.set(x, "invalidMessageDeliveries", value.asInstanceOf[js.Any])
    
    inline def setInvalidMessageDeliveriesUndefined: Self = StObject.set(x, "invalidMessageDeliveries", js.undefined)
    
    inline def setMeshFailurePenalty(value: Double): Self = StObject.set(x, "meshFailurePenalty", value.asInstanceOf[js.Any])
    
    inline def setMeshFailurePenaltyUndefined: Self = StObject.set(x, "meshFailurePenalty", js.undefined)
    
    inline def setMeshMessageDeliveries(value: Double): Self = StObject.set(x, "meshMessageDeliveries", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesActive(value: Boolean): Self = StObject.set(x, "meshMessageDeliveriesActive", value.asInstanceOf[js.Any])
    
    inline def setMeshMessageDeliveriesActiveUndefined: Self = StObject.set(x, "meshMessageDeliveriesActive", js.undefined)
    
    inline def setMeshMessageDeliveriesUndefined: Self = StObject.set(x, "meshMessageDeliveries", js.undefined)
    
    inline def setMeshTime(value: Double): Self = StObject.set(x, "meshTime", value.asInstanceOf[js.Any])
    
    inline def setMeshTimeUndefined: Self = StObject.set(x, "meshTime", js.undefined)
  }
}
