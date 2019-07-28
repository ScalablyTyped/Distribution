package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhTenkanLineOptions extends js.Object {
  var styles: js.UndefOr[PlotIkhTenkanLineStylesOptions] = js.undefined
}

object PlotIkhTenkanLineOptions {
  @scala.inline
  def apply(styles: PlotIkhTenkanLineStylesOptions = null): PlotIkhTenkanLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PlotIkhTenkanLineOptions]
  }
}

