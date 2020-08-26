package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GF256")
@js.native
class GF256 protected ()
  extends typings.jsqrcode.GF256 {
  def this(primitive: Double) = this()
}

/* static members */
@JSGlobal("GF256")
@js.native
object GF256 extends js.Object {
  val DATA_MATRIX_FIELD: typings.jsqrcode.GF256 = js.native
  val QR_CODE_FIELD: typings.jsqrcode.GF256 = js.native
  def addOrSubtract(a: Double, b: Double): Double = js.native
}

