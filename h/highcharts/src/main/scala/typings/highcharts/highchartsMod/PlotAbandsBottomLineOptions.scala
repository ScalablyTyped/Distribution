package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsBottomLineOptions extends js.Object {
  var styles: js.UndefOr[PlotAbandsBottomLineStylesOptions] = js.undefined
}

object PlotAbandsBottomLineOptions {
  @scala.inline
  def apply(styles: PlotAbandsBottomLineStylesOptions = null): PlotAbandsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsBottomLineOptions]
  }
}

