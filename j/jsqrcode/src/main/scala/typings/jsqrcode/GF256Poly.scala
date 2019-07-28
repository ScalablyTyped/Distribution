package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256Poly")
@js.native
class GF256Poly protected () extends js.Object {
  def this(field: GF256, coefficients: js.Array[Double]) = this()
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

