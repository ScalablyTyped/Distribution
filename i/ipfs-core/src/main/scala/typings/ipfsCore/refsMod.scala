package typings.ipfsCore

import typings.ipfsCore.anon.Ref
import typings.ipfsCore.anon.Resolve
import typings.std.AsyncGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/refs", JSImport.Namespace)
@js.native
object refsMod extends js.Object {
  
  def apply(hasIpldResolvePreload: Resolve): js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ] = js.native
  
  @js.native
  object Format extends js.Object {
    
    @JSName("_default")
    val default: String = js.native
    
    val edges: String = js.native
  }
}
