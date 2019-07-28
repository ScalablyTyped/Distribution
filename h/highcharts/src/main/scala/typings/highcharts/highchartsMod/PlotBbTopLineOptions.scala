package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotBbTopLineOptions extends js.Object {
  /**
    * (Highstock) Styles for a bottom line.
    */
  var styles: js.UndefOr[PlotBbTopLineStylesOptions] = js.undefined
}

object PlotBbTopLineOptions {
  @scala.inline
  def apply(styles: PlotBbTopLineStylesOptions = null): PlotBbTopLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PlotBbTopLineOptions]
  }
}

