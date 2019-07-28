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

object LibraTransaction {
  @scala.inline
  def apply(
    expirationTime: default,
    gasConstraint: LibraGasConstraint,
    program: LibraProgram,
    sendersAddress: Uint8Array,
    sequenceNumber: default
  ): LibraTransaction = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime, gasConstraint = gasConstraint, program = program, sendersAddress = sendersAddress, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[LibraTransaction]
  }
}

