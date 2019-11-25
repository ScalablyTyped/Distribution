package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotVbpZoneLinesOptions extends js.Object {
  /**
    * (Highstock) Enable/disable zone lines.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) Specify the style of zone lines.
    */
  var styles: js.UndefOr[CSSObject] = js.undefined
}

object PlotVbpZoneLinesOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: CSSObject = null): PlotVbpZoneLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotVbpZoneLinesOptions]
  }
}

