package typings.ipfsCore.clearMod

import typings.ipfsCore.anon.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/bootstrap/clear", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasRepo: Repo): js.Function1[
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Peers]
  ] = js.native
}
