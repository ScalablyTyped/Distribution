package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.invityApi.mod.SavingsKYCInfoSuccessResponse
  - typings.invityApi.mod.SavingsErrorResponse
*/
trait SavingsKYCInfoResponse extends StObject
object SavingsKYCInfoResponse {
  
  inline def SavingsErrorResponse(): typings.invityApi.mod.SavingsErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.invityApi.mod.SavingsErrorResponse]
  }
  
  inline def SavingsKYCInfoSuccessResponse(documentTypes: js.Array[SavingsTradeUserKYCStartDocumentType]): typings.invityApi.mod.SavingsKYCInfoSuccessResponse = {
    val __obj = js.Dynamic.literal(documentTypes = documentTypes.asInstanceOf[js.Any], status = "Success")
    __obj.asInstanceOf[typings.invityApi.mod.SavingsKYCInfoSuccessResponse]
  }
}
