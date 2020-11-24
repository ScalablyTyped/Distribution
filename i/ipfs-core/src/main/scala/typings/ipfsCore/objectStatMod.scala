package typings.ipfsCore

import typings.ipfsCore.anon.BlockSize
import typings.ipfsCore.anon.IpldAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/object/stat", JSImport.Namespace)
@js.native
object objectStatMod extends js.Object {
  
  def apply(hasIpldPreload: IpldAny): js.Function2[
    /* multihash */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[BlockSize]
  ] = js.native
}
