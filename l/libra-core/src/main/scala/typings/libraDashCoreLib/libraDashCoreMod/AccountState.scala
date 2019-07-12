package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core", "AccountState")
@js.native
class AccountState () extends js.Object {
  val authenticationKey: stdLib.Uint8Array = js.native
  val balance: bignumberDotJsLib.bignumberDotJsMod.default = js.native
  val receivedEventsCount: bignumberDotJsLib.bignumberDotJsMod.default = js.native
  val sentEventsCount: bignumberDotJsLib.bignumberDotJsMod.default = js.native
  val sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default = js.native
}

/* static members */
@JSImport("libra-core", "AccountState")
@js.native
object AccountState extends js.Object {
  def default(address: java.lang.String): libraDashCoreLib.libraDashCoreMod.AccountState = js.native
  def fromBytes(bytes: stdLib.Uint8Array): libraDashCoreLib.libraDashCoreMod.AccountState = js.native
}

