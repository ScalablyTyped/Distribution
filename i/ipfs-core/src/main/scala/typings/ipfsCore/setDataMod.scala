package typings.ipfsCore

import typings.ipfsCore.anon.GcLockIpldPreload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/object/patch/set-data", JSImport.Namespace)
@js.native
object setDataMod extends js.Object {
  
  def apply(hasIpldGcLockPreload: GcLockIpldPreload): js.Function3[
    /* multihash */ js.UndefOr[js.Any], 
    /* data */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[_]
  ] = js.native
}
