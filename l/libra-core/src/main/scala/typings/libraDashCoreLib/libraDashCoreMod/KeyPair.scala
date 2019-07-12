package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "KeyPair")
@js.native
class KeyPair protected () extends js.Object {
  def this(eddsaPair: js.Any) = this()
  def getPublicKey(): stdLib.Uint8Array = js.native
  def getSecretKey(): stdLib.Uint8Array = js.native
  def sign(message: stdLib.Uint8Array): Signature = js.native
  def verify(message: stdLib.Uint8Array, signature: Signature): scala.Boolean = js.native
}

/* static members */
@JSImport("libra-core", "KeyPair")
@js.native
object KeyPair extends js.Object {
  def fromSecretKey(secretKey: stdLib.Uint8Array): libraDashCoreLib.libraDashCoreMod.KeyPair = js.native
}

