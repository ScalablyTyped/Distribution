package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QRCodeDataBlockReader")
@js.native
class QRCodeDataBlockReader protected ()
  extends typings.jsqrcode.QRCodeDataBlockReader {
  def this(blocks: js.Array[Double], version: Double, numErrorCorrectionCode: Double) = this()
  /* CompleteClass */
  override val DataByte: js.Array[String | js.Array[Double]] = js.native
  /* CompleteClass */
  override var bitPointer: Double = js.native
  /* CompleteClass */
  override var blockPointer: Double = js.native
  /* CompleteClass */
  override var blocks: js.Array[Double] = js.native
  /* CompleteClass */
  override var dataLength: Double = js.native
  /* CompleteClass */
  override var dataLengthMode: Double = js.native
  /* CompleteClass */
  override var numErrorCorrectionCode: Double = js.native
  /* CompleteClass */
  override def NextMode(): Double = js.native
  /* CompleteClass */
  override def get8bitByteArray(dataLength: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def getDataLength(modeIndicator: Double): Double = js.native
  /* CompleteClass */
  override def getFigureString(dataLength: Double): String = js.native
  /* CompleteClass */
  override def getKanjiString(dataLength: Double): String = js.native
  /* CompleteClass */
  override def getNextBits(numBits: Double): Double = js.native
  /* CompleteClass */
  override def getRomanAndFigureString(dataLength: Double): String = js.native
  /* CompleteClass */
  override def parseECIValue(): Double = js.native
}

