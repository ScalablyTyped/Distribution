package typings.ipfsCore.treeMod

import typings.ipfsCore.anon.Ipld
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ typings.cids.mod.^, 
    /* options */ js.UndefOr[TreeOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
