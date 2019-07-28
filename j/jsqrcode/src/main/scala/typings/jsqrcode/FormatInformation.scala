package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormatInformation")
@js.native
class FormatInformation () extends js.Object {
  val DataMask: Double = js.native
  val ErrorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
  var dataMask: Double = js.native
  var errorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
  def Equals(other: FormatInformation): Boolean = js.native
  def GetHashCode(): Double = js.native
}

/* static members */
@JSGlobal("FormatInformation")
@js.native
object FormatInformation extends js.Object {
  def decodeFormatInformation(maskedFormatInfo: Double): FormatInformation = js.native
  /* private */ def doDecodeFormatInformation(maskedFormatInfo: Double): FormatInformation = js.native
  def numBitsDiffering(a: Double, b: js.Tuple2[Double, Double]): Double = js.native
}

