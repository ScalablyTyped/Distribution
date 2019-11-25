package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPcTopLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPcTopLineStylesOptions] = js.undefined
}

object PlotPcTopLineOptions {
  @scala.inline
  def apply(styles: PlotPcTopLineStylesOptions = null): PlotPcTopLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPcTopLineOptions]
  }
}

