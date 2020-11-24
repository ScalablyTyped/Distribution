package typings.ipfsCore.dhtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerInfo extends js.Object {
  
  var addrs: js.Array[Multiaddr] = js.native
  
  var id: typings.peerId.mod.^ = js.native
}
object PeerInfo {
  
  @scala.inline
  def apply(addrs: js.Array[Multiaddr], id: typings.peerId.mod.^): PeerInfo = {
    val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInfo]
  }
  
  @scala.inline
  implicit class PeerInfoOps[Self <: PeerInfo] (val x: Self) extends AnyVal {
    
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
    def setAddrsVarargs(value: Multiaddr*): Self = this.set("addrs", js.Array(value :_*))
    
    @scala.inline
    def setAddrs(value: js.Array[Multiaddr]): Self = this.set("addrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: typings.peerId.mod.^): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
