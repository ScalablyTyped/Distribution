package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradePlannedPayment extends StObject {
  
  var cryptoAmount: js.UndefOr[String] = js.undefined
  
  var fiatAmount: js.UndefOr[String] = js.undefined
  
  /** Partner's id. */
  var partnerPaymentId: js.UndefOr[String] = js.undefined
  
  /** Our id. */
  var paymentId: String
  
  var paymentInfo: SavingsPaymentInfo
  
  var plannedPaymentAt: String
}
object SavingsTradePlannedPayment {
  
  inline def apply(paymentId: String, paymentInfo: SavingsPaymentInfo, plannedPaymentAt: String): SavingsTradePlannedPayment = {
    val __obj = js.Dynamic.literal(paymentId = paymentId.asInstanceOf[js.Any], paymentInfo = paymentInfo.asInstanceOf[js.Any], plannedPaymentAt = plannedPaymentAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradePlannedPayment]
  }
  
  extension [Self <: SavingsTradePlannedPayment](x: Self) {
    
    inline def setCryptoAmount(value: String): Self = StObject.set(x, "cryptoAmount", value.asInstanceOf[js.Any])
    
    inline def setCryptoAmountUndefined: Self = StObject.set(x, "cryptoAmount", js.undefined)
    
    inline def setFiatAmount(value: String): Self = StObject.set(x, "fiatAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatAmountUndefined: Self = StObject.set(x, "fiatAmount", js.undefined)
    
    inline def setPartnerPaymentId(value: String): Self = StObject.set(x, "partnerPaymentId", value.asInstanceOf[js.Any])
    
    inline def setPartnerPaymentIdUndefined: Self = StObject.set(x, "partnerPaymentId", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentInfo(value: SavingsPaymentInfo): Self = StObject.set(x, "paymentInfo", value.asInstanceOf[js.Any])
    
    inline def setPlannedPaymentAt(value: String): Self = StObject.set(x, "plannedPaymentAt", value.asInstanceOf[js.Any])
  }
}
