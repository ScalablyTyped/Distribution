package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QRCodeDataBlockReader")
@js.native
class QRCodeDataBlockReader protected () extends js.Object {
  def this(blocks: js.Array[scala.Double], version: scala.Double, numErrorCorrectionCode: scala.Double) = this()
  val DataByte: js.Array[java.lang.String | js.Array[scala.Double]] = js.native
  var bitPointer: scala.Double = js.native
  var blockPointer: scala.Double = js.native
  var blocks: js.Array[scala.Double] = js.native
  var dataLength: scala.Double = js.native
  var dataLengthMode: scala.Double = js.native
  var numErrorCorrectionCode: scala.Double = js.native
  def NextMode(): scala.Double = js.native
  def get8bitByteArray(dataLength: scala.Double): js.Array[scala.Double] = js.native
  def getDataLength(modeIndicator: scala.Double): scala.Double = js.native
  def getFigureString(dataLength: scala.Double): java.lang.String = js.native
  def getKanjiString(dataLength: scala.Double): java.lang.String = js.native
  def getNextBits(numBits: scala.Double): scala.Double = js.native
  def getRomanAndFigureString(dataLength: scala.Double): java.lang.String = js.native
  def parseECIValue(): scala.Double = js.native
}

