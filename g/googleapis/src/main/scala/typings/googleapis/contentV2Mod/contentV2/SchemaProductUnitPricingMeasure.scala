package typings.googleapis.contentV2Mod.contentV2

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
  def apply(unit: String = null, value: Int | Double = null): SchemaProductUnitPricingMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductUnitPricingMeasure]
  }
}

