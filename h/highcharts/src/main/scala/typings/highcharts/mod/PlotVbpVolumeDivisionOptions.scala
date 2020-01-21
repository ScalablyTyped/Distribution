package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVbpVolumeDivisionOptions extends js.Object {
  /**
    * (Highstock) Option to control if volume is divided.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[PlotVbpVolumeDivisionStylesOptions] = js.undefined
}

object PlotVbpVolumeDivisionOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: PlotVbpVolumeDivisionStylesOptions = null): PlotVbpVolumeDivisionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVbpVolumeDivisionOptions]
  }
}

