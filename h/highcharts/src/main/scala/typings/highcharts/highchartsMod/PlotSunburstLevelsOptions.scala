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
  var borderDashStyle: js.UndefOr[String] = js.undefined
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
  var dataLabels: js.UndefOr[js.Object] = js.undefined
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
    borderDashStyle: String = null,
    borderWidth: Int | Double = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    colorVariation: PlotSunburstLevelsColorVariationOptions = null,
    dataLabels: js.Object = null,
    levelSize: js.Object = null,
    rotation: Int | Double = null,
    rotationMode: String = null
  ): PlotSunburstLevelsOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderDashStyle != null) __obj.updateDynamic("borderDashStyle")(borderDashStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorVariation != null) __obj.updateDynamic("colorVariation")(colorVariation)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (levelSize != null) __obj.updateDynamic("levelSize")(levelSize)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (rotationMode != null) __obj.updateDynamic("rotationMode")(rotationMode)
    __obj.asInstanceOf[PlotSunburstLevelsOptions]
  }
}

