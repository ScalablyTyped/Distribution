package typings.invityApi.mod

import typings.invityApi.anon.FormAction
import typings.invityApi.invityApiStrings.ExchangeNotFound
import typings.invityApi.invityApiStrings.InternalError
import typings.invityApi.invityApiStrings.SavingsTransactionNotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitPhoneNumberResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_SubmitPhoneNumberResponse: js.UndefOr[ExchangeNotFound | InternalError | SavingsTransactionNotFound] = js.undefined
  
  var form: js.UndefOr[FormAction] = js.undefined
}
object SubmitPhoneNumberResponse {
  
  inline def apply(): SubmitPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitPhoneNumberResponse]
  }
  
  extension [Self <: SubmitPhoneNumberResponse](x: Self) {
    
    inline def setCode(value: ExchangeNotFound | InternalError | SavingsTransactionNotFound): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setForm(value: FormAction): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
