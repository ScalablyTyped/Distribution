package typings.ipfsCore.bootstrapAddMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bootstrap/add", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasRepo: js.Any): js.Function2[
    /* multiaddr */ typings.multiaddr.mod.^, 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Peers]
  ] = js.native
}
