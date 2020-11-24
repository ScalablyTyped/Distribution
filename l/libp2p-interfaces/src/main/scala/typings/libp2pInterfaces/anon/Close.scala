package typings.libp2pInterfaces.anon

import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Close extends js.Object {
  
  var close: js.Function = js.native
  
  def getStreams(): js.Array[_] = js.native
  
  var localAddr: js.UndefOr[^] = js.native
  
  var localPeer: typings.peerId.mod.^ = js.native
  
  var newStream: js.Function = js.native
  
  var remoteAddr: js.UndefOr[^] = js.native
  
  var remotePeer: typings.peerId.mod.^ = js.native
  
  var stat: Direction = js.native
}
object Close {
  
  @scala.inline
  def apply(
    close: js.Function,
    getStreams: () => js.Array[_],
    localPeer: typings.peerId.mod.^,
    newStream: js.Function,
    remotePeer: typings.peerId.mod.^,
    stat: Direction
  ): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], getStreams = js.Any.fromFunction0(getStreams), localPeer = localPeer.asInstanceOf[js.Any], newStream = newStream.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseOps[Self <: Close] (val x: Self) extends AnyVal {
    
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
    def setClose(value: js.Function): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStreams(value: () => js.Array[_]): Self = this.set("getStreams", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalPeer(value: typings.peerId.mod.^): Self = this.set("localPeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStream(value: js.Function): Self = this.set("newStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePeer(value: typings.peerId.mod.^): Self = this.set("remotePeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: Direction): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddr(value: ^): Self = this.set("localAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalAddr: Self = this.set("localAddr", js.undefined)
    
    @scala.inline
    def setRemoteAddr(value: ^): Self = this.set("remoteAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteAddr: Self = this.set("remoteAddr", js.undefined)
  }
}
