package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatInformation extends js.Object {
  val DataMask: Double
  val ErrorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel
  var dataMask: Double
  var errorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel
  def Equals(other: FormatInformation): Boolean
  def GetHashCode(): Double
}

object FormatInformation {
  @scala.inline
  def apply(
    DataMask: Double,
    Equals: FormatInformation => Boolean,
    ErrorCorrectionLevel: ErrorCorrectionLevel,
    GetHashCode: () => Double,
    dataMask: Double,
    errorCorrectionLevel: ErrorCorrectionLevel
  ): FormatInformation = {
    val __obj = js.Dynamic.literal(DataMask = DataMask.asInstanceOf[js.Any], Equals = js.Any.fromFunction1(Equals), ErrorCorrectionLevel = ErrorCorrectionLevel.asInstanceOf[js.Any], GetHashCode = js.Any.fromFunction0(GetHashCode), dataMask = dataMask.asInstanceOf[js.Any], errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatInformation]
  }
}

