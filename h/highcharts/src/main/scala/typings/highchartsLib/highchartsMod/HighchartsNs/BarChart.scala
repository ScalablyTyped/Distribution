package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarChart extends SeriesChart {
  /**
    * The color of the border surrounding each column or bar.
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The corner radius of the border surrounding each column or bar.
    * @default 0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * When using automatic point colors pulled from the options.colors collection, this option determines whether the
    * chart should receive one color per series or one color per point. Defaults to false.
    * @default false
    * @since 2.0
    */
  var colorByPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  /**
    * Depth of the columns in a 3D column chart. Requires highcharts-3d.js.
    * @default 25
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * 3D columns only. The color of the edges. Similar to borderColor, except it defaults to the same color as the
    * column.
    */
  var edgeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 3D columns only. The width of the colored edges.
    * @default 1
    */
  var edgeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Padding between each value groups, in x axis units.
    * @default 0.2
    */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The spacing between columns on the Z Axis in a 3D chart. Requires highcharts-3d.js.
    * @default 1
    * @since 4.0
    */
  var groupZPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be
    * laid out individually and overlap each other.
    * @default true
    * @since 2.3.0
    */
  var grouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
    * columns from becoming too wide when there is a small number of points in the chart.
    * @default null
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The minimal height for a column or width for a bar. By default, 0 values are not shown. To visualize a 0 (or
    * close to zero) point, set the minimal point length to a pixel value like 3. In stacked column charts,
    * minPointLength might not be respected for tightly packed values.
    * @default 0
    */
  var minPointLength: js.UndefOr[scala.Double] = js.undefined
  /**
    * Padding between each column or bar, in x axis units.
    * @default 0.1
    */
  var pointPadding: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The X axis range that each point is valid for. This determines the width of the column. On a categorized axis,
    * the range will be 1 by default (one category unit). On linear and datetime axes, the range will be computed as
    * the distance between the two closest data points.
    * @since 2.3
    */
  var pointRange: js.UndefOr[scala.Double] = js.undefined
  /**
    * A pixel value specifying a fixed width for each column or bar. When null, the width is calculated from the
    * pointPadding and groupPadding.
    * @since 1.2.5
    */
  var pointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_BarChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
}

