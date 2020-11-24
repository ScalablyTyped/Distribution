package typings.libp2pGossipsub.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlPrune extends js.Object {
  
  var backoff: js.UndefOr[Double] = js.native
  
  var peers: js.Array[PeerInfo] = js.native
  
  var topicID: js.UndefOr[String] = js.native
}
object ControlPrune {
  
  @scala.inline
  def apply(peers: js.Array[PeerInfo]): ControlPrune = {
    val __obj = js.Dynamic.literal(peers = peers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlPrune]
  }
  
  @scala.inline
  implicit class ControlPruneOps[Self <: ControlPrune] (val x: Self) extends AnyVal {
    
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
    def setPeersVarargs(value: PeerInfo*): Self = this.set("peers", js.Array(value :_*))
    
    @scala.inline
    def setPeers(value: js.Array[PeerInfo]): Self = this.set("peers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackoff(value: Double): Self = this.set("backoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackoff: Self = this.set("backoff", js.undefined)
    
    @scala.inline
    def setTopicID(value: String): Self = this.set("topicID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicID: Self = this.set("topicID", js.undefined)
  }
}
