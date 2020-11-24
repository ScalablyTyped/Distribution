package typings.ipfsCore.readMod

import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/read", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[ReadOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Uint8Array]
  ] = js.native
}
