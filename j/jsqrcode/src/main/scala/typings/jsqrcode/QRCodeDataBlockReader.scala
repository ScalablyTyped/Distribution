package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeDataBlockReader extends js.Object {
  val DataByte: js.Array[String | js.Array[Double]]
  var bitPointer: Double
  var blockPointer: Double
  var blocks: js.Array[Double]
  var dataLength: Double
  var dataLengthMode: Double
  var numErrorCorrectionCode: Double
  def NextMode(): Double
  def get8bitByteArray(dataLength: Double): js.Array[Double]
  def getDataLength(modeIndicator: Double): Double
  def getFigureString(dataLength: Double): String
  def getKanjiString(dataLength: Double): String
  def getNextBits(numBits: Double): Double
  def getRomanAndFigureString(dataLength: Double): String
  def parseECIValue(): Double
}

object QRCodeDataBlockReader {
  @scala.inline
  def apply(
    DataByte: js.Array[String | js.Array[Double]],
    NextMode: () => Double,
    bitPointer: Double,
    blockPointer: Double,
    blocks: js.Array[Double],
    dataLength: Double,
    dataLengthMode: Double,
    get8bitByteArray: Double => js.Array[Double],
    getDataLength: Double => Double,
    getFigureString: Double => String,
    getKanjiString: Double => String,
    getNextBits: Double => Double,
    getRomanAndFigureString: Double => String,
    numErrorCorrectionCode: Double,
    parseECIValue: () => Double
  ): QRCodeDataBlockReader = {
    val __obj = js.Dynamic.literal(DataByte = DataByte.asInstanceOf[js.Any], NextMode = js.Any.fromFunction0(NextMode), bitPointer = bitPointer.asInstanceOf[js.Any], blockPointer = blockPointer.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], dataLengthMode = dataLengthMode.asInstanceOf[js.Any], get8bitByteArray = js.Any.fromFunction1(get8bitByteArray), getDataLength = js.Any.fromFunction1(getDataLength), getFigureString = js.Any.fromFunction1(getFigureString), getKanjiString = js.Any.fromFunction1(getKanjiString), getNextBits = js.Any.fromFunction1(getNextBits), getRomanAndFigureString = js.Any.fromFunction1(getRomanAndFigureString), numErrorCorrectionCode = numErrorCorrectionCode.asInstanceOf[js.Any], parseECIValue = js.Any.fromFunction0(parseECIValue))
    __obj.asInstanceOf[QRCodeDataBlockReader]
  }
}

