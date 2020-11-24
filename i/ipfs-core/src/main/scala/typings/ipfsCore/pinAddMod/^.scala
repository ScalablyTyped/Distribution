package typings.ipfsCore.pinAddMod

import typings.ipfsCore.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/add", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasAddAll: `2`): js.Function2[
    /* path */ CID | String, 
    /* options */ js.UndefOr[AddOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[CID]
  ] = js.native
}
