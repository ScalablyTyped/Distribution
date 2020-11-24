package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitMatrixParser extends js.Object {
  
  var bitMatrix: BitMatrix = js.native
  
  def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
  
  var parsedFormatInfo: FormatInformation = js.native
  
  var parsedVersion: Version = js.native
  
  def readCodewords(): js.Array[Double] = js.native
  
  def readFormatInformation(): FormatInformation = js.native
  
  def readVersion(): Version = js.native
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
  
  @scala.inline
  implicit class BitMatrixParserOps[Self <: BitMatrixParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBitMatrix(value: BitMatrix): Self = this.set("bitMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyBit(value: (Double, Double, Double) => Double): Self = this.set("copyBit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParsedFormatInfo(value: FormatInformation): Self = this.set("parsedFormatInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedVersion(value: Version): Self = this.set("parsedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadCodewords(value: () => js.Array[Double]): Self = this.set("readCodewords", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadFormatInformation(value: () => FormatInformation): Self = this.set("readFormatInformation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadVersion(value: () => Version): Self = this.set("readVersion", js.Any.fromFunction0(value))
  }
}
