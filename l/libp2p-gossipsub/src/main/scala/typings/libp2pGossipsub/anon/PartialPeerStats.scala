package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.peerStatsMod.TopicStats
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-stats.PeerStats> */
@js.native
trait PartialPeerStats extends js.Object {
  
  var behaviourPenalty: js.UndefOr[Double] = js.native
  
  var connected: js.UndefOr[Boolean] = js.native
  
  var expire: js.UndefOr[Double] = js.native
  
  var ips: js.UndefOr[js.Array[String]] = js.native
  
  var topics: js.UndefOr[Record[String, TopicStats]] = js.native
}
object PartialPeerStats {
  
  @scala.inline
  def apply(): PartialPeerStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerStats]
  }
  
  @scala.inline
  implicit class PartialPeerStatsOps[Self <: PartialPeerStats] (val x: Self) extends AnyVal {
    
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
    def setBehaviourPenalty(value: Double): Self = this.set("behaviourPenalty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviourPenalty: Self = this.set("behaviourPenalty", js.undefined)
    
    @scala.inline
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnected: Self = this.set("connected", js.undefined)
    
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpire: Self = this.set("expire", js.undefined)
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIps: Self = this.set("ips", js.undefined)
    
    @scala.inline
    def setTopics(value: Record[String, TopicStats]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
}
