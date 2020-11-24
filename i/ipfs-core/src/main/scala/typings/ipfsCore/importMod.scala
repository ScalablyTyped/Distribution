package typings.ipfsCore

import typings.ipfsCore.anon.Keychain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/key/import", JSImport.Namespace)
@js.native
object importMod extends js.Object {
  
  def apply(hasKeychain: Keychain): js.Function4[
    /* name */ js.UndefOr[js.Any], 
    /* pem */ js.UndefOr[js.Any], 
    /* password */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    _
  ] = js.native
}
