package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data for a payment method.
  */
trait PaymentMethodData extends js.Object {
  /**
    * User-facing message to describe the payment method funding this
    * transaction.
    *
    * You are required to show this message to the buyer as confirmation of
    * their funding source. Please refer to the
    * [documentation](https://developers.google.com/pay/api/|documentation)
    * for more information.
    *
    * **IMPORTANT:** Do not attempt to parse the contents of this string as
    * the format, contents, and length may change at any time. If you need
    * additional details, see
    * [[PaymentMethodData.info|`PaymentMethodData.info`]].
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Payment method information.
    *
    * The definition of this field depends
    * on which payment method type was set in
    * [[PaymentMethodData.type|`PaymentMethodData.type`]].
    *
    * - For [[PaymentMethodType|`CARD`]], this field
    *   will be an object conforming to [[CardInfo|`CardInfo`]].
    */
  var info: js.UndefOr[CardInfo] = js.undefined
  /**
    * Tokenization data for the payment method.
    */
  var tokenizationData: PaymentMethodTokenizationData
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType
}

object PaymentMethodData {
  @scala.inline
  def apply(
    tokenizationData: PaymentMethodTokenizationData,
    `type`: PaymentMethodType,
    description: String = null,
    info: CardInfo = null
  ): PaymentMethodData = {
    val __obj = js.Dynamic.literal(tokenizationData = tokenizationData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
}

