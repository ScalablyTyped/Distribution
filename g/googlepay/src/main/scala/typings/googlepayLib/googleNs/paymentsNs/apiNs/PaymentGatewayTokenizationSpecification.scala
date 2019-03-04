package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentGatewayTokenizationSpecification
  extends BasePaymentMethodTokenizationSpecification
     with PaymentMethodTokenizationSpecification {
  var parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  @JSName("type")
  var type_PaymentGatewayTokenizationSpecification: googlepayLib.googlepayLibStrings.PAYMENT_GATEWAY
}

object PaymentGatewayTokenizationSpecification {
  @scala.inline
  def apply(
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `type`: googlepayLib.googlepayLibStrings.PAYMENT_GATEWAY
  ): PaymentGatewayTokenizationSpecification = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaymentGatewayTokenizationSpecification]
  }
}

