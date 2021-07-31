package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configure this object for a production environment once you've tested
  * your implementation and you're ready to receive payments from shoppers.
  *
  * If you set up Dynamic Price Updates in your integration, be sure to add
  * [[MerchantInfo|`MerchantInfo`]] and
  * [[PaymentDataCallbacks|`PaymentDataCallbacks`]] fields.
  *
  * Example:
  *
  * ```js
  * {
  *   environment: "TEST",
  *   merchantInfo: {
  *     merchantName: "Example Merchant",
  *     merchantId: "0123456789"
  *   },
  *   paymentDataCallbacks: {
  *     onPaymentDataChanged: onPaymentDataChanged,
  *     onPaymentAuthorized: onPaymentAuthorized
  *   }
  * }
  * ```
  */
trait PaymentOptions extends StObject {
  
  /**
    * This value specifies which Google Pay environment to target
    *
    * @default "TEST"
    */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /**
    * This object provides information about the merchant that requests
    * payment data.
    */
  var merchantInfo: js.UndefOr[MerchantInfo] = js.undefined
  
  /**
    * This object declares the callbacks used for Dynamic Price Updates.
    */
  var paymentDataCallbacks: js.UndefOr[PaymentDataCallbacks] = js.undefined
}
object PaymentOptions {
  
  @scala.inline
  def apply(): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOptions]
  }
  
  @scala.inline
  implicit class PaymentOptionsMutableBuilder[Self <: PaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setMerchantInfo(value: MerchantInfo): Self = StObject.set(x, "merchantInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantInfoUndefined: Self = StObject.set(x, "merchantInfo", js.undefined)
    
    @scala.inline
    def setPaymentDataCallbacks(value: PaymentDataCallbacks): Self = StObject.set(x, "paymentDataCallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentDataCallbacksUndefined: Self = StObject.set(x, "paymentDataCallbacks", js.undefined)
  }
}
