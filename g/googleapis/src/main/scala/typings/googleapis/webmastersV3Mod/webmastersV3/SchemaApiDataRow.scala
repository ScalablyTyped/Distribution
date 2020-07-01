package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApiDataRow extends js.Object {
  var clicks: js.UndefOr[Double] = js.native
  var ctr: js.UndefOr[Double] = js.native
  var impressions: js.UndefOr[Double] = js.native
  var keys: js.UndefOr[js.Array[String]] = js.native
  var position: js.UndefOr[Double] = js.native
}

object SchemaApiDataRow {
  @scala.inline
  def apply(
    clicks: js.UndefOr[Double] = js.undefined,
    ctr: js.UndefOr[Double] = js.undefined,
    impressions: js.UndefOr[Double] = js.undefined,
    keys: js.Array[String] = null,
    position: js.UndefOr[Double] = js.undefined
  ): SchemaApiDataRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clicks)) __obj.updateDynamic("clicks")(clicks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ctr)) __obj.updateDynamic("ctr")(ctr.get.asInstanceOf[js.Any])
    if (!js.isUndefined(impressions)) __obj.updateDynamic("impressions")(impressions.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApiDataRow]
  }
}

