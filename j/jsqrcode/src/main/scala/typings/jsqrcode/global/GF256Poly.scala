package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256Poly")
@js.native
class GF256Poly protected ()
  extends typings.jsqrcode.GF256Poly {
  def this(field: typings.jsqrcode.GF256, coefficients: js.Array[Double]) = this()
  /* CompleteClass */
  override val Coefficients: js.Array[Double] = js.native
  /* CompleteClass */
  override val Degree: Double = js.native
  /* CompleteClass */
  override val Zero: Boolean = js.native
  /* CompleteClass */
  override var coefficients: js.Array[Double] = js.native
  /* CompleteClass */
  override var field: typings.jsqrcode.GF256 = js.native
  /* CompleteClass */
  override def addOrSubtract(other: typings.jsqrcode.GF256Poly): typings.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def divide(other: typings.jsqrcode.GF256Poly): js.Tuple2[typings.jsqrcode.GF256Poly, typings.jsqrcode.GF256Poly] = js.native
  /* CompleteClass */
  override def evaluateAt(a: Double): Double = js.native
  /* CompleteClass */
  override def getCoefficient(degree: Double): Double = js.native
  /* CompleteClass */
  override def multiply1(other: typings.jsqrcode.GF256Poly): typings.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def multiply2(scalar: Double): typings.jsqrcode.GF256Poly = js.native
  /* CompleteClass */
  override def multiplyByMonomial(degree: Double, coefficient: Double): typings.jsqrcode.GF256Poly = js.native
}

