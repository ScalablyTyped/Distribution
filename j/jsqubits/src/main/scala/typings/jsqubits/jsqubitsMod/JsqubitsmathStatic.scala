package typings.jsqubits.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsqubitsmathStatic extends js.Object {
  def continuedFraction(targetValue: Double, precision: Double): ContinuedFractionResult
  def findNullSpaceMod2(a: js.Array[js.Array[Double]], width: js.Array[Double]): js.Array[Double]
  def gcd(a: Double, b: Double): Double
  def lcm(a: Double, b: Double): Double
  def powerFactor(n: Double): Double
  def powerMod(x: Double, y: Double, m: Double): Double
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
}

