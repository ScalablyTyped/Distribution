package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPanningOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Enable or disable chart panning.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Decides in what dimensions the user can
    * pan the chart. Can be one of `x`, `y`, or `xy`.
    */
  var `type`: js.UndefOr[OptionsTypeValue] = js.undefined
}

object ChartPanningOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, `type`: OptionsTypeValue = null): ChartPanningOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPanningOptions]
  }
}

