package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ErrorCorrectionLevel")
@js.native
class ErrorCorrectionLevel protected ()
  extends typings.jsqrcode.ErrorCorrectionLevel {
  def this(ordinal: Double, bits: Double, name: String) = this()
  /* CompleteClass */
  override val Bits: Double = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override var bits: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var ordinal_Renamed_Field: Double = js.native
}

/* static members */
@JSGlobal("ErrorCorrectionLevel")
@js.native
object ErrorCorrectionLevel extends js.Object {
  def forBits(bits: Double): typings.jsqrcode.ErrorCorrectionLevel = js.native
}

