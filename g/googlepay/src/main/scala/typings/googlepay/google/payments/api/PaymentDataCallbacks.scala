package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait PaymentDataCallbacks extends js.Object {
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
  @scala.inline
  def apply(
    onPaymentAuthorized: /* paymentData */ PaymentData => js.Promise[PaymentAuthorizationResult] | PaymentAuthorizationResult = null,
    onPaymentDataChanged: /* intermediatePaymentData */ IntermediatePaymentData => js.Promise[PaymentDataRequestUpdate] | PaymentDataRequestUpdate = null
  ): PaymentDataCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onPaymentAuthorized != null) __obj.updateDynamic("onPaymentAuthorized")(js.Any.fromFunction1(onPaymentAuthorized))
    if (onPaymentDataChanged != null) __obj.updateDynamic("onPaymentDataChanged")(js.Any.fromFunction1(onPaymentDataChanged))
    __obj.asInstanceOf[PaymentDataCallbacks]
  }
}

