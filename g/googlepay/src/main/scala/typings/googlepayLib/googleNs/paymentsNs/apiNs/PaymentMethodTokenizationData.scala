package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodTokenizationData extends js.Object {
  var token: js.UndefOr[java.lang.String] = js.undefined
  var `type`: TokenizationType
}

object PaymentMethodTokenizationData {
  @scala.inline
  def apply(`type`: TokenizationType, token: java.lang.String = null): PaymentMethodTokenizationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[PaymentMethodTokenizationData]
  }
}

