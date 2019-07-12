package typings
package jsqubitsLib.jsqubitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsqubitsmathStatic extends js.Object {
  def continuedFraction(targetValue: scala.Double, precision: scala.Double): ContinuedFractionResult
  def findNullSpaceMod2(a: js.Array[js.Array[scala.Double]], width: js.Array[scala.Double]): js.Array[scala.Double]
  def gcd(a: scala.Double, b: scala.Double): scala.Double
  def lcm(a: scala.Double, b: scala.Double): scala.Double
  def powerFactor(n: scala.Double): scala.Double
  def powerMod(x: scala.Double, y: scala.Double, m: scala.Double): scala.Double
}

object JsqubitsmathStatic {
  @scala.inline
  def apply(
    continuedFraction: (scala.Double, scala.Double) => ContinuedFractionResult,
    findNullSpaceMod2: (js.Array[js.Array[scala.Double]], js.Array[scala.Double]) => js.Array[scala.Double],
    gcd: (scala.Double, scala.Double) => scala.Double,
    lcm: (scala.Double, scala.Double) => scala.Double,
    powerFactor: scala.Double => scala.Double,
    powerMod: (scala.Double, scala.Double, scala.Double) => scala.Double
  ): JsqubitsmathStatic = {
    val __obj = js.Dynamic.literal(continuedFraction = js.Any.fromFunction2(continuedFraction), findNullSpaceMod2 = js.Any.fromFunction2(findNullSpaceMod2), gcd = js.Any.fromFunction2(gcd), lcm = js.Any.fromFunction2(lcm), powerFactor = js.Any.fromFunction1(powerFactor), powerMod = js.Any.fromFunction3(powerMod))
  
    __obj.asInstanceOf[JsqubitsmathStatic]
  }
}

