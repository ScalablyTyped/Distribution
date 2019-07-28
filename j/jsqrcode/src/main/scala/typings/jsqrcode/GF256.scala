package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256")
@js.native
class GF256 protected () extends js.Object {
  def this(primitive: Double) = this()
  val One: GF256Poly = js.native
  val Zero: GF256Poly = js.native
  var expTable: js.Array[Double] = js.native
  var logTable: js.Array[Double] = js.native
  var one: GF256Poly = js.native
  var zero: GF256Poly = js.native
  def buildMonomial(degree: Double, coefficient: Double): GF256Poly = js.native
  def exp(a: Double): Double = js.native
  def inverse(a: Double): Double = js.native
  def log(a: Double): Double = js.native
  def multiply(a: Double, b: Double): Double = js.native
}

/* static members */
@JSGlobal("GF256")
@js.native
object GF256 extends js.Object {
  val DATA_MATRIX_FIELD: GF256 = js.native
  val QR_CODE_FIELD: GF256 = js.native
  def addOrSubtract(a: Double, b: Double): Double = js.native
}

