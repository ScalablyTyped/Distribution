package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInventoryPickup extends js.Object {
  /**
    * Whether store pickup is available for this offer and whether the pickup
    * option should be shown as buy, reserve, or not supported. Only supported
    * for local inventory. Unless the value is &quot;not supported&quot;, must
    * be submitted together with pickupSla.
    */
  var pickupMethod: js.UndefOr[String] = js.native
  /**
    * The expected date that an order will be ready for pickup, relative to
    * when the order is placed. Only supported for local inventory. Must be
    * submitted together with pickupMethod.
    */
  var pickupSla: js.UndefOr[String] = js.native
}

object SchemaInventoryPickup {
  @scala.inline
  def apply(pickupMethod: String = null, pickupSla: String = null): SchemaInventoryPickup = {
    val __obj = js.Dynamic.literal()
    if (pickupMethod != null) __obj.updateDynamic("pickupMethod")(pickupMethod.asInstanceOf[js.Any])
    if (pickupSla != null) __obj.updateDynamic("pickupSla")(pickupSla.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventoryPickup]
  }
}

