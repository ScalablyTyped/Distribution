package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeUserKYCStart extends StObject {
  
  var documentImages: js.Array[SavingsTradeUserKYCStartDocumentImage]
  
  var documentType: SavingsTradeUserKYCStartDocumentType
}
object SavingsTradeUserKYCStart {
  
  inline def apply(
    documentImages: js.Array[SavingsTradeUserKYCStartDocumentImage],
    documentType: SavingsTradeUserKYCStartDocumentType
  ): SavingsTradeUserKYCStart = {
    val __obj = js.Dynamic.literal(documentImages = documentImages.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeUserKYCStart]
  }
  
  extension [Self <: SavingsTradeUserKYCStart](x: Self) {
    
    inline def setDocumentImages(value: js.Array[SavingsTradeUserKYCStartDocumentImage]): Self = StObject.set(x, "documentImages", value.asInstanceOf[js.Any])
    
    inline def setDocumentImagesVarargs(value: SavingsTradeUserKYCStartDocumentImage*): Self = StObject.set(x, "documentImages", js.Array(value*))
    
    inline def setDocumentType(value: SavingsTradeUserKYCStartDocumentType): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
  }
}
