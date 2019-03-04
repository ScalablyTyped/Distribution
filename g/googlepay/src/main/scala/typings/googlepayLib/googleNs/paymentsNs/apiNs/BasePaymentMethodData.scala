package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePaymentMethodData extends js.Object {
  var description: java.lang.String
  var tokenizationData: PaymentMethodTokenizationData
  var `type`: AllowedPaymentMethodType
}

object BasePaymentMethodData {
  @scala.inline
  def apply(
    description: java.lang.String,
    tokenizationData: PaymentMethodTokenizationData,
    `type`: AllowedPaymentMethodType
  ): BasePaymentMethodData = {
    val __obj = js.Dynamic.literal(description = description, tokenizationData = tokenizationData)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BasePaymentMethodData]
  }
}

