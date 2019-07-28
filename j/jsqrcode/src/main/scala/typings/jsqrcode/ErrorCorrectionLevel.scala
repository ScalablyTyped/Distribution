package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorCorrectionLevel")
@js.native
class ErrorCorrectionLevel protected () extends js.Object {
  def this(ordinal: Double, bits: Double, name: String) = this()
  val Bits: Double = js.native
  val Name: String = js.native
  var bits: Double = js.native
  var name: String = js.native
  var ordinal_Renamed_Field: Double = js.native
}

/* static members */
@JSGlobal("ErrorCorrectionLevel")
@js.native
object ErrorCorrectionLevel extends js.Object {
  def forBits(bits: Double): ErrorCorrectionLevel = js.native
}

