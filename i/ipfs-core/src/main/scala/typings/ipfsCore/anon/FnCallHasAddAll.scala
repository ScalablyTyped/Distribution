package typings.ipfsCore.anon

import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.addMod.Source
import typings.ipfsCore.bootstrapAddMod.Peers
import typings.ipfsCore.pinAddMod.CID
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.multiaddr.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasAddAll extends js.Object {
  
  def apply(hasAddAll: AddAll): js.Function2[
    /* source */ Source, 
    /* options */ js.UndefOr[AddOptions with AbortOptions], 
    js.Promise[UnixFSEntry]
  ] = js.native
  def apply(hasAddAll: AddAllReturnType): js.Function2[
    /* path */ CID | String, 
    /* options */ js.UndefOr[typings.ipfsCore.pinAddMod.AddOptions with AbortOptions], 
    js.Promise[CID]
  ] = js.native
  def apply(hasRepo: js.Any): js.Function2[/* multiaddr */ ^, /* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
}
