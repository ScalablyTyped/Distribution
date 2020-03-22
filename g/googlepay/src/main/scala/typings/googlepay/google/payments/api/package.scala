package typings.googlepay.google.payments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object api {
  /**
    * This handler is used when a payment is authorized in the payment sheet.
    */
  type PaymentAuthorizedHandler = /**
    * @param paymentData An object that contains the requested shopper
    *     data.
    * @returns
    * This method should always return a resolved promise of type
    * [[PaymentAuthorizationResult|`PaymentAuthorizationResult`]].
    *
    * When the payment has been successfully authorized, the promise
    * should resolve to
    * [[PaymentAuthorizationResult|`PaymentAuthorizationResult`]] with a
    * [[PaymentAuthorizationResult.transactionState|`transactionState`]]
    * of `SUCCESS`.
    *
    * If authorization fails, the promise should resolve to
    * [[PaymentAuthorizationResult|`PaymentAuthorizationResult`]] with a
    * [[PaymentAuthorizationResult.transactionState|`transactionState`]]
    * of `ERROR` with an [[PaymentAuthorizationResult.error|`error`]]
    * including the technical [[PaymentDataError.reason|`reason`]] and a
    * [[PaymentDataError.message|`message`]] to be displayed to the user.
    */
  js.Function1[
    /* paymentData */ typings.googlepay.google.payments.api.PaymentData, 
    js.Promise[typings.googlepay.google.payments.api.PaymentAuthorizationResult] | typings.googlepay.google.payments.api.PaymentAuthorizationResult
  ]
  /**
    * This handler is used when payment data changes in the payment sheet
    * such as shipping address and shipping options.
    */
  type PaymentDataChangedHandler = /**
    * @param intermediatePaymentData An object that contains the selected
    *     address and shipping option in the payment sheet.
    * @returns
    * Resolved: An object that contains information about new transaction
    * information, shipping options, and payment data errors.
    *
    * Rejected: An error object with an error intent and message to be
    * rendered in the payment sheet. For details, see
    * [[PaymentDataError|`PaymentDataError`]].
    *
    * *Note: Reject isn't used to update the payment sheet with new
    * shipping options and transaction info. Don't intentionally return
    * reject if possible.*
    */
  js.Function1[
    /* intermediatePaymentData */ typings.googlepay.google.payments.api.IntermediatePaymentData, 
    js.Promise[typings.googlepay.google.payments.api.PaymentDataRequestUpdate] | typings.googlepay.google.payments.api.PaymentDataRequestUpdate
  ]
  /**
    * Specific tokenization parameters used for
    * [[PaymentMethodTokenizationType|`PAYMENT_GATEWAY`]]
    *
    * This object will generally have the following format:
    *
    * ```
    * {
    *   "gateway": "nameOfTheGateway",
    *   "param1": "value1",
    *   "param2": "value2",
    *   ...
    * }
    * ```
    *
    * The specific keys that you must set will depend on the gateway you
    * have specified. Please consult your gateway or processor documentation
    * on which parameters must be specified in this object.
    *
    * All values must be strings.
    */
  type PaymentGatewayTokenizationParameters = /**
    * All keys must be strings.
    *
    * All values must be strings.
    */
  org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
