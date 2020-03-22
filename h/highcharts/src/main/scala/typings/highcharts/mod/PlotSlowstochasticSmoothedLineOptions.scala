package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSlowstochasticSmoothedLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a smoothed line.
    */
  var styles: js.UndefOr[PlotSlowstochasticSmoothedLineStylesOptions] = js.undefined
}

object PlotSlowstochasticSmoothedLineOptions {
  @scala.inline
  def apply(styles: PlotSlowstochasticSmoothedLineStylesOptions = null): PlotSlowstochasticSmoothedLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSlowstochasticSmoothedLineOptions]
  }
}

