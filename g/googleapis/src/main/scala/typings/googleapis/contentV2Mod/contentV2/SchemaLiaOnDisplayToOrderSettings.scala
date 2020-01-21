package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiaOnDisplayToOrderSettings extends js.Object {
  /**
    * Shipping cost and policy URL.
    */
  var shippingCostPolicyUrl: js.UndefOr[String] = js.native
  /**
    * The status of the ?On display to order? feature.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaLiaOnDisplayToOrderSettings {
  @scala.inline
  def apply(shippingCostPolicyUrl: String = null, status: String = null): SchemaLiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    if (shippingCostPolicyUrl != null) __obj.updateDynamic("shippingCostPolicyUrl")(shippingCostPolicyUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiaOnDisplayToOrderSettings]
  }
}

