package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  /**
    * Individual color for the point. By default the color is pulled from the global colors array.
    * @default undefined
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color
    * the point gets from the scale of the colorAxis.
    * @default undefined
    */
  var colorValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Individual data label for each point. The options are the same as the ones for plotOptions.series.dataLabels
    */
  var dataLabels: js.UndefOr[DataLabels] = js.undefined
  /**
    * A description of the point to add to the screen reader information about the point.
    * @default undefined
    * @since 5.0.0
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The id of a series in the drilldown.series array to use for a drilldown for this point.
    * @since 3.0.8
    */
  var drilldown: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The end value of the point. For gantt datetime axes, the end value is the timestamp in milliseconds since 1970.
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /**
    * Individual point events
    */
  var events: js.UndefOr[PointEvents] = js.undefined
  /**
    * The high or maximum value for each data point.
    */
  var high: js.UndefOr[scala.Double] = js.undefined
  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through chart.get().
    * @since 1.2.0
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @since 4.1.6
    */
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * When this property is true, the points acts as a summary column for the values added or substracted since the
    * last intermediate sum, or since the start of the series. The y value is ignored.
    * @default false
    */
  var isIntermediateSum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When this property is true, the point display the total sum across the entire series. The y value is ignored.
    * @default false
    */
  var isSum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The sequential index of the data point in the legend.
    */
  var legendIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The low or minimum value for each data point.
    */
  var low: js.UndefOr[scala.Double] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The median for each data point. This is drawn as a line through the middle area of the box.
    */
  var median: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    *
    * If the xAxis.type is set to category, and no categories option exists, the category will be pulled from the
    * point.name of the last series defined. For multiple series, best practice however is to define xAxis.categories.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the
    * parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root.
    * @default undefined
    * @since 4.1.0
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The lower quartile for each data point. This is the bottom of the box.
    */
  var q1: js.UndefOr[scala.Double] = js.undefined
  /**
    * The higher quartile for each data point. This is the top of the box.
    */
  var q3: js.UndefOr[scala.Double] = js.undefined
  /**
    * The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @since 4.1.6
    */
  var radius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Whether the data point is selected initially.
    * @default false
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to display a slice offset from the center.
    * @default false
    */
  var sliced: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The start value of the point. For gantt datetime axes, the start value is the timestamp in milliseconds since 1970.
    */
  var start: js.UndefOr[scala.Double] = js.undefined
  /**
    * The value of the point, resulting in a relative area of the point in the treemap.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y value of the point.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
    * The size value for each bubble. The bubbles' diameters are computed based on the z, and controlled by series
    * options like minSize, maxSize, sizeBy, zMin and zMax.
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object DataPoint {
  @scala.inline
  def apply(
    color: java.lang.String | Gradient = null,
    colorValue: scala.Int | scala.Double = null,
    dataLabels: DataLabels = null,
    description: java.lang.String = null,
    drilldown: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    events: PointEvents = null,
    high: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    innerRadius: scala.Double | java.lang.String = null,
    isIntermediateSum: js.UndefOr[scala.Boolean] = js.undefined,
    isSum: js.UndefOr[scala.Boolean] = js.undefined,
    legendIndex: scala.Int | scala.Double = null,
    low: scala.Int | scala.Double = null,
    marker: Marker = null,
    median: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    parent: java.lang.String = null,
    q1: scala.Int | scala.Double = null,
    q3: scala.Int | scala.Double = null,
    radius: scala.Double | java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    sliced: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): DataPoint = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorValue != null) __obj.updateDynamic("colorValue")(colorValue.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (description != null) __obj.updateDynamic("description")(description)
    if (drilldown != null) __obj.updateDynamic("drilldown")(drilldown)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isIntermediateSum)) __obj.updateDynamic("isIntermediateSum")(isIntermediateSum)
    if (!js.isUndefined(isSum)) __obj.updateDynamic("isSum")(isSum)
    if (legendIndex != null) __obj.updateDynamic("legendIndex")(legendIndex.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (!js.isUndefined(sliced)) __obj.updateDynamic("sliced")(sliced)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

