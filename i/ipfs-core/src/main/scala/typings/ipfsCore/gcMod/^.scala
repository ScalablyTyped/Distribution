package typings.ipfsCore.gcMod

import typings.ipfsCore.anon.GcLockPin
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/repo/gc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasGcLockPinRefsRepo: GcLockPin): js.Function1[
    /* _options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Err | BlockID]
  ] = js.native
}
