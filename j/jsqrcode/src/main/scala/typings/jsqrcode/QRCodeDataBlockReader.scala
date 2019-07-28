package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QRCodeDataBlockReader")
@js.native
class QRCodeDataBlockReader protected () extends js.Object {
  def this(blocks: js.Array[Double], version: Double, numErrorCorrectionCode: Double) = this()
  val DataByte: js.Array[String | js.Array[Double]] = js.native
  var bitPointer: Double = js.native
  var blockPointer: Double = js.native
  var blocks: js.Array[Double] = js.native
  var dataLength: Double = js.native
  var dataLengthMode: Double = js.native
  var numErrorCorrectionCode: Double = js.native
  def NextMode(): Double = js.native
  def get8bitByteArray(dataLength: Double): js.Array[Double] = js.native
  def getDataLength(modeIndicator: Double): Double = js.native
  def getFigureString(dataLength: Double): String = js.native
  def getKanjiString(dataLength: Double): String = js.native
  def getNextBits(numBits: Double): Double = js.native
  def getRomanAndFigureString(dataLength: Double): String = js.native
  def parseECIValue(): Double = js.native
}

