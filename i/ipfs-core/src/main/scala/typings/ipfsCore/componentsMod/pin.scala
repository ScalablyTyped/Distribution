package typings.ipfsCore.componentsMod

import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.anon.DagGcLock
import typings.ipfsCore.anon.DagGcLockPinManager
import typings.ipfsCore.anon.DagPinManager
import typings.ipfsCore.anon.RmAll
import typings.ipfsCore.anon.`1`
import typings.ipfsCore.pinAddAllMod.AddSettings
import typings.ipfsCore.pinLsMod.LsEntry
import typings.ipfsCore.pinLsMod.LsSettings
import typings.ipfsCore.pinRmMod.RmSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "pin")
@js.native
object pin extends js.Object {
  
  @JSName("add_1")
  def add1(hasAddAll: `1`): js.Function2[
    /* path */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[typings.cids.mod.^]
  ] = js.native
  
  def addAll(hasPinManagerGcLockDag: DagGcLock): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* options */ js.UndefOr[AddSettings with AbortOptions], 
    AsyncIterable[typings.cids.mod.^]
  ] = js.native
  
  def ls(hasPinManagerDag: DagPinManager): js.Function1[/* options */ js.UndefOr[LsSettings with AbortOptions], AsyncIterable[LsEntry]] = js.native
  
  @JSName("rm_3")
  def rm3(hasRmAll: RmAll): js.Function2[
    /* path */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[RmSettings with AbortOptions], 
    js.Promise[typings.cids.mod.^]
  ] = js.native
  
  def rmAll(hasPinManagerGcLockDag: DagGcLockPinManager): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ /* source */ js.Any, 
    /* _options */ js.UndefOr[AbortOptions], 
    AsyncIterable[typings.cids.mod.^]
  ] = js.native
}
