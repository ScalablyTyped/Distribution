package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotSunburstLevelsOptions extends js.Object {
  /**
    * (Highcharts) Can set a `borderColor` on all points which lies on the same
    * level.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts) Can set a `borderDashStyle` on all points which lies on the
    * same level.
    */
  var borderDashStyle: js.UndefOr[DashStyleValue] = js.undefined
  /**
    * (Highcharts) Can set a `borderWidth` on all points which lies on the same
    * level.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set a `color` on all points which lies on the same
    * level.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) Can set a `colorVariation` on all points which lies on the
    * same level.
    */
  var colorVariation: js.UndefOr[PlotSunburstLevelsColorVariationOptions] = js.undefined
  /**
    * (Highcharts) Can set `dataLabels` on all points which lies on the same
    * level.
    */
  var dataLabels: js.UndefOr[SeriesSunburstDataLabelsOptionsObject] = js.undefined
  /**
    * (Highcharts) Can set a `levelSize` on all points which lies on the same
    * level.
    */
  var levelSize: js.UndefOr[js.Object] = js.undefined
  /**
    * (Highcharts) Can set a `rotation` on all points which lies on the same
    * level.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Can set a `rotationMode` on all points which lies on the
    * same level.
    */
  var rotationMode: js.UndefOr[String] = js.undefined
}

object PlotSunburstLevelsOptions {
  @scala.inline
  def apply(
    borderColor: ColorString = null,
    borderDashStyle: DashStyleValue = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorVariation: PlotSunburstLevelsColorVariationOptions = null,
    dataLabels: SeriesSunburstDataLabelsOptionsObject = null,
    levelSize: js.Object = null,
    rotation: Int | Double = null,
    rotationMode: String = null
  ): PlotSunburstLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashStyle != null) __obj.updateDynamic("borderDashStyle")(borderDashStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorVariation != null) __obj.updateDynamic("colorVariation")(colorVariation.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (levelSize != null) __obj.updateDynamic("levelSize")(levelSize.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationMode != null) __obj.updateDynamic("rotationMode")(rotationMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotSunburstLevelsOptions]
  }
}

