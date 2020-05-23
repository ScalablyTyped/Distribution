package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitMatrixParser extends js.Object {
  var bitMatrix: BitMatrix
  var parsedFormatInfo: FormatInformation
  var parsedVersion: Version
  def copyBit(i: Double, j: Double, versionBits: Double): Double
  def readCodewords(): js.Array[Double]
  def readFormatInformation(): FormatInformation
  def readVersion(): Version
}

object BitMatrixParser {
  @scala.inline
  def apply(
    bitMatrix: BitMatrix,
    copyBit: (Double, Double, Double) => Double,
    parsedFormatInfo: FormatInformation,
    parsedVersion: Version,
    readCodewords: () => js.Array[Double],
    readFormatInformation: () => FormatInformation,
    readVersion: () => Version
  ): BitMatrixParser = {
    val __obj = js.Dynamic.literal(bitMatrix = bitMatrix.asInstanceOf[js.Any], copyBit = js.Any.fromFunction3(copyBit), parsedFormatInfo = parsedFormatInfo.asInstanceOf[js.Any], parsedVersion = parsedVersion.asInstanceOf[js.Any], readCodewords = js.Any.fromFunction0(readCodewords), readFormatInformation = js.Any.fromFunction0(readFormatInformation), readVersion = js.Any.fromFunction0(readVersion))
    __obj.asInstanceOf[BitMatrixParser]
  }
}

