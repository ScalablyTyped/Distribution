package typings.libp2pGossipsub.interfacesMod

import typings.libp2pGossipsub.anon.Direction
import typings.libp2pGossipsub.anon.Protocol
import typings.multiaddr.mod.^
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  var registry: Map[String, Protocol] = js.native
  
  var remoteAddr: ^ = js.native
  
  var remotePeer: typings.peerId.mod.^ = js.native
  
  var stat: Direction = js.native
}
object Connection {
  
  @scala.inline
  def apply(registry: Map[String, Protocol], remoteAddr: ^, remotePeer: typings.peerId.mod.^, stat: Direction): Connection = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], remoteAddr = remoteAddr.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setRegistry(value: Map[String, Protocol]): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteAddr(value: ^): Self = this.set("remoteAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePeer(value: typings.peerId.mod.^): Self = this.set("remotePeer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: Direction): Self = this.set("stat", value.asInstanceOf[js.Any])
  }
}
