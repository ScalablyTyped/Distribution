package typings.ipfsCore.pinLsMod

import typings.ipfsCore.anon.DagPinManager
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/pin/ls", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasPinManagerDag: DagPinManager): js.Function1[
    /* options */ js.UndefOr[LsSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[LsEntry]
  ] = js.native
}
