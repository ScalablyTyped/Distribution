package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(eddsaPair: js.Any) = this()
  def getPublicKey(): Uint8Array = js.native
  def getSecretKey(): Uint8Array = js.native
  def sign(message: Uint8Array): Signature = js.native
  def verify(message: Uint8Array, signature: Signature): Boolean = js.native
}

/* static members */
@JSImport("libra-core", "KeyPair")
@js.native
object KeyPair extends js.Object {
  def fromSecretKey(secretKey: Uint8Array): KeyPair = js.native
}

