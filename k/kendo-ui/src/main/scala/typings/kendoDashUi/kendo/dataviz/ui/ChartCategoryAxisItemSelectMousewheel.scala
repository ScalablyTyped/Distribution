package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemSelectMousewheel extends js.Object {
  var reverse: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[String] = js.undefined
}

object ChartCategoryAxisItemSelectMousewheel {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined, zoom: String = null): ChartCategoryAxisItemSelectMousewheel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItemSelectMousewheel]
  }
}

