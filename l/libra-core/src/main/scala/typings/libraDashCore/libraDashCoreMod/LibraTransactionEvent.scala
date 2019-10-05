package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransactionEvent extends js.Object {
  var address: js.UndefOr[AccountAddress] = js.undefined
  var data: Uint8Array
  var path: js.UndefOr[Uint8Array] = js.undefined
  var sequenceNumber: default
}

@JSImport("libra-core", "LibraTransactionEvent")
@js.native
object LibraTransactionEvent extends js.Object {
  def apply(data: Uint8Array, sequenceNumber: default): Unit = js.native
  def apply(data: Uint8Array, sequenceNumber: default, address: AccountAddress): Unit = js.native
  def apply(data: Uint8Array, sequenceNumber: default, address: AccountAddress, path: Uint8Array): Unit = js.native
}

