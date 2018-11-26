package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * General plotting options for the gauge series type. Requires highcharts-more.js
     */

trait GaugeChart extends SeriesChart {
  /**
           * Data labels for the gauge. For gauges, the data labels are enabled by default and shown in a bordered box below
           * the point.
           */
  var datalabels: js.UndefOr[DataLabels] = js.undefined
  /**
           * Options for the dial or arrow pointer of the gauge.
           */
  var dial: js.UndefOr[Dial] = js.undefined
  /**
           * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
           */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
           */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * Allow the dial to overshoot the end of the perimeter axis by this many degrees. Say if the gauge axis goes from 0
           * to 60, a value of 100, or 1000, will show 5 degrees beyond the end of the axis. Defaults to 0.
           * @default 0
           * @since 3.0.10
           */
  var overshoot: js.UndefOr[scala.Double] = js.undefined
  /**
           * Options for the pivot or the center point of the gauge.
           * @since 2.3.0
           */
  var pivot: js.UndefOr[Pivot] = js.undefined
  /**
           * When this option is true, the dial will wrap around the axes. For instance, in a full-range gauge going from 0 to
           * 360, a value of 400 will point to 40. When wrap is false, the dial stops at 360.
           * @default true
           * @since 3.0
           */
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

