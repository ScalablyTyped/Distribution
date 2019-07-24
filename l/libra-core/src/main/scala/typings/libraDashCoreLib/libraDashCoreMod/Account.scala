package typings
package libraDashCoreLib.libraDashCoreMod

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
  def fromSecretKey(secretKeyHex: java.lang.String): libraDashCoreLib.libraDashCoreMod.Account = js.native
  def fromSecretKeyBytes(secretKeyBytes: stdLib.Uint8Array): libraDashCoreLib.libraDashCoreMod.Account = js.native
}

