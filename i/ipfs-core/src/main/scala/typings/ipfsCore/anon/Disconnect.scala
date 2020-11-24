package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disconnect extends js.Object {
  
  def addrs(): js.Promise[scala.Nothing] = js.native
  
  def connect(): js.Promise[scala.Nothing] = js.native
  
  def disconnect(): js.Promise[scala.Nothing] = js.native
  
  def localAddrs(): js.Promise[_] = js.native
  
  def peers(): js.Promise[scala.Nothing] = js.native
}
object Disconnect {
  
  @scala.inline
  def apply(
    addrs: () => js.Promise[scala.Nothing],
    connect: () => js.Promise[scala.Nothing],
    disconnect: () => js.Promise[scala.Nothing],
    localAddrs: () => js.Promise[_],
    peers: () => js.Promise[scala.Nothing]
  ): Disconnect = {
    val __obj = js.Dynamic.literal(addrs = js.Any.fromFunction0(addrs), connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), localAddrs = js.Any.fromFunction0(localAddrs), peers = js.Any.fromFunction0(peers))
    __obj.asInstanceOf[Disconnect]
  }
  
  @scala.inline
  implicit class DisconnectOps[Self <: Disconnect] (val x: Self) extends AnyVal {
    
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
    def setAddrs(value: () => js.Promise[scala.Nothing]): Self = this.set("addrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnect(value: () => js.Promise[scala.Nothing]): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisconnect(value: () => js.Promise[scala.Nothing]): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalAddrs(value: () => js.Promise[_]): Self = this.set("localAddrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeers(value: () => js.Promise[scala.Nothing]): Self = this.set("peers", js.Any.fromFunction0(value))
  }
}
