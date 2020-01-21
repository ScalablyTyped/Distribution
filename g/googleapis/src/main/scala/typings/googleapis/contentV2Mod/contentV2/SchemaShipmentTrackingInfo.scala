package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaShipmentTrackingInfo extends js.Object {
  var carrier: js.UndefOr[String] = js.native
  var trackingNumber: js.UndefOr[String] = js.native
}

object SchemaShipmentTrackingInfo {
  @scala.inline
  def apply(carrier: String = null, trackingNumber: String = null): SchemaShipmentTrackingInfo = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier.asInstanceOf[js.Any])
    if (trackingNumber != null) __obj.updateDynamic("trackingNumber")(trackingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaShipmentTrackingInfo]
  }
}

