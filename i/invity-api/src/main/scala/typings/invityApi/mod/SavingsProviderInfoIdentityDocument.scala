package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsProviderInfoIdentityDocument extends StObject {
  
  var documentImageSides: js.Array[SavingsTradeUserKYCStartDocumentImageSide]
  
  var documentType: SavingsTradeUserKYCStartDocumentType
  
  var isRequired: js.UndefOr[Boolean] = js.undefined
}
object SavingsProviderInfoIdentityDocument {
  
  inline def apply(
    documentImageSides: js.Array[SavingsTradeUserKYCStartDocumentImageSide],
    documentType: SavingsTradeUserKYCStartDocumentType
  ): SavingsProviderInfoIdentityDocument = {
    val __obj = js.Dynamic.literal(documentImageSides = documentImageSides.asInstanceOf[js.Any], documentType = documentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsProviderInfoIdentityDocument]
  }
  
  extension [Self <: SavingsProviderInfoIdentityDocument](x: Self) {
    
    inline def setDocumentImageSides(value: js.Array[SavingsTradeUserKYCStartDocumentImageSide]): Self = StObject.set(x, "documentImageSides", value.asInstanceOf[js.Any])
    
    inline def setDocumentImageSidesVarargs(value: SavingsTradeUserKYCStartDocumentImageSide*): Self = StObject.set(x, "documentImageSides", js.Array(value*))
    
    inline def setDocumentType(value: SavingsTradeUserKYCStartDocumentType): Self = StObject.set(x, "documentType", value.asInstanceOf[js.Any])
    
    inline def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
  }
}
