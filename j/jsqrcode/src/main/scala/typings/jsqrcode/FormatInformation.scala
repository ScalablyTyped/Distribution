package typings.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatInformation extends StObject {
  
  val DataMask: Double
  
  def Equals(other: FormatInformation): Boolean
  
  val ErrorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel
  
  def GetHashCode(): Double
  
  /* private */ var dataMask: Double
  
  /* private */ var errorCorrectionLevel: typings.jsqrcode.ErrorCorrectionLevel
}
object FormatInformation {
  
  inline def apply(
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
  
  extension [Self <: FormatInformation](x: Self) {
    
    inline def setDataMask(value: Double): Self = StObject.set(x, "DataMask", value.asInstanceOf[js.Any])
    
    inline def setEquals(value: FormatInformation => Boolean): Self = StObject.set(x, "Equals", js.Any.fromFunction1(value))
    
    inline def setErrorCorrectionLevel(value: ErrorCorrectionLevel): Self = StObject.set(x, "ErrorCorrectionLevel", value.asInstanceOf[js.Any])
    
    inline def setGetHashCode(value: () => Double): Self = StObject.set(x, "GetHashCode", js.Any.fromFunction0(value))
  }
}
