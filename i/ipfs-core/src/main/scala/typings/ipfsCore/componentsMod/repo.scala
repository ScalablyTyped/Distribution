package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.NumObjects
import typings.ipfsCore.anon.Refs
import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.gcMod.BlockID
import typings.ipfsCore.gcMod.Err
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "repo")
@js.native
object repo extends js.Object {
  
  def gc(hasGcLockPinRefsRepo: Refs): js.Function1[/* _options */ js.UndefOr[AbortOptions], AsyncIterable[Err | BlockID]] = js.native
  
  @JSName("stat_3")
  def stat3(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[NumObjects]] = js.native
  
  def version(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], js.Promise[_]] = js.native
}
