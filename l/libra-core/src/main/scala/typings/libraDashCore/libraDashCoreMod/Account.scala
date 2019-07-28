package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "Account")
@js.native
class Account protected () extends js.Object {
  def this(keyPair: KeyPair) = this()
  val keyPair: KeyPair = js.native
  def getAddress(): AccountAddress = js.native
}

/* static members */
@JSImport("libra-core", "Account")
@js.native
object Account extends js.Object {
  def fromSecretKey(secretKeyHex: String): Account = js.native
  def fromSecretKeyBytes(secretKeyBytes: Uint8Array): Account = js.native
}

