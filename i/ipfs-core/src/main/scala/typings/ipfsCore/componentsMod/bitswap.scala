package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.BitswapAny
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.statMod.BitswapStats
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "bitswap")
@js.native
object bitswap extends js.Object {
  
  @JSName("stat_1")
  def stat1(hasBitswap: BitswapAny): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[BitswapStats]] = js.native
  
  def unwant(hasBitswap: BitswapAny): js.Function2[
    /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[Unit]
  ] = js.native
  
  def wantlist(hasBitswap: BitswapAny): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[typings.cids.mod.^]]] = js.native
  
  def wantlistForPeer(hasBitswap: BitswapAny): js.Function2[
    /* peerId */ String | typings.cids.mod.^  | Uint8Array | typings.peerId.mod.^ , 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[js.Array[typings.cids.mod.^]]
  ] = js.native
}
