package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Default
import typings.ipfsCore.anon.Ref
import typings.ipfsCore.anon.RepoAny
import typings.ipfsCore.anon.Resolve
import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "refs")
@js.native
object refs extends js.Object {
  
  def apply(hasIpldResolvePreload: Resolve): js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ] = js.native
  
  var Format: Default = js.native
  
  def local(hasRepo: RepoAny): js.Function1[/* options */ js.UndefOr[js.Any], AsyncGenerator[Ref, Unit, _]] = js.native
}
