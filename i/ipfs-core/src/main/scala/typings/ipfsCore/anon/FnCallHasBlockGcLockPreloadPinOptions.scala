package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.addAllMod.AddAllOptions
import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.pinAddAllMod.AddSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasBlockGcLockPreloadPinOptions extends js.Object {
  
  def apply(hasBlockGcLockPreloadPinOptions: Block): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddAllOptions with AbortOptions], 
    AsyncIterable[UnixFSEntry]
  ] = js.native
  def apply(hasPinManagerGcLockDag: DagDAG): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with AbortOptions], 
    AsyncIterable[^]
  ] = js.native
}
