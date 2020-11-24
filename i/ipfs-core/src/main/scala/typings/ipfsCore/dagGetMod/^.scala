package typings.ipfsCore.dagGetMod

import typings.ipfsCore.anon.Ipld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/get", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ typings.cids.mod.^, 
    /* options */ js.UndefOr[GetOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[DagEntry]
  ] = js.native
}
