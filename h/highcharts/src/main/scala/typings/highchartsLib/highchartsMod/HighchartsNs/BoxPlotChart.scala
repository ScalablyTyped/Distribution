package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A box plot is a convenient way of depicting groups of data through their five-number summaries: the smallest
     * observation (sample minimum), lower quartile (Q1), median (Q2), upper quartile (Q3), and largest observation (sample
     * maximum).
     */

trait BoxPlotChart extends ErrorBarChart {
  /**
           * The fill color of the box.
           * @default '#FFFFFF'
           * @since 3.0
           */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Padding between each value groups, in x axis units.
           * @default 0.2
           */
  var groupPadding: js.UndefOr[scala.Double] = js.undefined
  /**
           * Whether to group non-stacked columns or to let them render independent of each other. Non-grouped columns will be
           * laid out individually and overlap each other.
           * @default true
           * @since 2.3.0
           */
  var grouping: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The color of the median line. If null, the general series color applies.
           * @default null
           * @since 3.0
           */
  var medianColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
           * The pixel width of the median line. If null, the lineWidth is used.
           * @default 2
           * @since 3.0
           */
  var medianWidth: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

