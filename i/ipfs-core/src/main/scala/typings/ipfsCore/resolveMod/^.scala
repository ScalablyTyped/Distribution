package typings.ipfsCore.resolveMod

import typings.ipfsCore.anon.Ipld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dag/resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | typings.cids.mod.^ , 
    /* options */ js.UndefOr[ResolveOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
}
