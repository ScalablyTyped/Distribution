package typings.libp2pGossipsub.messageMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerInfo extends js.Object {
  
  var peerID: js.UndefOr[Uint8Array] = js.native
  
  var signedPeerRecord: js.UndefOr[Uint8Array] = js.native
}
object PeerInfo {
  
  @scala.inline
  def apply(): PeerInfo = {
    val __obj = js.Dynamic.literal()
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
    def setPeerID(value: Uint8Array): Self = this.set("peerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeerID: Self = this.set("peerID", js.undefined)
    
    @scala.inline
    def setSignedPeerRecord(value: Uint8Array): Self = this.set("signedPeerRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedPeerRecord: Self = this.set("signedPeerRecord", js.undefined)
  }
}
