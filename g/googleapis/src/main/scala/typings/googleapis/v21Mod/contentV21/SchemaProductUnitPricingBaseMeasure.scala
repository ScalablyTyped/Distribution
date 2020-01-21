package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductUnitPricingBaseMeasure extends js.Object {
  /**
    * The unit of the denominator.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The denominator of the unit price.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaProductUnitPricingBaseMeasure {
  @scala.inline
  def apply(unit: String = null, value: String = null): SchemaProductUnitPricingBaseMeasure = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductUnitPricingBaseMeasure]
  }
}

