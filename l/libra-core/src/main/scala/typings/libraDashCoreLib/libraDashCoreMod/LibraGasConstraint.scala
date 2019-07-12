package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraGasConstraint extends js.Object {
  var gasUnitPrice: bignumberDotJsLib.bignumberDotJsMod.default
  var maxGasAmount: bignumberDotJsLib.bignumberDotJsMod.default
}

object LibraGasConstraint {
  @scala.inline
  def apply(
    gasUnitPrice: bignumberDotJsLib.bignumberDotJsMod.default,
    maxGasAmount: bignumberDotJsLib.bignumberDotJsMod.default
  ): LibraGasConstraint = {
    val __obj = js.Dynamic.literal(gasUnitPrice = gasUnitPrice, maxGasAmount = maxGasAmount)
  
    __obj.asInstanceOf[LibraGasConstraint]
  }
}

