package typings.jsqubits.mod

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
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any], quotients = quotients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuedFractionResult]
  }
}

