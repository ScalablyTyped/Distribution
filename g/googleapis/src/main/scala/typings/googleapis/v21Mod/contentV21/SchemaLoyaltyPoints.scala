package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLoyaltyPoints extends js.Object {
  /**
    * Name of loyalty points program. It is recommended to limit the name to 12
    * full-width characters or 24 Roman characters.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The retailer&#39;s loyalty points in absolute value.
    */
  var pointsValue: js.UndefOr[String] = js.native
  /**
    * The ratio of a point when converted to currency. Google assumes currency
    * based on Merchant Center settings. If ratio is left out, it defaults
    * to 1.0.
    */
  var ratio: js.UndefOr[Double] = js.native
}

object SchemaLoyaltyPoints {
  @scala.inline
  def apply(name: String = null, pointsValue: String = null, ratio: Int | Double = null): SchemaLoyaltyPoints = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointsValue != null) __obj.updateDynamic("pointsValue")(pointsValue.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLoyaltyPoints]
  }
}

