package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "AccountState")
@js.native
class AccountState () extends js.Object {
  val authenticationKey: Uint8Array = js.native
  val balance: default = js.native
  val receivedEventsCount: default = js.native
  val sentEventsCount: default = js.native
  val sequenceNumber: default = js.native
}

/* static members */
@JSImport("libra-core", "AccountState")
@js.native
object AccountState extends js.Object {
  def default(address: String): AccountState = js.native
  def fromBytes(bytes: Uint8Array): AccountState = js.native
}

