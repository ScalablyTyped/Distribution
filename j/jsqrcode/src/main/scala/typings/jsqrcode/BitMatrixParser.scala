package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitMatrixParser extends StObject {
  
  var bitMatrix: BitMatrix
  
  def copyBit(i: Double, j: Double, versionBits: Double): Double
  
  var parsedFormatInfo: FormatInformation
  
  var parsedVersion: Version
  
  def readCodewords(): js.Array[Double]
  
  def readFormatInformation(): FormatInformation
  
  def readVersion(): Version
}
object BitMatrixParser {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitMatrixParser] (val x: Self) extends AnyVal {
    
    inline def setBitMatrix(value: BitMatrix): Self = StObject.set(x, "bitMatrix", value.asInstanceOf[js.Any])
    
    inline def setCopyBit(value: (Double, Double, Double) => Double): Self = StObject.set(x, "copyBit", js.Any.fromFunction3(value))
    
    inline def setParsedFormatInfo(value: FormatInformation): Self = StObject.set(x, "parsedFormatInfo", value.asInstanceOf[js.Any])
    
    inline def setParsedVersion(value: Version): Self = StObject.set(x, "parsedVersion", value.asInstanceOf[js.Any])
    
    inline def setReadCodewords(value: () => js.Array[Double]): Self = StObject.set(x, "readCodewords", js.Any.fromFunction0(value))
    
    inline def setReadFormatInformation(value: () => FormatInformation): Self = StObject.set(x, "readFormatInformation", js.Any.fromFunction0(value))
    
    inline def setReadVersion(value: () => Version): Self = StObject.set(x, "readVersion", js.Any.fromFunction0(value))
  }
}
