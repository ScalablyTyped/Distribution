package typings.libp2pNoise.libp2pMod

import typings.libp2pNoise.basicMod.bytes
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INoiseConnection extends js.Object {
  
  var remoteEarlyData: js.UndefOr[js.Function0[bytes]] = js.native
  
  def secureInbound(localPeer: ^, insecure: js.Any, remotePeer: ^): js.Promise[SecureOutbound] = js.native
  
  def secureOutbound(localPeer: ^, insecure: js.Any, remotePeer: ^): js.Promise[SecureOutbound] = js.native
}
object INoiseConnection {
  
  @scala.inline
  def apply(
    secureInbound: (^, js.Any, ^) => js.Promise[SecureOutbound],
    secureOutbound: (^, js.Any, ^) => js.Promise[SecureOutbound]
  ): INoiseConnection = {
    val __obj = js.Dynamic.literal(secureInbound = js.Any.fromFunction3(secureInbound), secureOutbound = js.Any.fromFunction3(secureOutbound))
    __obj.asInstanceOf[INoiseConnection]
  }
  
  @scala.inline
  implicit class INoiseConnectionOps[Self <: INoiseConnection] (val x: Self) extends AnyVal {
    
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
    def setSecureInbound(value: (^, js.Any, ^) => js.Promise[SecureOutbound]): Self = this.set("secureInbound", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSecureOutbound(value: (^, js.Any, ^) => js.Promise[SecureOutbound]): Self = this.set("secureOutbound", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoteEarlyData(value: () => bytes): Self = this.set("remoteEarlyData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRemoteEarlyData: Self = this.set("remoteEarlyData", js.undefined)
  }
}
