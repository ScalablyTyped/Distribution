package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum string for the callback intents.
  *
  * Options:
  *
  * - `OFFER`:
  *   Callback occurs when offer info is changed.
  *
  * - `SHIPPING_ADDRESS`:
  *   Callback occurs when shipping address is changed.
  *
  * - `SHIPPING_OPTION`:
  *   Callback occurs when shipping option is changed.
  *
  *   If this callback intent is set, then
  *   [[PaymentDataRequest.shippingOptionRequired|`PaymentDataRequest.shippingOptionRequired`]]
  *   must be set to true.
  *
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   can optionally be set, if omitted, we will render a placeholder
  *   shipping option named "Shipping option pending" with id
  *   "shipping_option_unselected".
  *
  *   If developers receive a
  *   [[IntermediatePaymentData.shippingOptionData|`IntermediatePaymentData.shippingOptionData`]]
  *   with id "shipping_option_unselected", it means they need to populate
  *   valid
  *   [[PaymentDataRequest.shippingOptionParameters|`PaymentDataRequest.shippingOptionParameters`]]
  *   in the
  *   [[PaymentDataRequestUpdate.newShippingOptionParameters|`PaymentDataRequestUpdate.newShippingOptionParameters`]].
  *
  * - `PAYMENT_AUTHORIZATION`:
  *   Callback occurs when user authorized payment and
  *   [[PaymentData|`PaymentData`]] will be returned.
  *
  * - `PAYMENT_METHOD`:
  *   Callback occurs when payment method is changed.
  *
  *   Developer will receive callback data in
  *   [[IntermediatePaymentData.paymentMethodData|`IntermediatePaymentData.paymentMethodData`]]
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.OFFER
  - typings.googlepay.googlepayStrings.SHIPPING_ADDRESS
  - typings.googlepay.googlepayStrings.SHIPPING_OPTION
  - typings.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION
  - typings.googlepay.googlepayStrings.PAYMENT_METHOD
*/
trait CallbackIntent extends StObject
object CallbackIntent {
  
  inline def OFFER: typings.googlepay.googlepayStrings.OFFER = "OFFER".asInstanceOf[typings.googlepay.googlepayStrings.OFFER]
  
  inline def PAYMENT_AUTHORIZATION: typings.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION = "PAYMENT_AUTHORIZATION".asInstanceOf[typings.googlepay.googlepayStrings.PAYMENT_AUTHORIZATION]
  
  inline def PAYMENT_METHOD: typings.googlepay.googlepayStrings.PAYMENT_METHOD = "PAYMENT_METHOD".asInstanceOf[typings.googlepay.googlepayStrings.PAYMENT_METHOD]
  
  inline def SHIPPING_ADDRESS: typings.googlepay.googlepayStrings.SHIPPING_ADDRESS = "SHIPPING_ADDRESS".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_ADDRESS]
  
  inline def SHIPPING_OPTION: typings.googlepay.googlepayStrings.SHIPPING_OPTION = "SHIPPING_OPTION".asInstanceOf[typings.googlepay.googlepayStrings.SHIPPING_OPTION]
}
