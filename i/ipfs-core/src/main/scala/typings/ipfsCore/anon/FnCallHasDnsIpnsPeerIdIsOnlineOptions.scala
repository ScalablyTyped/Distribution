package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.resolveMod.ResolveOptions
import typings.ipfsCore.resolveMod.ResolveResult
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHasDnsIpnsPeerIdIsOnlineOptions extends js.Object {
  
  def apply(hasDnsIpnsPeerIdIsOnlineOptions: IsOnline): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[ResolveSettings with AbortOptions], 
    AsyncIterable[String]
  ] = js.native
  def apply(hasIpldName: IpldIPLDName): js.Function2[
    /* path */ String, 
    /* opts */ js.UndefOr[typings.ipfsCore.componentsResolveMod.ResolveSettings with AbortOptions], 
    js.Promise[String]
  ] = js.native
  def apply(hasIpldPreload: Ipld): js.Function2[
    /* ipfsPath */ String | ^ , 
    /* options */ js.UndefOr[ResolveOptions with AbortOptions], 
    js.Promise[ResolveResult]
  ] = js.native
}
