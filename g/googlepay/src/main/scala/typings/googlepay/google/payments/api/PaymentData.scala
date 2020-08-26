package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment data.
  *
  * Contains the payment data requested in
  * [[PaymentDataRequest|`PaymentDataRequest`]]
  */
@js.native
trait PaymentData extends js.Object {
  /**
    * Major API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersion|`PaymentDataRequest.apiVersion`]].
    */
  var apiVersion: Double = js.native
  /**
    * Minor API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersionMinor|`PaymentDataRequest.apiVersionMinor`]].
    */
  var apiVersionMinor: Double = js.native
  /**
    * The buyer's email.
    *
    * This value will only be set if
    * [[PaymentDataRequest.emailRequired|`PaymentDataRequest.emailRequired`]]
    * was set to `true`.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Data about the selected payment method.
    */
  var paymentMethodData: PaymentMethodData = js.native
  /**
    * The shipping address.
    *
    * This object will only be returned if
    * [[PaymentDataRequest.shippingAddressRequired|`PaymentDataRequest.shippingAddressRequired`]]
    * was set to `true`.
    */
  var shippingAddress: js.UndefOr[Address] = js.native
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.native
}

object PaymentData {
  @scala.inline
  def apply(apiVersion: Double, apiVersionMinor: Double, paymentMethodData: PaymentMethodData): PaymentData = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentData]
  }
  @scala.inline
  implicit class PaymentDataOps[Self <: PaymentData] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Double): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersionMinor(value: Double): Self = this.set("apiVersionMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentMethodData(value: PaymentMethodData): Self = this.set("paymentMethodData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setShippingAddress(value: Address): Self = this.set("shippingAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingAddress: Self = this.set("shippingAddress", js.undefined)
    @scala.inline
    def setShippingOptionData(value: SelectionOptionData): Self = this.set("shippingOptionData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOptionData: Self = this.set("shippingOptionData", js.undefined)
  }
  
}

