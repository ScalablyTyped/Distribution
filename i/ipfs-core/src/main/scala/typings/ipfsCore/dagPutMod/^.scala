package typings.ipfsCore.dagPutMod

import typings.ipfsCore.anon.Pin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/put", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPinGcLockPreload: Pin): js.Function2[
    /* dagNode */ js.Any, 
    /* options */ js.UndefOr[PutOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.cids.mod.^]
  ] = js.native
}
