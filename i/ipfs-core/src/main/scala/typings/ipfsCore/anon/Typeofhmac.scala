package typings.ipfsCore.anon

import typings.ipfsCore.ipfsCoreStrings.SHA1
import typings.ipfsCore.ipfsCoreStrings.SHA256
import typings.ipfsCore.ipfsCoreStrings.SHA512
import typings.libp2pCrypto.mod.hmac.Digest
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhmac extends js.Object {
  
  def create(hash: String, secret: Uint8Array): js.Promise[Digest] = js.native
  /**
    * Create a new HMAC Digest.
    */
  @JSName("create")
  def create_SHA1(hash: SHA1, secret: Uint8Array): js.Promise[Digest] = js.native
  @JSName("create")
  def create_SHA256(hash: SHA256, secret: Uint8Array): js.Promise[Digest] = js.native
  @JSName("create")
  def create_SHA512(hash: SHA512, secret: Uint8Array): js.Promise[Digest] = js.native
}
