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
@js.native
trait PaymentOptions extends js.Object {
  /**
    * This value specifies which Google Pay environment to target
    *
    * @default "TEST"
    */
  var environment: js.UndefOr[Environment] = js.native
  /**
    * This object provides information about the merchant that requests
    * payment data.
    */
  var merchantInfo: js.UndefOr[MerchantInfo] = js.native
  /**
    * This object declares the callbacks used for Dynamic Price Updates.
    */
  var paymentDataCallbacks: js.UndefOr[PaymentDataCallbacks] = js.native
}

object PaymentOptions {
  @scala.inline
  def apply(): PaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentOptions]
  }
  @scala.inline
  implicit class PaymentOptionsOps[Self <: PaymentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironment(value: Environment): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setMerchantInfo(value: MerchantInfo): Self = this.set("merchantInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantInfo: Self = this.set("merchantInfo", js.undefined)
    @scala.inline
    def setPaymentDataCallbacks(value: PaymentDataCallbacks): Self = this.set("paymentDataCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentDataCallbacks: Self = this.set("paymentDataCallbacks", js.undefined)
  }
  
}

