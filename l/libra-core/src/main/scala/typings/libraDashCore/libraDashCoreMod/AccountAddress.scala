package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "AccountAddress")
@js.native
class AccountAddress protected () extends js.Object {
  def this(addressOrHash: AccountAddressLike) = this()
  def isDefault(): Boolean = js.native
  def toBytes(): Uint8Array = js.native
  def toHex(): String = js.native
}

/* static members */
@JSImport("libra-core", "AccountAddress")
@js.native
object AccountAddress extends js.Object {
  def default(): AccountAddress = js.native
  def isValidBytes(addressBytes: Uint8Array): Boolean = js.native
  def isValidString(addressHex: String): Boolean = js.native
}

