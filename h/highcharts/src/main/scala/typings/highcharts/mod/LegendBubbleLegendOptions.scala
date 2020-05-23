package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendBubbleLegendOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The color of the ranges borders, can be
    * also defined for an individual range.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The width of the ranges borders in
    * pixels, can be also defined for an individual range.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend' circle graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The main color of the bubble legend.
    * Applies to ranges, if individual color is not defined.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend's connector graphical elements. This option does not
    * replace default class names of the graphical element.
    */
  var connectorClassName: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color of the connector, can be also
    * defined for an individual range.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The length of the connectors in pixels.
    * If labels are centered, the distance is reduced to 0.
    */
  var connectorDistance: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The width of the connectors in pixels.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Enable or disable the bubble legend.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Options for the bubble legend labels.
    */
  var labels: js.UndefOr[LegendBubbleLegendLabelsOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The position of the bubble legend in
    * the legend.
    */
  var legendIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Miximum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Minimum bubble legend range size. If
    * values for ranges are not specified, the `minSize` and the `maxSize` are
    * calculated from bubble series.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Options for specific range. One range
    * consists of bubble, label and connector.
    */
  var ranges: js.UndefOr[js.Array[LegendBubbleLegendRangesOptions]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether the bubble legend range value
    * should be represented by the area or the width of the bubble. The
    * default, area, corresponds best to the human perception of the size of
    * each bubble.
    */
  var sizeBy: js.UndefOr[BubbleSizeByValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) When this is true, the absolute value
    * of z determines the size of the bubble. This means that with the default
    * zThreshold of 0, a bubble of value -1 will have the same size as a bubble
    * of value 1, while a bubble of value 0 will have a smaller size according
    * to minSize.
    */
  var sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Define the visual z index of the bubble
    * legend.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Ranges with with lower value than
    * zThreshold, are skipped.
    */
  var zThreshold: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegendOptions {
  @scala.inline
  def apply(
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    connectorClassName: String = null,
    connectorColor: ColorString | GradientColorObject | PatternObject = null,
    connectorDistance: js.UndefOr[Double] = js.undefined,
    connectorWidth: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    labels: LegendBubbleLegendLabelsOptions = null,
    legendIndex: js.UndefOr[Double] = js.undefined,
    maxSize: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    ranges: js.Array[LegendBubbleLegendRangesOptions] = null,
    sizeBy: BubbleSizeByValue = null,
    sizeByAbsoluteValue: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zThreshold: js.UndefOr[Double] = js.undefined
  ): LegendBubbleLegendOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorClassName != null) __obj.updateDynamic("connectorClassName")(connectorClassName.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorDistance)) __obj.updateDynamic("connectorDistance")(connectorDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorWidth)) __obj.updateDynamic("connectorWidth")(connectorWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(legendIndex)) __obj.updateDynamic("legendIndex")(legendIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (sizeBy != null) __obj.updateDynamic("sizeBy")(sizeBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeByAbsoluteValue)) __obj.updateDynamic("sizeByAbsoluteValue")(sizeByAbsoluteValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zThreshold)) __obj.updateDynamic("zThreshold")(zThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBubbleLegendOptions]
  }
}

