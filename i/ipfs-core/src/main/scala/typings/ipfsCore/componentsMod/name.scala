package typings.ipfsCore.componentsMod

import typings.ipfsCore.anon.Canceled
import typings.ipfsCore.anon.Dag
import typings.ipfsCore.anon.Dns
import typings.ipfsCore.anon.Enabled
import typings.ipfsCore.anon.Ipns
import typings.ipfsCore.anon.IpnsOptions
import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.publishMod.PublishResult
import typings.ipfsCore.publishMod.PublishSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components", "name")
@js.native
object name extends js.Object {
  
  def publish(hasIpnsDagPeerIdIsOnlineKeychain: Dag): js.Function2[
    /* value */ String, 
    /* options */ js.UndefOr[PublishSettings with AbortOptions], 
    js.Promise[PublishResult]
  ] = js.native
  
  @JSName("resolve_1")
  def resolve1(hasDnsIpnsPeerIdIsOnlineOptions: Dns): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
  
  @js.native
  object pubsub extends js.Object {
    
    def cancel(hasIpnsOptions: Ipns): js.Function2[/* name */ String, /* options */ js.UndefOr[AbortOptions], js.Promise[Canceled]] = js.native
    
    def state(hasIpnsOptions: IpnsOptions): js.Function1[/* _options */ js.UndefOr[AbortOptions], js.Promise[Enabled]] = js.native
    
    def subs(hasIpnsOptions: IpnsOptions): js.Function1[/* options */ js.UndefOr[AbortOptions], js.Promise[js.Array[String]]] = js.native
  }
}
