package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSelectMousewheel extends js.Object {
  var reverse: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[String] = js.undefined
}

object StockChartNavigatorSelectMousewheel {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined, zoom: String = null): StockChartNavigatorSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorSelectMousewheel]
  }
}

