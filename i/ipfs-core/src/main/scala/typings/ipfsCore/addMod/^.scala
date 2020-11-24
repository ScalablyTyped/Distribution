package typings.ipfsCore.addMod

import typings.ipfsCore.anon.AddAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/add", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(hasAddAll: AddAll): js.Function2[
    /* source */ Source, 
    /* options */ js.UndefOr[AddOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[typings.ipfsCore.addAllMod.UnixFSEntry]
  ] = js.native
}
