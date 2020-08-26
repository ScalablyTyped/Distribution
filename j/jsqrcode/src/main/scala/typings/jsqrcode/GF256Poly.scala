package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GF256Poly extends js.Object {
  val Coefficients: js.Array[Double] = js.native
  val Degree: Double = js.native
  val Zero: Boolean = js.native
  var coefficients: js.Array[Double] = js.native
  var field: GF256 = js.native
  def addOrSubtract(other: GF256Poly): GF256Poly = js.native
  def divide(other: GF256Poly): js.Tuple2[GF256Poly, GF256Poly] = js.native
  def evaluateAt(a: Double): Double = js.native
  def getCoefficient(degree: Double): Double = js.native
  def multiply1(other: GF256Poly): GF256Poly = js.native
  def multiply2(scalar: Double): GF256Poly = js.native
  def multiplyByMonomial(degree: Double, coefficient: Double): GF256Poly = js.native
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
  @scala.inline
  implicit class GF256PolyOps[Self <: GF256Poly] (val x: Self) extends AnyVal {
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
    def setCoefficientsVarargs(value: Double*): Self = this.set("Coefficients", js.Array(value :_*))
    @scala.inline
    def setCoefficients(value: js.Array[Double]): Self = this.set("Coefficients", value.asInstanceOf[js.Any])
    @scala.inline
    def setDegree(value: Double): Self = this.set("Degree", value.asInstanceOf[js.Any])
    @scala.inline
    def setZero(value: Boolean): Self = this.set("Zero", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddOrSubtract(value: GF256Poly => GF256Poly): Self = this.set("addOrSubtract", js.Any.fromFunction1(value))
    @scala.inline
    def setDivide(value: GF256Poly => js.Tuple2[GF256Poly, GF256Poly]): Self = this.set("divide", js.Any.fromFunction1(value))
    @scala.inline
    def setEvaluateAt(value: Double => Double): Self = this.set("evaluateAt", js.Any.fromFunction1(value))
    @scala.inline
    def setField(value: GF256): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCoefficient(value: Double => Double): Self = this.set("getCoefficient", js.Any.fromFunction1(value))
    @scala.inline
    def setMultiply1(value: GF256Poly => GF256Poly): Self = this.set("multiply1", js.Any.fromFunction1(value))
    @scala.inline
    def setMultiply2(value: Double => GF256Poly): Self = this.set("multiply2", js.Any.fromFunction1(value))
    @scala.inline
    def setMultiplyByMonomial(value: (Double, Double) => GF256Poly): Self = this.set("multiplyByMonomial", js.Any.fromFunction2(value))
  }
  
}

