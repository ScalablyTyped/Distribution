package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsTopLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsTopLineStylesOptions] = js.undefined
}

object PlotKeltnerchannelsTopLineOptions {
  @scala.inline
  def apply(styles: PlotKeltnerchannelsTopLineStylesOptions = null): PlotKeltnerchannelsTopLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotKeltnerchannelsTopLineOptions]
  }
}

