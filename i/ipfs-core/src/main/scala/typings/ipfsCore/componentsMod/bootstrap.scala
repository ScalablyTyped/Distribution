package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.bootstrapUtilsMod.Peers
import typings.ipfsCore.srcUtilsMod.AbortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "bootstrap")
@js.native
object bootstrap extends js.Object {
  
  def add(hasRepo: js.Any): js.Function2[
    /* multiaddr */ typings.multiaddr.mod.^, 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[Peers]
  ] = js.native
  
  def clear(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def list(hasRepo: js.Any): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  def reset(hasRepo: js.Any): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[Peers]] = js.native
  
  @JSName("rm_1")
  def rm1(hasRepo: js.Any): js.Function2[
    /* multiaddr */ typings.multiaddr.mod.^, 
    /* options */ js.UndefOr[AbortOptions], 
    js.Promise[Peers]
  ] = js.native
}
