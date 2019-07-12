package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraTransaction extends js.Object {
  var expirationTime: bignumberDotJsLib.bignumberDotJsMod.default
  var gasConstraint: LibraGasConstraint
  var program: LibraProgram
  var sendersAddress: stdLib.Uint8Array
  var sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
}

object LibraTransaction {
  @scala.inline
  def apply(
    expirationTime: bignumberDotJsLib.bignumberDotJsMod.default,
    gasConstraint: LibraGasConstraint,
    program: LibraProgram,
    sendersAddress: stdLib.Uint8Array,
    sequenceNumber: bignumberDotJsLib.bignumberDotJsMod.default
  ): LibraTransaction = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime, gasConstraint = gasConstraint, program = program, sendersAddress = sendersAddress, sequenceNumber = sequenceNumber)
  
    __obj.asInstanceOf[LibraTransaction]
  }
}

