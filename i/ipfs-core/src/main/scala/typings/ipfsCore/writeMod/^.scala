package typings.ipfsCore.writeMod

import typings.std.AsyncIterable
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/write", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(context: js.Any): js.Function3[
    /* path */ String, 
    /* content */ String | Uint8Array | AsyncIterable[Uint8Array] | Blob, 
    /* options */ js.UndefOr[WriteOptions with typings.ipfsCore.srcUtilsMod.AbortOptions], 
    js.Promise[Unit]
  ] = js.native
}
