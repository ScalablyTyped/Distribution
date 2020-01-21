package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderDeliveryDetails extends js.Object {
  /**
    * The delivery address
    */
  var address: js.UndefOr[SchemaOrderAddress] = js.native
  /**
    * The phone number of the person receiving the delivery.
    */
  var phoneNumber: js.UndefOr[String] = js.native
}

object SchemaOrderDeliveryDetails {
  @scala.inline
  def apply(address: SchemaOrderAddress = null, phoneNumber: String = null): SchemaOrderDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderDeliveryDetails]
  }
}

