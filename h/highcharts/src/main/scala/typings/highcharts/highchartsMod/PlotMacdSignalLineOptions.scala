package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdSignalLineOptions extends js.Object {
  var styles: js.UndefOr[PlotMacdSignalLineStylesOptions] = js.undefined
  /**
    * (Highcharts, Highstock) An array defining zones within a series. Zones
    * can be applied to the X axis, Y axis or Z axis for bubbles, according to
    * the `zoneAxis` option. The zone definitions have to be in ascending order
    * regarding to the value.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-zone-{n}` class, or custom classed from the `className`
    * option (view live demo).
    */
  var zones: js.UndefOr[js.Array[PlotMacdSignalLineZonesOptions]] = js.undefined
}

object PlotMacdSignalLineOptions {
  @scala.inline
  def apply(
    styles: PlotMacdSignalLineStylesOptions = null,
    zones: js.Array[PlotMacdSignalLineZonesOptions] = null
  ): PlotMacdSignalLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdSignalLineOptions]
  }
}

