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
trait PaymentData extends js.Object {
  /**
    * Major API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersion|`PaymentDataRequest.apiVersion`]].
    */
  var apiVersion: Double
  /**
    * Minor API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersionMinor|`PaymentDataRequest.apiVersionMinor`]].
    */
  var apiVersionMinor: Double
  /**
    * The buyer's email.
    *
    * This value will only be set if
    * [[PaymentDataRequest.emailRequired|`PaymentDataRequest.emailRequired`]]
    * was set to `true`.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Data about the selected payment method.
    */
  var paymentMethodData: PaymentMethodData
  /**
    * The shipping address.
    *
    * This object will only be returned if
    * [[PaymentDataRequest.shippingAddressRequired|`PaymentDataRequest.shippingAddressRequired`]]
    * was set to `true`.
    */
  var shippingAddress: js.UndefOr[Address] = js.undefined
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.undefined
}

object PaymentData {
  @scala.inline
  def apply(
    apiVersion: Double,
    apiVersionMinor: Double,
    paymentMethodData: PaymentMethodData,
    email: String = null,
    shippingAddress: Address = null,
    shippingOptionData: SelectionOptionData = null
  ): PaymentData = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (shippingAddress != null) __obj.updateDynamic("shippingAddress")(shippingAddress.asInstanceOf[js.Any])
    if (shippingOptionData != null) __obj.updateDynamic("shippingOptionData")(shippingOptionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentData]
  }
}

