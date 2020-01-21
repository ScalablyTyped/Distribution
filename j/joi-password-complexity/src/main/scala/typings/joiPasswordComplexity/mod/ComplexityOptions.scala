package typings.joiPasswordComplexity.mod

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
    val __obj = js.Dynamic.literal(lowerCase = lowerCase.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], requirementCount = requirementCount.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], upperCase = upperCase.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComplexityOptions]
  }
}

