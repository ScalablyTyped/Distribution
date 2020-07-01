package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTransitTableTransitTimeRowTransitTimeValue extends js.Object {
  /**
    * Must be greater than or equal to minTransitTimeInDays.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.native
  /**
    * Transit time range (min-max) in business days. 0 means same day delivery,
    * 1 means next day delivery.
    */
  var minTransitTimeInDays: js.UndefOr[Double] = js.native
}

object SchemaTransitTableTransitTimeRowTransitTimeValue {
  @scala.inline
  def apply(
    maxTransitTimeInDays: js.UndefOr[Double] = js.undefined,
    minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  ): SchemaTransitTableTransitTimeRowTransitTimeValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTransitTimeInDays)) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTransitTimeInDays)) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransitTableTransitTimeRowTransitTimeValue]
  }
}

