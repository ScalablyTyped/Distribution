package typings.ipfsCore.pinRmMod

import typings.ipfsCore.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/rm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasRmAll: `4`): js.Function2[
    /* path */ String | CID, 
    /* options */ js.UndefOr[RmSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[CID]
  ] = js.native
}
