package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSupertrendChangeTrendLineOptions extends js.Object {
  var styles: js.UndefOr[PlotSupertrendChangeTrendLineStylesOptions] = js.undefined
}

object PlotSupertrendChangeTrendLineOptions {
  @scala.inline
  def apply(styles: PlotSupertrendChangeTrendLineStylesOptions = null): PlotSupertrendChangeTrendLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineOptions]
  }
}

