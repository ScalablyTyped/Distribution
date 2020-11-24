package typings.ipfsCore.chmodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/chmod", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function3[
    /* path */ String, 
    /* mode */ String | Double, 
    /* options */ js.UndefOr[ChmodOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Unit]
  ] = js.native
}
