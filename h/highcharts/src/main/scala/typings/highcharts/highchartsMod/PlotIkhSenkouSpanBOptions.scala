package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhSenkouSpanBOptions extends js.Object {
  var styles: js.UndefOr[PlotIkhSenkouSpanBStylesOptions] = js.undefined
}

object PlotIkhSenkouSpanBOptions {
  @scala.inline
  def apply(styles: PlotIkhSenkouSpanBStylesOptions = null): PlotIkhSenkouSpanBOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhSenkouSpanBOptions]
  }
}

