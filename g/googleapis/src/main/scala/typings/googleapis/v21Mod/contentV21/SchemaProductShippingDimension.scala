package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductShippingDimension extends js.Object {
  /**
    * The unit of value.
    */
  var unit: js.UndefOr[String] = js.native
  /**
    * The dimension of the product used to calculate the shipping cost of the
    * item.
    */
  var value: js.UndefOr[Double] = js.native
}

object SchemaProductShippingDimension {
  @scala.inline
  def apply(unit: String = null, value: js.UndefOr[Double] = js.undefined): SchemaProductShippingDimension = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductShippingDimension]
  }
}

