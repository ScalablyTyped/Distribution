package typings.libp2pCrypto.mod.hmac

import typings.libp2pCrypto.libp2pCryptoStrings.SHA256
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-crypto", "hmac.create")
@js.native
object create_SHA256 extends js.Object {
  
  def apply(hash: SHA256, secret: Uint8Array): js.Promise[Digest] = js.native
}
