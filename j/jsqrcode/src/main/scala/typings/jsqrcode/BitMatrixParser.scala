package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrixParser")
@js.native
class BitMatrixParser protected () extends js.Object {
  def this(bitMatrix: BitMatrix) = this()
  var bitMatrix: BitMatrix = js.native
  var parsedFormatInfo: FormatInformation = js.native
  var parsedVersion: Version = js.native
  def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
  def readCodewords(): js.Array[Double] = js.native
  def readFormatInformation(): FormatInformation = js.native
  def readVersion(): Version = js.native
}

