package typings.ipfsCore

import typings.ipfsCore.anon.AddrsAny
import typings.ipfsCore.anon.Libp2pAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/swarm/addrs", JSImport.Namespace)
@js.native
object addrsMod extends js.Object {
  
  def apply(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[js.Array[AddrsAny]]] = js.native
}
