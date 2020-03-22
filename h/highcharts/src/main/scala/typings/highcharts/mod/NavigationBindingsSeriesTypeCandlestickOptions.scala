package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsSeriesTypeCandlestickOptions extends js.Object {
  var init: js.UndefOr[js.Object] = js.undefined
}

object NavigationBindingsSeriesTypeCandlestickOptions {
  @scala.inline
  def apply(init: js.Object = null): NavigationBindingsSeriesTypeCandlestickOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsSeriesTypeCandlestickOptions]
  }
}

