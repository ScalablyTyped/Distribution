package typings.ipfsCore.addAllMod

import typings.ipfsCore.anon.Block
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/add-all", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockGcLockPreloadPinOptions: Block): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddAllOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
}
