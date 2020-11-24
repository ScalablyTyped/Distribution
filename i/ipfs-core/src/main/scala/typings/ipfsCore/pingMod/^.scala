package typings.ipfsCore.pingMod

import typings.ipfsCore.anon.Libp2pAny
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/ping", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasLibp2p: Libp2pAny): js.Function2[
    /* peerId */ typings.peerId.mod.^, 
    /* options */ js.UndefOr[PingSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    AsyncIterable[Pong | PingFailure | StatusUpdate]
  ] = js.native
}
