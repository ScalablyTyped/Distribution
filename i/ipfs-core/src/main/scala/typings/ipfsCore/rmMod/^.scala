package typings.ipfsCore.rmMod

import typings.ipfsCore.anon.PinManager
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/block/rm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasBlockServiceGcLockPinManager: PinManager): js.Function2[
    /* cids */ typings.cids.mod.^  | js.Array[typings.cids.mod.^], 
    /* options */ js.UndefOr[RmOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[RmSucceess | RmFailure]
  ] = js.native
}
