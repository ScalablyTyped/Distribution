package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines callback methods for handling payment data changed and payment
  * authorized events.
  *
  * If you set up Dynamic Price Updates in your integration, be sure to add
  * the following [[PaymentDataChangedHandler|`onPaymentDataChanged`]] and
  * [[PaymentAuthorizedHandler|`onPaymentAuthorized`]] callbacks.
  *
  * Example:
  *
  * The following example configuration uses the callbacks needed to set up
  * Dynamic Price Updates:
  *
  * ```js
  * {
  *   onPaymentDataChanged: onPaymentDataChanged,
  *   onPaymentAuthorized: onPaymentAuthorized
  * }
  * ```
  */
trait PaymentDataCallbacks extends StObject {
  
  /**
    * This method is called when a payment is authorized in the payment
    * sheet.
    */
  var onPaymentAuthorized: js.UndefOr[PaymentAuthorizedHandler] = js.undefined
  
  /**
    * This method handles payment data changes in the payment sheet such as
    * shipping address and shipping options.
    */
  var onPaymentDataChanged: js.UndefOr[PaymentDataChangedHandler] = js.undefined
}
object PaymentDataCallbacks {
  
  inline def apply(): PaymentDataCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDataCallbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentDataCallbacks] (val x: Self) extends AnyVal {
    
    inline def setOnPaymentAuthorized(
      value: /* paymentData */ PaymentData => js.Promise[PaymentAuthorizationResult] | PaymentAuthorizationResult
    ): Self = StObject.set(x, "onPaymentAuthorized", js.Any.fromFunction1(value))
    
    inline def setOnPaymentAuthorizedUndefined: Self = StObject.set(x, "onPaymentAuthorized", js.undefined)
    
    inline def setOnPaymentDataChanged(
      value: /* intermediatePaymentData */ IntermediatePaymentData => js.Promise[PaymentDataRequestUpdate] | PaymentDataRequestUpdate
    ): Self = StObject.set(x, "onPaymentDataChanged", js.Any.fromFunction1(value))
    
    inline def setOnPaymentDataChangedUndefined: Self = StObject.set(x, "onPaymentDataChanged", js.undefined)
  }
}
