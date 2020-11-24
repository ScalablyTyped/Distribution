package typings.ipfsCore.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/dns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(): js.Function2[
    /* domain */ String, 
    /* options */ js.UndefOr[DNSSettings with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[String]
  ] = js.native
}
