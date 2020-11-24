package typings.ipfsCore

import typings.ipfsCore.anon.Keychain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/key/export", JSImport.Namespace)
@js.native
object exportMod extends js.Object {
  
  def apply(hasKeychain: Keychain): js.Function3[
    /* name */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
}
