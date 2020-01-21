package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBbBottomLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotBbBottomLineStylesOptions] = js.undefined
}

object PlotBbBottomLineOptions {
  @scala.inline
  def apply(styles: PlotBbBottomLineStylesOptions = null): PlotBbBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotBbBottomLineOptions]
  }
}

