package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeliveryControl extends js.Object {
  var creativeBlockingLevel: js.UndefOr[String] = js.native
  var deliveryRateType: js.UndefOr[String] = js.native
  var frequencyCaps: js.UndefOr[js.Array[SchemaDeliveryControlFrequencyCap]] = js.native
}

object SchemaDeliveryControl {
  @scala.inline
  def apply(
    creativeBlockingLevel: String = null,
    deliveryRateType: String = null,
    frequencyCaps: js.Array[SchemaDeliveryControlFrequencyCap] = null
  ): SchemaDeliveryControl = {
    val __obj = js.Dynamic.literal()
    if (creativeBlockingLevel != null) __obj.updateDynamic("creativeBlockingLevel")(creativeBlockingLevel.asInstanceOf[js.Any])
    if (deliveryRateType != null) __obj.updateDynamic("deliveryRateType")(deliveryRateType.asInstanceOf[js.Any])
    if (frequencyCaps != null) __obj.updateDynamic("frequencyCaps")(frequencyCaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeliveryControl]
  }
}

