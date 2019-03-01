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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("tokenizationData")(tokenizationData)
    __obj.asInstanceOf[BasePaymentMethodData]
  }
}

