package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsSaveChartOptions extends js.Object {
  var init: js.UndefOr[js.Object] = js.undefined
}

object NavigationBindingsSaveChartOptions {
  @scala.inline
  def apply(init: js.Object = null): NavigationBindingsSaveChartOptions = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsSaveChartOptions]
  }
}

