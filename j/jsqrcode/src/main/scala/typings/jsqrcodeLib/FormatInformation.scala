package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormatInformation")
@js.native
class FormatInformation () extends js.Object {
  val DataMask: scala.Double = js.native
  val ErrorCorrectionLevel: ErrorCorrectionLevel = js.native
  var dataMask: scala.Double = js.native
  var errorCorrectionLevel: ErrorCorrectionLevel = js.native
  def Equals(other: FormatInformation): scala.Boolean = js.native
  def GetHashCode(): scala.Double = js.native
}

@JSGlobal("FormatInformation")
@js.native
object FormatInformation extends js.Object {
  def decodeFormatInformation(maskedFormatInfo: scala.Double): jsqrcodeLib.FormatInformation = js.native
  /* private */ def doDecodeFormatInformation(maskedFormatInfo: scala.Double): jsqrcodeLib.FormatInformation = js.native
  def numBitsDiffering(a: scala.Double, b: js.Tuple2[scala.Double, scala.Double]): scala.Double = js.native
}

