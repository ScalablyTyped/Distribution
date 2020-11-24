package typings.ipfsCore.resetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Peers extends js.Object {
  
  var Peers: js.Array[typings.multiaddr.mod.^] = js.native
}
object Peers {
  
  @scala.inline
  def apply(Peers: js.Array[typings.multiaddr.mod.^]): Peers = {
    val __obj = js.Dynamic.literal(Peers = Peers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peers]
  }
  
  @scala.inline
  implicit class PeersOps[Self <: Peers] (val x: Self) extends AnyVal {
    
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
    def setPeersVarargs(value: typings.multiaddr.mod.^ *): Self = this.set("Peers", js.Array(value :_*))
    
    @scala.inline
    def setPeers(value: js.Array[typings.multiaddr.mod.^]): Self = this.set("Peers", value.asInstanceOf[js.Any])
  }
}
