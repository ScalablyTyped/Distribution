package typings.jsqubits.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuedFractionResult extends js.Object {
  var denominator: Double
  var numerator: Double
  var quotients: js.Array[Double]
}

object ContinuedFractionResult {
  @scala.inline
  def apply(denominator: Double, numerator: Double, quotients: js.Array[Double]): ContinuedFractionResult = {
    val __obj = js.Dynamic.literal(denominator = denominator, numerator = numerator, quotients = quotients)
  
    __obj.asInstanceOf[ContinuedFractionResult]
  }
}

