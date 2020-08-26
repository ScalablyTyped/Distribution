package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormatInformation")
@js.native
class FormatInformation ()
  extends typings.jsqrcode.FormatInformation

/* static members */
@JSGlobal("FormatInformation")
@js.native
object FormatInformation extends js.Object {
  def decodeFormatInformation(maskedFormatInfo: Double): typings.jsqrcode.FormatInformation = js.native
  /* private */ def doDecodeFormatInformation(maskedFormatInfo: Double): typings.jsqrcode.FormatInformation = js.native
  def numBitsDiffering(a: Double, b: js.Tuple2[Double, Double]): Double = js.native
}

