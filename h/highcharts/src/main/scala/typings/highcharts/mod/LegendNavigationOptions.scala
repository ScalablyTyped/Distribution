package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color for the active up or
    * down arrow in the legend page navigation.
    */
  var activeColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to animate the pages when
    * navigating up or down. A value of `true` applies the default navigation
    * given in the `chart.animation` option. Additional options can be given as
    * an object containing values for easing and duration.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the up and
    * down arrows in the legend paging navigation.
    */
  var arrowSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the legend
    * navigation. In most cases, disabling the navigation results in an
    * unwanted overflow.
    *
    * See also the adapt chart to legend plugin for a solution to extend the
    * chart height to make room for the legend, optionally in exported charts
    * only.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the inactive up or
    * down arrow in the legend page navigation. .
    */
  var inactiveColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text styles for the legend page
    * navigation.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LegendNavigationOptions {
  @scala.inline
  def apply(
    activeColor: ColorString | GradientColorObject | PatternObject = null,
    animation: Boolean | AnimationOptionsObject = null,
    arrowSize: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    inactiveColor: ColorString | GradientColorObject | PatternObject = null,
    style: CSSObject = null
  ): LegendNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowSize)) __obj.updateDynamic("arrowSize")(arrowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendNavigationOptions]
  }
}

