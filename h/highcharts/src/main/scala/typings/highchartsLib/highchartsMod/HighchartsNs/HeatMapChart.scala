package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The heatmap series type. This series type is available both in Highcharts and Highmaps.
     * The colors of each heat map point is usually determined by its value and controlled by settings on the colorAxis.
     */

trait HeatMapChart extends SeriesChart {
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
           * The columns size - how many X axis units each column in the heatmap should span.
           * @default 1
           * @since 4.0
           */
  var colsize: js.UndefOr[scala.Double] = js.undefined
  /**
           * When the series contains less points than the crop threshold, all points are drawn, event if the points fall
           * outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and
           * columns), is that animation is performed on updates. On the other hand, when the series contains more points than
           * the crop threshold, the series data is cropped to only contain points that fall within the plot area. The
           * advantage of cropping away invisible points is to increase performance on large series.
           * @default 50
           */
  var cropTreshold: js.UndefOr[scala.Double] = js.undefined
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
           * The row size - how many Y axis units each heatmap row should span.
           * @default 1
           * @since 4.0
           */
  var rowsize: js.UndefOr[scala.Double] = js.undefined
  /**
           * A wrapper object for all the series options in specific states.
           */
  @JSName("states")
  var states_HeatMapChart: js.UndefOr[highchartsLib.Anon_HoverBarStates] = js.undefined
}

