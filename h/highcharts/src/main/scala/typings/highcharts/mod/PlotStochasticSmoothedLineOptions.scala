package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStochasticSmoothedLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotStochasticSmoothedLineStylesOptions] = js.undefined
}

object PlotStochasticSmoothedLineOptions {
  @scala.inline
  def apply(styles: PlotStochasticSmoothedLineStylesOptions = null): PlotStochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotStochasticSmoothedLineOptions]
  }
}

