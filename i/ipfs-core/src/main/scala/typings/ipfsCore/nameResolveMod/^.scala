package typings.ipfsCore.nameResolveMod

import typings.ipfsCore.anon.IsOnline
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/name/resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasDnsIpnsPeerIdIsOnlineOptions: IsOnline): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[ResolveSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[String]
  ] = js.native
}
