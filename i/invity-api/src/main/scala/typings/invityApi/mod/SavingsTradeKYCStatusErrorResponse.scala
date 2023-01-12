package typings.invityApi.mod

import typings.invityApi.invityApiStrings.ExchangeNotFound
import typings.invityApi.invityApiStrings.GetIdentityInfoFailed
import typings.invityApi.invityApiStrings.GetUserInfoFailed
import typings.invityApi.invityApiStrings.SavingsTransactionNotFound
import typings.invityApi.invityApiStrings.UserNotFoundInPartnerSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeKYCStatusErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_SavingsTradeKYCStatusErrorResponse: js.UndefOr[
    GetIdentityInfoFailed | SavingsTransactionNotFound | ExchangeNotFound | GetUserInfoFailed | UserNotFoundInPartnerSystem
  ] = js.undefined
}
object SavingsTradeKYCStatusErrorResponse {
  
  inline def apply(): SavingsTradeKYCStatusErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeKYCStatusErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeKYCStatusErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: GetIdentityInfoFailed | SavingsTransactionNotFound | ExchangeNotFound | GetUserInfoFailed | UserNotFoundInPartnerSystem
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
