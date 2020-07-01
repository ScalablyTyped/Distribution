package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductUnitPricingMeasure extends js.Object {
  /**
    * The unit of the measure.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The measure of an item.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaProductUnitPricingMeasure {
  @scala.inline
  def apply(unit: String = null, value: js.UndefOr[Double] = js.undefined): SchemaProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductUnitPricingMeasure]
  }
}

