package typings.invityApi.mod

import typings.invityApi.invityApiStrings.AppIDRequired
import typings.invityApi.invityApiStrings.ExchangeNotFound
import typings.invityApi.invityApiStrings.FlowStepDisabled
import typings.invityApi.invityApiStrings.GetUserInfoFailed
import typings.invityApi.invityApiStrings.SavingsTradeCountryRequired
import typings.invityApi.invityApiStrings.SavingsTransactionExists
import typings.invityApi.invityApiStrings.SavingsTransactionNotFound
import typings.invityApi.invityApiStrings.UnknownStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeErrorResponse
  extends StObject
     with SavingsErrorResponse {
  
  @JSName("code")
  var code_SavingsTradeErrorResponse: js.UndefOr[
    AppIDRequired | ExchangeNotFound | SavingsTradeCountryRequired | SavingsTransactionNotFound | SavingsTransactionExists | GetUserInfoFailed | FlowStepDisabled | UnknownStatus
  ] = js.undefined
}
object SavingsTradeErrorResponse {
  
  inline def apply(): SavingsTradeErrorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeErrorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeErrorResponse] (val x: Self) extends AnyVal {
    
    inline def setCode(
      value: AppIDRequired | ExchangeNotFound | SavingsTradeCountryRequired | SavingsTransactionNotFound | SavingsTransactionExists | GetUserInfoFailed | FlowStepDisabled | UnknownStatus
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
