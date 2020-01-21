package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotIkhSenkouSpanAOptions extends js.Object {
  var styles: js.UndefOr[PlotIkhSenkouSpanAStylesOptions] = js.undefined
}

object PlotIkhSenkouSpanAOptions {
  @scala.inline
  def apply(styles: PlotIkhSenkouSpanAStylesOptions = null): PlotIkhSenkouSpanAOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotIkhSenkouSpanAOptions]
  }
}

