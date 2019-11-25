package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPriceenvelopesBottomLineOptions extends js.Object {
  var styles: js.UndefOr[PlotPriceenvelopesBottomLineStylesOptions] = js.undefined
}

object PlotPriceenvelopesBottomLineOptions {
  @scala.inline
  def apply(styles: PlotPriceenvelopesBottomLineStylesOptions = null): PlotPriceenvelopesBottomLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPriceenvelopesBottomLineOptions]
  }
}

