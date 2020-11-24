package typings.ipfsCore.mkdirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/mkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function2[
    /* path */ String, 
    /* options */ js.UndefOr[MkdirOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Unit]
  ] = js.native
}
