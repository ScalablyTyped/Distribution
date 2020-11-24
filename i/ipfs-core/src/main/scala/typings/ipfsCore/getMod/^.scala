package typings.ipfsCore.getMod

import typings.ipfsCore.anon.BlockService
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/get", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServicePreload: BlockService): js.Function2[
    /* cid */ String | typings.cids.mod.^  | Uint8Array, 
    /* options */ js.UndefOr[GetOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
    ]
  ] = js.native
}
