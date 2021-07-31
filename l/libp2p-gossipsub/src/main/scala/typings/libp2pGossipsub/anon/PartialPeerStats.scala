package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.peerStatsMod.TopicStats
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-stats.PeerStats> */
trait PartialPeerStats extends StObject {
  
  var behaviourPenalty: js.UndefOr[Double] = js.undefined
  
  var connected: js.UndefOr[Boolean] = js.undefined
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var ips: js.UndefOr[js.Array[String]] = js.undefined
  
  var topics: js.UndefOr[Record[String, TopicStats]] = js.undefined
}
object PartialPeerStats {
  
  @scala.inline
  def apply(): PartialPeerStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerStats]
  }
  
  @scala.inline
  implicit class PartialPeerStatsMutableBuilder[Self <: PartialPeerStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviourPenalty(value: Double): Self = StObject.set(x, "behaviourPenalty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourPenaltyUndefined: Self = StObject.set(x, "behaviourPenalty", js.undefined)
    
    @scala.inline
    def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    @scala.inline
    def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: Record[String, TopicStats]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
  }
}
