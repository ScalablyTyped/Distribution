package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ErrorCorrectionLevel")
@js.native
class ErrorCorrectionLevel protected ()
  extends typings.jsqrcode.ErrorCorrectionLevel {
  def this(ordinal: Double, bits: Double, name: String) = this()
}
/* static members */
@JSGlobal("ErrorCorrectionLevel")
@js.native
object ErrorCorrectionLevel extends js.Object {
  
  def forBits(bits: Double): typings.jsqrcode.ErrorCorrectionLevel = js.native
}
