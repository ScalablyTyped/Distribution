package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeKYCStatusSuccessfulResponse extends StObject {
  
  var kycStatus: js.UndefOr[SavingsKYCStatus] = js.undefined
}
object SavingsTradeKYCStatusSuccessfulResponse {
  
  inline def apply(): SavingsTradeKYCStatusSuccessfulResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeKYCStatusSuccessfulResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeKYCStatusSuccessfulResponse] (val x: Self) extends AnyVal {
    
    inline def setKycStatus(value: SavingsKYCStatus): Self = StObject.set(x, "kycStatus", value.asInstanceOf[js.Any])
    
    inline def setKycStatusUndefined: Self = StObject.set(x, "kycStatus", js.undefined)
  }
}
