package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectTokenizationSpecification
  extends BasePaymentMethodTokenizationSpecification
     with PaymentMethodTokenizationSpecification {
  var parameters: googlepayLib.Anon_ProtocolVersion
  @JSName("type")
  var type_DirectTokenizationSpecification: googlepayLib.googlepayLibStrings.DIRECT
}

object DirectTokenizationSpecification {
  @scala.inline
  def apply(parameters: googlepayLib.Anon_ProtocolVersion, `type`: googlepayLib.googlepayLibStrings.DIRECT): DirectTokenizationSpecification = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[DirectTokenizationSpecification]
  }
}

