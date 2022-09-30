package typings.invityApi.mod

import typings.invityApi.invityApiStrings.Success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsKYCInfoSuccessResponse
  extends StObject
     with SavingsKYCInfoResponse {
  
  var documentTypes: js.Array[SavingsTradeUserKYCStartDocumentType]
  
  var status: Success_
}
object SavingsKYCInfoSuccessResponse {
  
  inline def apply(documentTypes: js.Array[SavingsTradeUserKYCStartDocumentType]): SavingsKYCInfoSuccessResponse = {
    val __obj = js.Dynamic.literal(documentTypes = documentTypes.asInstanceOf[js.Any], status = "Success")
    __obj.asInstanceOf[SavingsKYCInfoSuccessResponse]
  }
  
  extension [Self <: SavingsKYCInfoSuccessResponse](x: Self) {
    
    inline def setDocumentTypes(value: js.Array[SavingsTradeUserKYCStartDocumentType]): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypesVarargs(value: SavingsTradeUserKYCStartDocumentType*): Self = StObject.set(x, "documentTypes", js.Array(value*))
    
    inline def setStatus(value: Success_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
