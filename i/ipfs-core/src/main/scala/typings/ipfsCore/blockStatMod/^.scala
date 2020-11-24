package typings.ipfsCore.blockStatMod

import typings.ipfsCore.anon.BlockService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/stat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ typings.cids.mod.^, 
    /* options */ js.UndefOr[StatOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Stat]
  ] = js.native
}
