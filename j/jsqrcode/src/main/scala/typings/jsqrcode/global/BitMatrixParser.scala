package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrixParser")
@js.native
class BitMatrixParser protected ()
  extends typings.jsqrcode.BitMatrixParser {
  def this(bitMatrix: typings.jsqrcode.BitMatrix) = this()
  /* CompleteClass */
  override var bitMatrix: typings.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override var parsedFormatInfo: typings.jsqrcode.FormatInformation = js.native
  /* CompleteClass */
  override var parsedVersion: typings.jsqrcode.Version = js.native
  /* CompleteClass */
  override def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
  /* CompleteClass */
  override def readCodewords(): js.Array[Double] = js.native
  /* CompleteClass */
  override def readFormatInformation(): typings.jsqrcode.FormatInformation = js.native
  /* CompleteClass */
  override def readVersion(): typings.jsqrcode.Version = js.native
}

