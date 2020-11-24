package typings.libp2pGossipsub.peerStatsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerStats extends js.Object {
  
  /**
    * behavioural pattern penalties (applied by the router)
    */
  var behaviourPenalty: Double = js.native
  
  /**
    * true if the peer is currently connected
    */
  var connected: Boolean = js.native
  
  /**
    * expiration time of the score stats for disconnected peers
    */
  var expire: Double = js.native
  
  /**
    * IP tracking; store as string for easy processing
    */
  var ips: js.Array[String] = js.native
  
  /**
    * per topic stats
    */
  var topics: Record[String, TopicStats] = js.native
}
object PeerStats {
  
  @scala.inline
  def apply(
    behaviourPenalty: Double,
    connected: Boolean,
    expire: Double,
    ips: js.Array[String],
    topics: Record[String, TopicStats]
  ): PeerStats = {
    val __obj = js.Dynamic.literal(behaviourPenalty = behaviourPenalty.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], ips = ips.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStats]
  }
  
  @scala.inline
  implicit class PeerStatsOps[Self <: PeerStats] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: Record[String, TopicStats]): Self = this.set("topics", value.asInstanceOf[js.Any])
  }
}
