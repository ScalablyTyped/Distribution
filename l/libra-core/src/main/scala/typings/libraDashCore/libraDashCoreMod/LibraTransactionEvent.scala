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

object LibraTransactionEvent {
  @scala.inline
  def apply(data: Uint8Array, sequenceNumber: default, address: AccountAddress = null, path: Uint8Array = null): LibraTransactionEvent = {
    val __obj = js.Dynamic.literal(data = data, sequenceNumber = sequenceNumber)
    if (address != null) __obj.updateDynamic("address")(address)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[LibraTransactionEvent]
  }
}

