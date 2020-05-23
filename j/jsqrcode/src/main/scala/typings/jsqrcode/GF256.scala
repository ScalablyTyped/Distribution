package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GF256 extends js.Object {
  val One: GF256Poly
  val Zero: GF256Poly
  var expTable: js.Array[Double]
  var logTable: js.Array[Double]
  var one: GF256Poly
  var zero: GF256Poly
  def buildMonomial(degree: Double, coefficient: Double): GF256Poly
  def exp(a: Double): Double
  def inverse(a: Double): Double
  def log(a: Double): Double
  def multiply(a: Double, b: Double): Double
}

object GF256 {
  @scala.inline
  def apply(
    One: GF256Poly,
    Zero: GF256Poly,
    buildMonomial: (Double, Double) => GF256Poly,
    exp: Double => Double,
    expTable: js.Array[Double],
    inverse: Double => Double,
    log: Double => Double,
    logTable: js.Array[Double],
    multiply: (Double, Double) => Double,
    one: GF256Poly,
    zero: GF256Poly
  ): GF256 = {
    val __obj = js.Dynamic.literal(One = One.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], buildMonomial = js.Any.fromFunction2(buildMonomial), exp = js.Any.fromFunction1(exp), expTable = expTable.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse), log = js.Any.fromFunction1(log), logTable = logTable.asInstanceOf[js.Any], multiply = js.Any.fromFunction2(multiply), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[GF256]
  }
}

