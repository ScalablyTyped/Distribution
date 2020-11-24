package typings.ipfsCore.componentsResolveMod

import typings.ipfsCore.anon.IpldIPLDName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpldName: IpldIPLDName): js.Function2[
    /* path */ String, 
    /* opts */ js.UndefOr[ResolveSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[String]
  ] = js.native
}
