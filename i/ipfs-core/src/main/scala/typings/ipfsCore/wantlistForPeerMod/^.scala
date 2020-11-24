package typings.ipfsCore.wantlistForPeerMod

import typings.ipfsCore.anon.Bitswap
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bitswap/wantlist-for-peer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBitswap: Bitswap): js.Function2[
    /* peerId */ String | typings.cids.mod.^  | Uint8Array | typings.peerId.mod.^ , 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[js.Array[typings.cids.mod.^]]
  ] = js.native
}
