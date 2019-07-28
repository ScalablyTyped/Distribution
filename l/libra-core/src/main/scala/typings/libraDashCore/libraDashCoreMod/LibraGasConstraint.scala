package typings.libraDashCore.libraDashCoreMod

import typings.bignumberDotJs.bignumberDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraGasConstraint extends js.Object {
  var gasUnitPrice: default
  var maxGasAmount: default
}

object LibraGasConstraint {
  @scala.inline
  def apply(gasUnitPrice: default, maxGasAmount: default): LibraGasConstraint = {
    val __obj = js.Dynamic.literal(gasUnitPrice = gasUnitPrice, maxGasAmount = maxGasAmount)
  
    __obj.asInstanceOf[LibraGasConstraint]
  }
}

