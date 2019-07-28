package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesTopLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPriceenvelopesTopLineStylesOptions] = js.undefined
}

object PlotPriceenvelopesTopLineOptions {
  @scala.inline
  def apply(styles: PlotPriceenvelopesTopLineStylesOptions = null): PlotPriceenvelopesTopLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PlotPriceenvelopesTopLineOptions]
  }
}

