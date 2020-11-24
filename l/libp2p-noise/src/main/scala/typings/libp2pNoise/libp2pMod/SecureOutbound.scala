package typings.libp2pNoise.libp2pMod

import typings.node.Buffer
import typings.peerId.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureOutbound extends js.Object {
  
  var conn: js.Any = js.native
  
  var remoteEarlyData: Buffer = js.native
  
  var remotePeer: ^ = js.native
}
object SecureOutbound {
  
  @scala.inline
  def apply(conn: js.Any, remoteEarlyData: Buffer, remotePeer: ^): SecureOutbound = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], remoteEarlyData = remoteEarlyData.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureOutbound]
  }
  
  @scala.inline
  implicit class SecureOutboundOps[Self <: SecureOutbound] (val x: Self) extends AnyVal {
    
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
    def setConn(value: js.Any): Self = this.set("conn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteEarlyData(value: Buffer): Self = this.set("remoteEarlyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePeer(value: ^): Self = this.set("remotePeer", value.asInstanceOf[js.Any])
  }
}
