package typings.ipfsCore

import typings.ipfsCore.anon.Keychain
import typings.ipfsCore.anon.Now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/key/rename", JSImport.Namespace)
@js.native
object renameMod extends js.Object {
  
  def apply(hasKeychain: Keychain): js.Function3[
    /* oldName */ js.UndefOr[js.Any], 
    /* newName */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    js.Promise[Now]
  ] = js.native
}
