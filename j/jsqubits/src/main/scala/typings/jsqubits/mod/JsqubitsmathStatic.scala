package typings.jsqubits.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsqubitsmathStatic extends js.Object {
  def continuedFraction(targetValue: Double, precision: Double): ContinuedFractionResult = js.native
  def findNullSpaceMod2(a: js.Array[js.Array[Double]], width: js.Array[Double]): js.Array[Double] = js.native
  def gcd(a: Double, b: Double): Double = js.native
  def lcm(a: Double, b: Double): Double = js.native
  def powerFactor(n: Double): Double = js.native
  def powerMod(x: Double, y: Double, m: Double): Double = js.native
}

object JsqubitsmathStatic {
  @scala.inline
  def apply(
    continuedFraction: (Double, Double) => ContinuedFractionResult,
    findNullSpaceMod2: (js.Array[js.Array[Double]], js.Array[Double]) => js.Array[Double],
    gcd: (Double, Double) => Double,
    lcm: (Double, Double) => Double,
    powerFactor: Double => Double,
    powerMod: (Double, Double, Double) => Double
  ): JsqubitsmathStatic = {
    val __obj = js.Dynamic.literal(continuedFraction = js.Any.fromFunction2(continuedFraction), findNullSpaceMod2 = js.Any.fromFunction2(findNullSpaceMod2), gcd = js.Any.fromFunction2(gcd), lcm = js.Any.fromFunction2(lcm), powerFactor = js.Any.fromFunction1(powerFactor), powerMod = js.Any.fromFunction3(powerMod))
    __obj.asInstanceOf[JsqubitsmathStatic]
  }
  @scala.inline
  implicit class JsqubitsmathStaticOps[Self <: JsqubitsmathStatic] (val x: Self) extends AnyVal {
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
    def setContinuedFraction(value: (Double, Double) => ContinuedFractionResult): Self = this.set("continuedFraction", js.Any.fromFunction2(value))
    @scala.inline
    def setFindNullSpaceMod2(value: (js.Array[js.Array[Double]], js.Array[Double]) => js.Array[Double]): Self = this.set("findNullSpaceMod2", js.Any.fromFunction2(value))
    @scala.inline
    def setGcd(value: (Double, Double) => Double): Self = this.set("gcd", js.Any.fromFunction2(value))
    @scala.inline
    def setLcm(value: (Double, Double) => Double): Self = this.set("lcm", js.Any.fromFunction2(value))
    @scala.inline
    def setPowerFactor(value: Double => Double): Self = this.set("powerFactor", js.Any.fromFunction1(value))
    @scala.inline
    def setPowerMod(value: (Double, Double, Double) => Double): Self = this.set("powerMod", js.Any.fromFunction3(value))
  }
  
}

