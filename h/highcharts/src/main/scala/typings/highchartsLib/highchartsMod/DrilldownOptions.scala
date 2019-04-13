package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for drill down, the concept of inspecting increasingly high resolution data through clicking on chart items
  * like columns or pie slices.
  *
  * The drilldown feature requires the drilldown.js file to be loaded, found in the modules directory of the download
  * package, or online at code.highcharts.com/modules/drilldown.js.
  */
trait DrilldownOptions extends js.Object {
  /**
    * Additional styles to apply to the X axis label for a point that has drilldown data. By default it is underlined
    * and blue to invite to interaction.
    * @default { cursor: 'pointer', color: '#0d233a', fontWeight: 'bold', textDecoration: 'underline' }
    * @since 3.0.8
    */
  var activeAxisLabelStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * Additional styles to apply to the data label of a point that has drilldown data. By default it is underlined and
    * blue to invite to interaction.
    * @default { cursor: 'pointer', color: '#0d233a', fontWeight: 'bold', textDecoration: 'underline' }
    * @since 3.0.8
    */
  var activeDataLabelStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * When this option is false, clicking a single point will drill down all points in the same category, equivalent to
    * clicking the X axis label.
    * @default true
    * @since 4.1.7
    */
  var allowPointDrilldown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the animation for all drilldown animations. Animation of a drilldown occurs when drilling between a column
    * point and a column series, or a pie slice and a full pie series. Drilldown can still be used between series and
    * points of different types, but animation will not occur.
    *
    * The animation can either be set as a boolean or a configuration object. If true, it will use the 'swing' jQuery
    * easing and a duration of 500 ms.
    * @since 3.0.8
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * Options for the drill up button that appears when drilling down on a series. The text for the button is defined
    * in lang.drillUpText.
    */
  var drillUpButton: js.UndefOr[highchartsLib.Anon_Position] = js.undefined
  /**
    * An array of series configurations for the drill down. Each series configuration uses the same syntax as the
    * series option set. These drilldown series are hidden by default. The drilldown series is linked to the parent
    * series' point by its id.
    * @since 3.0.8
    */
  var series: js.UndefOr[js.Array[IndividualSeriesOptions]] = js.undefined
}

object DrilldownOptions {
  @scala.inline
  def apply(
    activeAxisLabelStyle: js.Object = null,
    activeDataLabelStyle: js.Object = null,
    allowPointDrilldown: js.UndefOr[scala.Boolean] = js.undefined,
    animation: scala.Boolean | Animation = null,
    drillUpButton: highchartsLib.Anon_Position = null,
    series: js.Array[IndividualSeriesOptions] = null
  ): DrilldownOptions = {
    val __obj = js.Dynamic.literal()
    if (activeAxisLabelStyle != null) __obj.updateDynamic("activeAxisLabelStyle")(activeAxisLabelStyle)
    if (activeDataLabelStyle != null) __obj.updateDynamic("activeDataLabelStyle")(activeDataLabelStyle)
    if (!js.isUndefined(allowPointDrilldown)) __obj.updateDynamic("allowPointDrilldown")(allowPointDrilldown)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (drillUpButton != null) __obj.updateDynamic("drillUpButton")(drillUpButton)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[DrilldownOptions]
  }
}

