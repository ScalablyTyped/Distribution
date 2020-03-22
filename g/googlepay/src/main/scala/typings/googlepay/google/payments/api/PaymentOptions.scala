package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait PaymentOptions extends js.Object {
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
  def apply(
    environment: Environment = null,
    merchantInfo: MerchantInfo = null,
    paymentDataCallbacks: PaymentDataCallbacks = null
  ): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (merchantInfo != null) __obj.updateDynamic("merchantInfo")(merchantInfo.asInstanceOf[js.Any])
    if (paymentDataCallbacks != null) __obj.updateDynamic("paymentDataCallbacks")(paymentDataCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentOptions]
  }
}

