package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error bars are a graphical representation of the variability of data and are used on graphs to indicate the error, or
  * uncertainty in a reported measurement.
  */
trait ErrorBarChart extends SeriesChart {
  /**
    * When using automatic point colors pulled from the options.colors collection, this option determines whether the
    * chart should receive one color per series or one color per point.
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
    * The spacing between columns on the Z Axis in a 3D chart. Requires highcharts-3d.js.
    * @default 1
    * @since 4.0
    */
  var groupZPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum allowed pixel width for a column, translated to the height of a bar in a bar chart. This prevents the
    * columns from becoming too wide when there is a small number of points in the chart.
    * @default null
    * @since 4.1.8
    */
  var maxPointWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Padding between each column or bar, in x axis units.
    * @default 0.1
    */
  var pointPadding: js.UndefOr[scala.Double] = js.undefined
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
  var states_ErrorBarChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
  /**
    * The color of the stem, the vertical line extending from the box to the whiskers. If null, the series color is
    * used.
    * @default null
    * @since 3.0
    */
  var stemColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The dash style of the stem, the vertical line extending from the box to the whiskers.
    * @default 'Solid'
    * @since 3.0
    */
  var stemDashStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the stem, the vertical line extending from the box to the whiskers. If null, the width is inherited
    * from the lineWidth option.
    * @default null
    * @since 3.0
    */
  var stemWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The color of the whiskers, the horizontal lines marking low and high values. When null, the general series color
    * is used.
    * @default null
    * @since 3.0
    */
  var whiskerColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The length of the whiskers, the horizontal lines marking low and high values. It can be a numerical pixel value,
    * or a percentage value of the box width. Set 0 to disable whiskers.
    * @default '50%'
    * @since 3.0
    */
  var whiskerLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The line width of the whiskers, the horizontal lines marking low and high values. When null, the general
    * lineWidth applies.
    * @default 2
    * @since 3.0
    */
  var whiskerWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

