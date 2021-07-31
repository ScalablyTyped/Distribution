package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disconnect extends StObject {
  
  def addrs(): js.Promise[scala.Nothing]
  
  def connect(): js.Promise[scala.Nothing]
  
  def disconnect(): js.Promise[scala.Nothing]
  
  def localAddrs(): js.Promise[js.Any]
  
  def peers(): js.Promise[scala.Nothing]
}
object Disconnect {
  
  @scala.inline
  def apply(
    addrs: () => js.Promise[scala.Nothing],
    connect: () => js.Promise[scala.Nothing],
    disconnect: () => js.Promise[scala.Nothing],
    localAddrs: () => js.Promise[js.Any],
    peers: () => js.Promise[scala.Nothing]
  ): Disconnect = {
    val __obj = js.Dynamic.literal(addrs = js.Any.fromFunction0(addrs), connect = js.Any.fromFunction0(connect), disconnect = js.Any.fromFunction0(disconnect), localAddrs = js.Any.fromFunction0(localAddrs), peers = js.Any.fromFunction0(peers))
    __obj.asInstanceOf[Disconnect]
  }
  
  @scala.inline
  implicit class DisconnectMutableBuilder[Self <: Disconnect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddrs(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "addrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConnect(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisconnect(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocalAddrs(value: () => js.Promise[js.Any]): Self = StObject.set(x, "localAddrs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPeers(value: () => js.Promise[scala.Nothing]): Self = StObject.set(x, "peers", js.Any.fromFunction0(value))
  }
}
