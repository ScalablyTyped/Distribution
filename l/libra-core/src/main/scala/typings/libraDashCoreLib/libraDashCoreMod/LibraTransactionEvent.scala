package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransactionEvent extends js.Object {
  var address: js.UndefOr[AccountAddress] = js.undefined
  var data: stdLib.Uint8Array
  var path: js.UndefOr[stdLib.Uint8Array] = js.undefined
  var sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
}

object LibraTransactionEvent {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default,
    address: AccountAddress = null,
    path: stdLib.Uint8Array = null
  ): LibraTransactionEvent = {
    val __obj = js.Dynamic.literal(data = data, sequenceNumber = sequenceNumber)
    if (address != null) __obj.updateDynamic("address")(address)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[LibraTransactionEvent]
  }
}

