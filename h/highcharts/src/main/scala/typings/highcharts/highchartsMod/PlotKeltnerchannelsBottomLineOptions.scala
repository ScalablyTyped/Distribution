package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotKeltnerchannelsBottomLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotKeltnerchannelsBottomLineStylesOptions] = js.undefined
}

object PlotKeltnerchannelsBottomLineOptions {
  @scala.inline
  def apply(styles: PlotKeltnerchannelsBottomLineStylesOptions = null): PlotKeltnerchannelsBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotKeltnerchannelsBottomLineOptions]
  }
}

