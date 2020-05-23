package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GF256Poly extends js.Object {
  val Coefficients: js.Array[Double]
  val Degree: Double
  val Zero: Boolean
  var coefficients: js.Array[Double]
  var field: GF256
  def addOrSubtract(other: GF256Poly): GF256Poly
  def divide(other: GF256Poly): js.Tuple2[GF256Poly, GF256Poly]
  def evaluateAt(a: Double): Double
  def getCoefficient(degree: Double): Double
  def multiply1(other: GF256Poly): GF256Poly
  def multiply2(scalar: Double): GF256Poly
  def multiplyByMonomial(degree: Double, coefficient: Double): GF256Poly
}

object GF256Poly {
  @scala.inline
  def apply(
    Coefficients: js.Array[Double],
    Degree: Double,
    Zero: Boolean,
    addOrSubtract: GF256Poly => GF256Poly,
    coefficients: js.Array[Double],
    divide: GF256Poly => js.Tuple2[GF256Poly, GF256Poly],
    evaluateAt: Double => Double,
    field: GF256,
    getCoefficient: Double => Double,
    multiply1: GF256Poly => GF256Poly,
    multiply2: Double => GF256Poly,
    multiplyByMonomial: (Double, Double) => GF256Poly
  ): GF256Poly = {
    val __obj = js.Dynamic.literal(Coefficients = Coefficients.asInstanceOf[js.Any], Degree = Degree.asInstanceOf[js.Any], Zero = Zero.asInstanceOf[js.Any], addOrSubtract = js.Any.fromFunction1(addOrSubtract), coefficients = coefficients.asInstanceOf[js.Any], divide = js.Any.fromFunction1(divide), evaluateAt = js.Any.fromFunction1(evaluateAt), field = field.asInstanceOf[js.Any], getCoefficient = js.Any.fromFunction1(getCoefficient), multiply1 = js.Any.fromFunction1(multiply1), multiply2 = js.Any.fromFunction1(multiply2), multiplyByMonomial = js.Any.fromFunction2(multiplyByMonomial))
    __obj.asInstanceOf[GF256Poly]
  }
}

