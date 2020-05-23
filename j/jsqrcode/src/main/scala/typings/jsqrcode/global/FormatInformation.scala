package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FormatInformation")
@js.native
class FormatInformation ()
  extends typings.jsqrcode.FormatInformation {
  /* CompleteClass */
  override val DataMask: Double = js.native
  /* CompleteClass */
  override val ErrorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
  /* CompleteClass */
  override var dataMask: Double = js.native
  /* CompleteClass */
  override var errorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
  /* CompleteClass */
  override def Equals(other: typings.jsqrcode.FormatInformation): Boolean = js.native
  /* CompleteClass */
  override def GetHashCode(): Double = js.native
}

/* static members */
@JSGlobal("FormatInformation")
@js.native
object FormatInformation extends js.Object {
  def decodeFormatInformation(maskedFormatInfo: Double): typings.jsqrcode.FormatInformation = js.native
  /* private */ def doDecodeFormatInformation(maskedFormatInfo: Double): typings.jsqrcode.FormatInformation = js.native
  def numBitsDiffering(a: Double, b: js.Tuple2[Double, Double]): Double = js.native
}

