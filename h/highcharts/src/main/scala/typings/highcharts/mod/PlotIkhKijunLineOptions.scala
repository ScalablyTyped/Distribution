package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhKijunLineOptions extends js.Object {
  var styles: js.UndefOr[PlotIkhKijunLineStylesOptions] = js.undefined
}

object PlotIkhKijunLineOptions {
  @scala.inline
  def apply(styles: PlotIkhKijunLineStylesOptions = null): PlotIkhKijunLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhKijunLineOptions]
  }
}

