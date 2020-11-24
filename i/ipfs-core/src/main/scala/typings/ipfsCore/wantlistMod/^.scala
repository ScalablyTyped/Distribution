package typings.ipfsCore.wantlistMod

import typings.ipfsCore.anon.Bitswap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bitswap/wantlist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBitswap: Bitswap): js.Function1[
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[js.Array[typings.cids.mod.^]]
  ] = js.native
}
