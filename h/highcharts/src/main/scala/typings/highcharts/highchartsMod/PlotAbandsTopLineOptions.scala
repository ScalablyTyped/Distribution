package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAbandsTopLineOptions extends js.Object {
  var styles: js.UndefOr[PlotAbandsTopLineStylesOptions] = js.undefined
}

object PlotAbandsTopLineOptions {
  @scala.inline
  def apply(styles: PlotAbandsTopLineStylesOptions = null): PlotAbandsTopLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAbandsTopLineOptions]
  }
}

