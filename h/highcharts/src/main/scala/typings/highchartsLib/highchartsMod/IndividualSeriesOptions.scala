package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* You will rarely, if ever, want to use this interface directly. Instead it is much more useful to use one of the derived
  * interfaces (AreaChartSeriesOptions, LineChartSeriesOptions, etc.)
  */
trait IndividualSeriesOptions extends js.Object {
  /**
    * The main color or the series. In line type series it applies to the line and the point markers unless otherwise
    *     specified. In bar type series it applies to the bars unless a color is specified per point. The default
    *     value is pulled from the options.colors array.
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Styled mode only. A specific color index to use for the point, so its graphic representations are given the class name highcharts-color-{n}.
    * @since 5.0.0
    */
  var colorIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * When true, each column edge is rounded to its nearest pixel in order to render sharp on screen.
    * In some cases, when there are a lot of densely packed columns, this leads to visible difference
    * in column widths or distance between columns. In these cases, setting crisp to false may look
    * better, even though each column is rendered blurry.
    * @default true
    * @since 5.0.10
    */
  var crisp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can set the cursor to "pointer" if you have click events attached to the series, to signal to the user
    *     that the points and lines can be clicked.
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of data points for the series. For the area series type, points can be given in the following ways:
    *
    * 1. An array of numerical values. In this case, the numerical values will be interpreted as y options. The x
    *    values will be automatically calculated, either starting at 0 and incremented by 1, or from pointStart and
    *    pointInterval given in the series options. If the axis has categories, these will be used. Example:
    *        data: [0, 5, 3, 5]
    *
    * 2. An array of arrays with 2 values. In this case, the values correspond to x,y. If the first value is a string,
    *    it is applied as the name of the point, and the x value is inferred.
    *        data: [
    *            [0, 9],
    *            [1, 7],
    *            [2, 6]
    *        ]
    *
    * 3. An array of objects with named values. The objects are point configuration objects as seen below. If the total
    *    number of data points exceeds the series' turboThreshold, this option is not available.
    *        data: [{
    *            x: 1,
    *            y: 9,
    *            name: 'Point2',
    *            color: '#00FF00'
    *        }, {
    *            x: 1,
    *            y: 6,
    *            name: 'Point1',
    *            color: '#FF00FF'
    *        }]
    *
    * 4. An array of arrays with three values for ranges. In this case the values correspond x, yMin and yMax. If the
    *    first value is a string it is applied as the name of the point, and the x value is inferred.
    *        data: [
    *            [1, 2, 3],
    *            [2, 4, 6],
    *            [3, 7, 8]
    *
    */
  var data: js.UndefOr[
    js.Array[
      scala.Double | scala.Null | (js.Tuple2[scala.Double | java.lang.String, scala.Double | scala.Null]) | (js.Tuple3[scala.Double | java.lang.String, scala.Double, scala.Double]) | DataPoint
    ]
  ] = js.undefined
  /**
    * A description of the series to add to the screen reader information about the series.
    * @since 5.0.0
    * @default undefined
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through
    * chart.get().
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index of the series in the chart, affecting the internal index in the chart.series array, the visible Z index
    * as well as the order in the legend.
    * @since 2.3.0
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  var innerSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The sequential index of the series in the legend.
    */
  var legendIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using any indicators, Define the indicators name like 'candlesticksss'.
    */
  var linkedTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The name of the series as shown in the legend, tooltip etc.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pixel value specifying a fixed width for each column or bar. When null, the width is calculated from
    * the pointPadding and groupPadding.
    */
  var pointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * This option allows grouping series in a stacked chart. The stack option can be a string or a number or anything
    * else, as long as the grouped series' stack options match each other.
    * @since 2.1
    */
  var stack: js.UndefOr[js.Any] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The series' visibility state as set by series.show(), series.hide(), or the initial configuration.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first.
    * @default 0
    */
  var xAxis: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * When using dual or multiple x axes, this number defines which xAxis the particular series is connected to. It
    * refers to either the axis id or the index of the axis in the xAxis array, with 0 being the first.
    * @default 0
    */
  var yAxis: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Define the visual z index of the series.
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IndividualSeriesOptions {
  @scala.inline
  def apply(
    color: java.lang.String | Gradient = null,
    colorIndex: scala.Int | scala.Double = null,
    crisp: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: java.lang.String = null,
    data: js.Array[
      scala.Double | scala.Null | (js.Tuple2[scala.Double | java.lang.String, scala.Double | scala.Null]) | (js.Tuple3[scala.Double | java.lang.String, scala.Double, scala.Double]) | DataPoint
    ] = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    innerSize: scala.Double | java.lang.String = null,
    legendIndex: scala.Int | scala.Double = null,
    linkedTo: java.lang.String = null,
    maxFontSize: scala.Int | scala.Double = null,
    minFontSize: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pointWidth: scala.Int | scala.Double = null,
    size: scala.Double | java.lang.String = null,
    stack: js.Any = null,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    xAxis: java.lang.String | scala.Double = null,
    yAxis: java.lang.String | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): IndividualSeriesOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorIndex != null) __obj.updateDynamic("colorIndex")(colorIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(crisp)) __obj.updateDynamic("crisp")(crisp)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (innerSize != null) __obj.updateDynamic("innerSize")(innerSize.asInstanceOf[js.Any])
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (linkedTo != null) __obj.updateDynamic("linkedTo")(linkedTo)
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointWidth != null) __obj.updateDynamic("pointWidth")(pointWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndividualSeriesOptions]
  }
}

