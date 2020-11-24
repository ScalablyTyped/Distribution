package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofswarm extends js.Object {
  
  def addrs(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[AddrsAny]]] = js.native
  
  def connect(hasLibp2p: Libp2pAny): js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def disconnect(hasLibp2p: Libp2pAny): js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def localAddrs(hasMultiaddrs: Multiaddrs): js.Function0[js.Promise[_]] = js.native
  
  def peers(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[Addr]]] = js.native
}
object Typeofswarm {
  
  @scala.inline
  def apply(
    addrs: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[AddrsAny]]],
    connect: Libp2pAny => js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _],
    disconnect: Libp2pAny => js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _],
    localAddrs: Multiaddrs => js.Function0[js.Promise[_]],
    peers: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[Addr]]]
  ): Typeofswarm = {
    val __obj = js.Dynamic.literal(addrs = js.Any.fromFunction1(addrs), connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), localAddrs = js.Any.fromFunction1(localAddrs), peers = js.Any.fromFunction1(peers))
    __obj.asInstanceOf[Typeofswarm]
  }
  
  @scala.inline
  implicit class TypeofswarmOps[Self <: Typeofswarm] (val x: Self) extends AnyVal {
    
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
    def setAddrs(value: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[AddrsAny]]]): Self = this.set("addrs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnect(
      value: Libp2pAny => js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
    ): Self = this.set("connect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisconnect(
      value: Libp2pAny => js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _]
    ): Self = this.set("disconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocalAddrs(value: Multiaddrs => js.Function0[js.Promise[_]]): Self = this.set("localAddrs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPeers(value: Libp2pAny => js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[Addr]]]): Self = this.set("peers", js.Any.fromFunction1(value))
  }
}
