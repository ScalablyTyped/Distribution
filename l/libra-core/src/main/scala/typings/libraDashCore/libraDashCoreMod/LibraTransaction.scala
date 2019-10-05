package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransaction extends js.Object {
  var expirationTime: default
  var gasConstraint: LibraGasConstraint
  var program: LibraProgram
  var sendersAddress: Uint8Array
  var sequenceNumber: default
}

@JSImport("libra-core", "LibraTransaction")
@js.native
object LibraTransaction extends js.Object {
  def apply(
    program: LibraProgram,
    gasConstraint: LibraGasConstraint,
    expirationTime: default,
    sendersAddress: Uint8Array,
    sequenceNumber: default
  ): Unit = js.native
  def createTransfer(recipientAddress: String, numAccount: default): LibraTransaction = js.native
}

