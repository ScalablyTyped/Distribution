package typings.jsqubits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuedFractionResult extends js.Object {
  var denominator: Double = js.native
  var numerator: Double = js.native
  var quotients: js.Array[Double] = js.native
}

object ContinuedFractionResult {
  @scala.inline
  def apply(denominator: Double, numerator: Double, quotients: js.Array[Double]): ContinuedFractionResult = {
    val __obj = js.Dynamic.literal(denominator = denominator.asInstanceOf[js.Any], numerator = numerator.asInstanceOf[js.Any], quotients = quotients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuedFractionResult]
  }
  @scala.inline
  implicit class ContinuedFractionResultOps[Self <: ContinuedFractionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDenominator(value: Double): Self = this.set("denominator", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumerator(value: Double): Self = this.set("numerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuotientsVarargs(value: Double*): Self = this.set("quotients", js.Array(value :_*))
    @scala.inline
    def setQuotients(value: js.Array[Double]): Self = this.set("quotients", value.asInstanceOf[js.Any])
  }
  
}

