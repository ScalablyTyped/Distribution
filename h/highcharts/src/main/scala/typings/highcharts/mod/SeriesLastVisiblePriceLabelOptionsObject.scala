package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLastVisiblePriceLabelOptionsObject extends js.Object {
  /**
    * (Highstock) Enable or disable the label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesLastVisiblePriceLabelOptionsObject {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesLastVisiblePriceLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLastVisiblePriceLabelOptionsObject]
  }
}

