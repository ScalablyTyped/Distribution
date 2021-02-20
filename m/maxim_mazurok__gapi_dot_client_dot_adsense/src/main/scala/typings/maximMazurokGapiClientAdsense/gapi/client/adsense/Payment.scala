package typings.maximMazurokGapiClientAdsense.gapi.client.adsense

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payment extends StObject {
  
  /** Unique identifier of this Payment. */
  var id: js.UndefOr[String] = js.native
  
  /** Kind of resource this is, in this case adsense#payment. */
  var kind: js.UndefOr[String] = js.native
  
  /** The amount to be paid. */
  var paymentAmount: js.UndefOr[String] = js.native
  
  /** The currency code for the amount to be paid. */
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.native
  
  /** The date this payment was/will be credited to the user, or none if the payment threshold has not been met. */
  var paymentDate: js.UndefOr[String] = js.native
}
object Payment {
  
  @scala.inline
  def apply(): Payment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payment]
  }
  
  @scala.inline
  implicit class PaymentMutableBuilder[Self <: Payment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPaymentAmount(value: String): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentAmountCurrencyCode(value: String): Self = StObject.set(x, "paymentAmountCurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentAmountCurrencyCodeUndefined: Self = StObject.set(x, "paymentAmountCurrencyCode", js.undefined)
    
    @scala.inline
    def setPaymentAmountUndefined: Self = StObject.set(x, "paymentAmount", js.undefined)
    
    @scala.inline
    def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
  }
}
