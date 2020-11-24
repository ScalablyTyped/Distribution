package typings.ipfsCore.cancelMod

import typings.ipfsCore.anon.Canceled
import typings.ipfsCore.anon.Ipns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/name/pubsub/cancel", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasIpnsOptions: Ipns): js.Function2[
    /* name */ String, 
    /* options */ js.UndefOr[typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Canceled]
  ] = js.native
}
