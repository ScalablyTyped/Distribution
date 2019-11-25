package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrilldownOptions extends js.Object {
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the X axis label for
    * a point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active label styles can be set with the
    * `.highcharts-drilldown-axis-label` class.
    */
  var activeAxisLabelStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highmaps) Additional styles to apply to the data label of a
    * point that has drilldown data. By default it is underlined and blue to
    * invite to interaction.
    *
    * In styled mode, active data label styles can be applied with the
    * `.highcharts-drilldown-data-label` class.
    */
  var activeDataLabelStyle: js.UndefOr[CSSObject | DrilldownActiveDataLabelStyleOptions] = js.undefined
  /**
    * (Highcharts) When this option is false, clicking a single point will
    * drill down all points in the same category, equivalent to clicking the X
    * axis label.
    */
  var allowPointDrilldown: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highmaps) Set the animation for all drilldown animations.
    * Animation of a drilldown occurs when drilling between a column point and
    * a column series, or a pie slice and a full pie series. Drilldown can
    * still be used between series and points of different types, but animation
    * will not occur.
    *
    * The animation can either be set as a boolean or a configuration object.
    * If `true`, it will use the 'swing' jQuery easing and a duration of 500
    * ms. If used as a configuration object, the following properties are
    * supported:
    *
    * - `duration`: The duration of the animation in milliseconds.
    *
    * - `easing`: A string reference to an easing function set on the `Math`
    * object. See the easing demo.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highmaps) Options for the drill up button that appears when
    * drilling down on a series. The text for the button is defined in
    * lang.drillUpText.
    */
  var drillUpButton: js.UndefOr[DrilldownDrillUpButtonOptions] = js.undefined
  /**
    * (Highcharts, Highmaps) An array of series configurations for the drill
    * down. Each series configuration uses the same syntax as the series option
    * set. These drilldown series are hidden by default. The drilldown series
    * is linked to the parent series' point by its `id`.
    */
  var series: js.UndefOr[js.Array[SeriesOptionsType]] = js.undefined
}

object DrilldownOptions {
  @scala.inline
  def apply(
    activeAxisLabelStyle: CSSObject = null,
    activeDataLabelStyle: CSSObject | DrilldownActiveDataLabelStyleOptions = null,
    allowPointDrilldown: js.UndefOr[Boolean] = js.undefined,
    animation: Boolean | AnimationOptionsObject = null,
    drillUpButton: DrilldownDrillUpButtonOptions = null,
    series: js.Array[SeriesOptionsType] = null
  ): DrilldownOptions = {
    val __obj = js.Dynamic.literal()
    if (activeAxisLabelStyle != null) __obj.updateDynamic("activeAxisLabelStyle")(activeAxisLabelStyle.asInstanceOf[js.Any])
    if (activeDataLabelStyle != null) __obj.updateDynamic("activeDataLabelStyle")(activeDataLabelStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPointDrilldown)) __obj.updateDynamic("allowPointDrilldown")(allowPointDrilldown.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (drillUpButton != null) __obj.updateDynamic("drillUpButton")(drillUpButton.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrilldownOptions]
  }
}

