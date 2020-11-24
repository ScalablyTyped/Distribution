package typings.ipfsCore.pinAddAllMod

import typings.ipfsCore.anon.DagDAG
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/add-all", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasPinManagerGcLockDag: DagDAG): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[typings.cids.mod.^]
  ] = js.native
}
