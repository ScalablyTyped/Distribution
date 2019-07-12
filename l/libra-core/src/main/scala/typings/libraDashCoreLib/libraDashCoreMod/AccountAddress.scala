package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "AccountAddress")
@js.native
class AccountAddress protected () extends js.Object {
  def this(addressOrHash: AccountAddressLike) = this()
  def isDefault(): scala.Boolean = js.native
  def toBytes(): stdLib.Uint8Array = js.native
  def toHex(): java.lang.String = js.native
}

/* static members */
@JSImport("libra-core", "AccountAddress")
@js.native
object AccountAddress extends js.Object {
  def default(): libraDashCoreLib.libraDashCoreMod.AccountAddress = js.native
  def isValidBytes(addressBytes: stdLib.Uint8Array): scala.Boolean = js.native
  def isValidString(addressHex: java.lang.String): scala.Boolean = js.native
}

