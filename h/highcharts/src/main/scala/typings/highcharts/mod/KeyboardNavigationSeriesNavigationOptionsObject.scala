package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardNavigationSeriesNavigationOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Set the keyboard navigation mode
    * for the chart. Can be "normal" or "serialize". In normal mode, left/right
    * arrow keys move between points in a series, while up/down arrow keys move
    * between series. Up/down navigation acts intelligently to figure out which
    * series makes sense to move to from any given point.
    *
    * In "serialize" mode, points are instead navigated as a single list.
    * Left/right behaves as in "normal" mode. Up/down arrow keys will behave
    * like left/right. This can be useful for unifying navigation behavior
    * with/without screen readers enabled.
    */
  var mode: js.UndefOr[OptionsModeValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer allow keyboard navigation for it.
    *
    * Set to `false` to disable.
    */
  var pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Skip null points when navigating
    * through points with the keyboard.
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.undefined
}

object KeyboardNavigationSeriesNavigationOptionsObject {
  @scala.inline
  def apply(
    mode: OptionsModeValue = null,
    pointNavigationEnabledThreshold: Boolean | Double = null,
    skipNullPoints: js.UndefOr[Boolean] = js.undefined
  ): KeyboardNavigationSeriesNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pointNavigationEnabledThreshold != null) __obj.updateDynamic("pointNavigationEnabledThreshold")(pointNavigationEnabledThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(skipNullPoints)) __obj.updateDynamic("skipNullPoints")(skipNullPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardNavigationSeriesNavigationOptionsObject]
  }
}

