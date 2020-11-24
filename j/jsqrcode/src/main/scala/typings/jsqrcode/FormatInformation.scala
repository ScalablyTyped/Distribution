package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatInformation extends js.Object {
  
  val DataMask: Double = js.native
  
  def Equals(other: FormatInformation): Boolean = js.native
  
  val ErrorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
  
  def GetHashCode(): Double = js.native
  
  var dataMask: Double = js.native
  
  var errorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel = js.native
}
object FormatInformation {
  
  @scala.inline
  def apply(
    DataMask: Double,
    Equals: FormatInformation => Boolean,
    ErrorCorrectionLevel: ErrorCorrectionLevel,
    GetHashCode: () => Double,
    dataMask: Double,
    errorCorrectionLevel: ErrorCorrectionLevel
  ): FormatInformation = {
    val __obj = js.Dynamic.literal(DataMask = DataMask.asInstanceOf[js.Any], Equals = js.Any.fromFunction1(Equals), ErrorCorrectionLevel = ErrorCorrectionLevel.asInstanceOf[js.Any], GetHashCode = js.Any.fromFunction0(GetHashCode), dataMask = dataMask.asInstanceOf[js.Any], errorCorrectionLevel = errorCorrectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatInformation]
  }
  
  @scala.inline
  implicit class FormatInformationOps[Self <: FormatInformation] (val x: Self) extends AnyVal {
    
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
    def setDataMask(value: Double): Self = this.set("DataMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: FormatInformation => Boolean): Self = this.set("Equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorCorrectionLevel(value: ErrorCorrectionLevel): Self = this.set("ErrorCorrectionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHashCode(value: () => Double): Self = this.set("GetHashCode", js.Any.fromFunction0(value))
  }
}
