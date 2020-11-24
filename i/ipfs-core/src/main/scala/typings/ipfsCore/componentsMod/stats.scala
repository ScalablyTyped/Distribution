package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Libp2pAny
import typings.ipfsCore.anon.RateIn
import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "stats")
@js.native
object stats extends js.Object {
  
  def bw(hasLibp2p: Libp2pAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[RateIn, Unit, _]] = js.native
}
