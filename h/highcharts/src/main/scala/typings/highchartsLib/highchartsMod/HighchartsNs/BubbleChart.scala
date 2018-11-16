package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn
     * as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to
     * the Z value.
     */

trait BubbleChart extends SeriesChart {
  /**
           * Whether to display negative sized bubbles. The threshold is given by the zThreshold option, and negative bubbles
           * can be visualized by setting negativeColor.
           * @default true
           * @since 3.0
           */
  var displayNegative: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Maximum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of
           * each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width
           * and height.
           * @default '20%'
           * @since 3.0
           */
  var maxSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
           * Minimum bubble size. Bubbles will automatically size between the minSize and maxSize to reflect the z value of
           * each bubble. Can be either pixels (when no unit is given), or a percentage of the smallest one of the plot width
           * and height.
           * @default 8
           * @since 3.0
           */
  var minSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
           * Whether the bubble's value should be represented by the area or the width of the bubble. The default, area,
           * corresponds best to the human perception of the size of each bubble.
           * @default 'area'
           * @since 3.0.7
           */
  var sizeBy: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When this is true, the absolute value of z determines the size of the bubble. This means that with the default
           * zThreshold of 0, a bubble of value -1 will have the same size as a bubble of value 1, while a bubble of value 0
           * will have a smaller size according to minSize.
           * @default false
           * @since 4.1.9
           */
  var sizeByAbsoluteValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The maximum for the Z value range. Defaults to the highest Z value in the data.
           * @default null
           * @since 4.0.3
           */
  var zMax: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * The minimum for the Z value range. Defaults to the lowest Z value in the data.
           * @default null
           * @since 4.0.3
           */
  var zMin: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * When displayNegative is false, bubbles with lower Z values are skipped. When displayNegative is true and a
           * negativeColor is given, points with lower Z is colored.
           * @default 0
           * @since 3.0
           */
  var zThreshold: js.UndefOr[scala.Double] = js.undefined
}

