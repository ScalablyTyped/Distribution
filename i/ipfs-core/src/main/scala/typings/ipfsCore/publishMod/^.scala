package typings.ipfsCore.publishMod

import typings.ipfsCore.anon.DagIpns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/name/publish", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpnsDagPeerIdIsOnlineKeychain: DagIpns): js.Function2[
    /* value */ String, 
    /* options */ js.UndefOr[PublishSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[PublishResult]
  ] = js.native
}
