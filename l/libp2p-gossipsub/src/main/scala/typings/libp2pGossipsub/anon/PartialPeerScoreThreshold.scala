package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-thresholds.PeerScoreThresholds> */
trait PartialPeerScoreThreshold extends StObject {
  
  var acceptPXThreshold: js.UndefOr[Double] = js.undefined
  
  var gossipThreshold: js.UndefOr[Double] = js.undefined
  
  var graylistThreshold: js.UndefOr[Double] = js.undefined
  
  var opportunisticGraftThreshold: js.UndefOr[Double] = js.undefined
  
  var publishThreshold: js.UndefOr[Double] = js.undefined
}
object PartialPeerScoreThreshold {
  
  inline def apply(): PartialPeerScoreThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerScoreThreshold]
  }
  
  extension [Self <: PartialPeerScoreThreshold](x: Self) {
    
    inline def setAcceptPXThreshold(value: Double): Self = StObject.set(x, "acceptPXThreshold", value.asInstanceOf[js.Any])
    
    inline def setAcceptPXThresholdUndefined: Self = StObject.set(x, "acceptPXThreshold", js.undefined)
    
    inline def setGossipThreshold(value: Double): Self = StObject.set(x, "gossipThreshold", value.asInstanceOf[js.Any])
    
    inline def setGossipThresholdUndefined: Self = StObject.set(x, "gossipThreshold", js.undefined)
    
    inline def setGraylistThreshold(value: Double): Self = StObject.set(x, "graylistThreshold", value.asInstanceOf[js.Any])
    
    inline def setGraylistThresholdUndefined: Self = StObject.set(x, "graylistThreshold", js.undefined)
    
    inline def setOpportunisticGraftThreshold(value: Double): Self = StObject.set(x, "opportunisticGraftThreshold", value.asInstanceOf[js.Any])
    
    inline def setOpportunisticGraftThresholdUndefined: Self = StObject.set(x, "opportunisticGraftThreshold", js.undefined)
    
    inline def setPublishThreshold(value: Double): Self = StObject.set(x, "publishThreshold", value.asInstanceOf[js.Any])
    
    inline def setPublishThresholdUndefined: Self = StObject.set(x, "publishThreshold", js.undefined)
  }
}
