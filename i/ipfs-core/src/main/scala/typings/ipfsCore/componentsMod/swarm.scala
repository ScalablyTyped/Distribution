package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Addr
import typings.ipfsCore.anon.AddrsAny
import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.Multiaddrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "swarm")
@js.native
object swarm extends js.Object {
  
  def addrs(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[AddrsAny]]] = js.native
  
  def connect(hasLibp2p: Libp2pAny): js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def disconnect(hasLibp2p: Libp2pAny): js.Function2[/* addr */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], _] = js.native
  
  def localAddrs(hasMultiaddrs: Multiaddrs): js.Function0[js.Promise[_]] = js.native
  
  def peers(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[Addr]]] = js.native
}
