package typings
package jsqubitsLib.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuedFractionResult extends js.Object {
  var denominator: scala.Double
  var numerator: scala.Double
  var quotients: js.Array[scala.Double]
}

object ContinuedFractionResult {
  @scala.inline
  def apply(denominator: scala.Double, numerator: scala.Double, quotients: js.Array[scala.Double]): ContinuedFractionResult = {
    val __obj = js.Dynamic.literal(denominator = denominator, numerator = numerator, quotients = quotients)
  
    __obj.asInstanceOf[ContinuedFractionResult]
  }
}

