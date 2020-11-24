package typings.ipfsCore.catMod

import typings.ipfsCore.anon.Ipld
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/cat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[CatOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Uint8Array]
  ] = js.native
}
