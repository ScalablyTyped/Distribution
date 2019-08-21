package typings.joiDashPasswordDashComplexity.joiDashPasswordDashComplexityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplexityOptions extends js.Object {
  var lowerCase: Double
  var max: Double
  var min: Double
  var numeric: Double
  var requirementCount: Double
  var symbol: Double
  var upperCase: Double
}

object ComplexityOptions {
  @scala.inline
  def apply(
    lowerCase: Double,
    max: Double,
    min: Double,
    numeric: Double,
    requirementCount: Double,
    symbol: Double,
    upperCase: Double
  ): ComplexityOptions = {
    val __obj = js.Dynamic.literal(lowerCase = lowerCase, max = max, min = min, numeric = numeric, requirementCount = requirementCount, symbol = symbol, upperCase = upperCase)
  
    __obj.asInstanceOf[ComplexityOptions]
  }
}

