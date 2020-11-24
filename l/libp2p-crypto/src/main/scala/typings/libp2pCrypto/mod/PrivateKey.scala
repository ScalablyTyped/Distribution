package typings.libp2pCrypto.mod

import typings.libp2pCrypto.libp2pCryptoStrings.`pkcs-8`
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKey extends js.Object {
  
  val bytes: Uint8Array = js.native
  
  def equals(key: PrivateKey): Boolean = js.native
  
  /**
    * Exports the password protected key in the format specified.
    */
  def export(password: String): js.Promise[String] = js.native
  def export(password: String, format: String): js.Promise[String] = js.native
  @JSName("export")
  def export_pkcs8(password: String, format: `pkcs-8`): js.Promise[String] = js.native
  
  def hash(): js.Promise[Uint8Array] = js.native
  
  /**
    * Gets the ID of the key.
    *
    * The key id is the base58 encoding of the SHA-256 multihash of its public key.
    * The public key is a protobuf encoding containing a type and the DER encoding
    * of the PKCS SubjectPublicKeyInfo.
    */
  def id(): js.Promise[String] = js.native
  
  def marshal(): Uint8Array = js.native
  
  val public: PublicKey = js.native
  
  def sign(data: Uint8Array): js.Promise[Uint8Array] = js.native
}
