package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsErrorResponse
  extends StObject
     with SavingsAMLAnswersResponse
     with SavingsKYCInfoResponse {
  
  var code: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
}
object SavingsErrorResponse {
  
  inline def apply(): SavingsErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsErrorResponse]
  }
  
  extension [Self <: SavingsErrorResponse](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
