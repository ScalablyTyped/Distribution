package typings.ipfsCore.statMod

import typings.ipfsCore.anon.Bitswap
import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bitswap/stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBitswap: Bitswap): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]] = js.native
}
