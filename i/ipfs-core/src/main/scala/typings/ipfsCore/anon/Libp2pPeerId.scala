package typings.ipfsCore.anon

import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Libp2pPeerId extends js.Object {
  
  var libp2p: js.UndefOr[js.Any] = js.native
  
  var peerId: ^ = js.native
}
object Libp2pPeerId {
  
  @scala.inline
  def apply(peerId: ^): Libp2pPeerId = {
    val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libp2pPeerId]
  }
  
  @scala.inline
  implicit class Libp2pPeerIdOps[Self <: Libp2pPeerId] (val x: Self) extends AnyVal {
    
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
    def setPeerId(value: ^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibp2p(value: js.Any): Self = this.set("libp2p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibp2p: Self = this.set("libp2p", js.undefined)
  }
}
