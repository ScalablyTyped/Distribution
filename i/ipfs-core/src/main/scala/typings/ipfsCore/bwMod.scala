package typings.ipfsCore

import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.RateIn
import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/stats/bw", JSImport.Namespace)
@js.native
object bwMod extends js.Object {
  
  def apply(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]] = js.native
}
