package typings.libp2pCrypto.mod.hmac

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "hmac.create")
@js.native
object create extends js.Object {
  
  def apply(hash: String, secret: Uint8Array): js.Promise[Digest] = js.native
}
