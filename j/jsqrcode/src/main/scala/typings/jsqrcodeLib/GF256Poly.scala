package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256Poly")
@js.native
class GF256Poly protected () extends js.Object {
  def this(field: GF256, coefficients: js.Array[scala.Double]) = this()
  val Coefficients: js.Array[scala.Double] = js.native
  val Degree: scala.Double = js.native
  val Zero: scala.Boolean = js.native
  var coefficients: js.Array[scala.Double] = js.native
  var field: GF256 = js.native
  def addOrSubtract(other: GF256Poly): GF256Poly = js.native
  def divide(other: GF256Poly): js.Tuple2[GF256Poly, GF256Poly] = js.native
  def evaluateAt(a: scala.Double): scala.Double = js.native
  def getCoefficient(degree: scala.Double): scala.Double = js.native
  def multiply1(other: GF256Poly): GF256Poly = js.native
  def multiply2(scalar: scala.Double): GF256Poly = js.native
  def multiplyByMonomial(degree: scala.Double, coefficient: scala.Double): GF256Poly = js.native
}

