package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeDataBlockReader extends StObject {
  
  val DataByte: js.Array[String | js.Array[Double]]
  
  def NextMode(): Double
  
  var bitPointer: Double
  
  var blockPointer: Double
  
  var blocks: js.Array[Double]
  
  var dataLength: Double
  
  var dataLengthMode: Double
  
  def get8bitByteArray(dataLength: Double): js.Array[Double]
  
  def getDataLength(modeIndicator: Double): Double
  
  def getFigureString(dataLength: Double): String
  
  def getKanjiString(dataLength: Double): String
  
  def getNextBits(numBits: Double): Double
  
  def getRomanAndFigureString(dataLength: Double): String
  
  var numErrorCorrectionCode: Double
  
  def parseECIValue(): Double
}
object QRCodeDataBlockReader {
  
  inline def apply(
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
  
  extension [Self <: QRCodeDataBlockReader](x: Self) {
    
    inline def setBitPointer(value: Double): Self = StObject.set(x, "bitPointer", value.asInstanceOf[js.Any])
    
    inline def setBlockPointer(value: Double): Self = StObject.set(x, "blockPointer", value.asInstanceOf[js.Any])
    
    inline def setBlocks(value: js.Array[Double]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: Double*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    inline def setDataByte(value: js.Array[String | js.Array[Double]]): Self = StObject.set(x, "DataByte", value.asInstanceOf[js.Any])
    
    inline def setDataByteVarargs(value: (String | js.Array[Double])*): Self = StObject.set(x, "DataByte", js.Array(value :_*))
    
    inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
    
    inline def setDataLengthMode(value: Double): Self = StObject.set(x, "dataLengthMode", value.asInstanceOf[js.Any])
    
    inline def setGet8bitByteArray(value: Double => js.Array[Double]): Self = StObject.set(x, "get8bitByteArray", js.Any.fromFunction1(value))
    
    inline def setGetDataLength(value: Double => Double): Self = StObject.set(x, "getDataLength", js.Any.fromFunction1(value))
    
    inline def setGetFigureString(value: Double => String): Self = StObject.set(x, "getFigureString", js.Any.fromFunction1(value))
    
    inline def setGetKanjiString(value: Double => String): Self = StObject.set(x, "getKanjiString", js.Any.fromFunction1(value))
    
    inline def setGetNextBits(value: Double => Double): Self = StObject.set(x, "getNextBits", js.Any.fromFunction1(value))
    
    inline def setGetRomanAndFigureString(value: Double => String): Self = StObject.set(x, "getRomanAndFigureString", js.Any.fromFunction1(value))
    
    inline def setNextMode(value: () => Double): Self = StObject.set(x, "NextMode", js.Any.fromFunction0(value))
    
    inline def setNumErrorCorrectionCode(value: Double): Self = StObject.set(x, "numErrorCorrectionCode", value.asInstanceOf[js.Any])
    
    inline def setParseECIValue(value: () => Double): Self = StObject.set(x, "parseECIValue", js.Any.fromFunction0(value))
  }
}
