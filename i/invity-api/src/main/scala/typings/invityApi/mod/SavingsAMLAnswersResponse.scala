package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.invityApi.mod.SavingsAMLAnswersSuccessResponse
  - typings.invityApi.mod.SavingsErrorResponse
*/
trait SavingsAMLAnswersResponse extends StObject
object SavingsAMLAnswersResponse {
  
  inline def SavingsAMLAnswersSuccessResponse(): typings.invityApi.mod.SavingsAMLAnswersSuccessResponse = {
    val __obj = js.Dynamic.literal(status = "Success")
    __obj.asInstanceOf[typings.invityApi.mod.SavingsAMLAnswersSuccessResponse]
  }
  
  inline def SavingsErrorResponse(): typings.invityApi.mod.SavingsErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.invityApi.mod.SavingsErrorResponse]
  }
}
