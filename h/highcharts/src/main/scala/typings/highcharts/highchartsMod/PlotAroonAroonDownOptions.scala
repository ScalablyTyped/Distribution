package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotAroonAroonDownOptions extends js.Object {
  /**
    * (Highstock) Styles for an aroonDown line.
    */
  var styles: js.UndefOr[PlotAroonAroonDownStylesOptions] = js.undefined
}

object PlotAroonAroonDownOptions {
  @scala.inline
  def apply(styles: PlotAroonAroonDownStylesOptions = null): PlotAroonAroonDownOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotAroonAroonDownOptions]
  }
}

