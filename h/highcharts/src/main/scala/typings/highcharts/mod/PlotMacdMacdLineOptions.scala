package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMacdMacdLineOptions extends js.Object {
  var styles: js.UndefOr[PlotMacdMacdLineStylesOptions] = js.undefined
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
  var zones: js.UndefOr[js.Array[PlotMacdMacdLineZonesOptions]] = js.undefined
}

object PlotMacdMacdLineOptions {
  @scala.inline
  def apply(styles: PlotMacdMacdLineStylesOptions = null, zones: js.Array[PlotMacdMacdLineZonesOptions] = null): PlotMacdMacdLineOptions = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMacdMacdLineOptions]
  }
}

