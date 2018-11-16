package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256")
@js.native
class GF256 protected () extends js.Object {
  def this(primitive: scala.Double) = this()
  val One: GF256Poly = js.native
  val Zero: GF256Poly = js.native
  var expTable: js.Array[scala.Double] = js.native
  var logTable: js.Array[scala.Double] = js.native
  var one: GF256Poly = js.native
  var zero: GF256Poly = js.native
  def buildMonomial(degree: scala.Double, coefficient: scala.Double): GF256Poly = js.native
  def exp(a: scala.Double): scala.Double = js.native
  def inverse(a: scala.Double): scala.Double = js.native
  def log(a: scala.Double): scala.Double = js.native
  def multiply(a: scala.Double, b: scala.Double): scala.Double = js.native
}

@JSGlobal("GF256")
@js.native
object GF256 extends js.Object {
  val DATA_MATRIX_FIELD: jsqrcodeLib.GF256 = js.native
  val QR_CODE_FIELD: jsqrcodeLib.GF256 = js.native
  def addOrSubtract(a: scala.Double, b: scala.Double): scala.Double = js.native
}

