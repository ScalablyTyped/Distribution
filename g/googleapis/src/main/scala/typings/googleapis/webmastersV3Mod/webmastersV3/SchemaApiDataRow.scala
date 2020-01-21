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
    clicks: Int | Double = null,
    ctr: Int | Double = null,
    impressions: Int | Double = null,
    keys: js.Array[String] = null,
    position: Int | Double = null
  ): SchemaApiDataRow = {
    val __obj = js.Dynamic.literal()
    if (clicks != null) __obj.updateDynamic("clicks")(clicks.asInstanceOf[js.Any])
    if (ctr != null) __obj.updateDynamic("ctr")(ctr.asInstanceOf[js.Any])
    if (impressions != null) __obj.updateDynamic("impressions")(impressions.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApiDataRow]
  }
}

