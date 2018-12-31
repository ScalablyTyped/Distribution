package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Funnel charts are a type of chart often used to visualize stages in a sales project, where the top are the initial
  * stages with the most clients. It requires that the modules/funnel.js file is loaded
  */
trait FunnelChart extends SeriesChart {
  /**
    * The color of the border surrounding each column or bar.
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The center of the series. By default, it is centered in the middle of the plot area, so it fills the plot area
    * height.
    * @default ['50%', '50%']
    * @since 3.0
    */
  var center: js.UndefOr[js.Tuple2[java.lang.String | scala.Double, java.lang.String | scala.Double]] = js.undefined
  /**
    * A series specific or series type specific color set to use instead of the global colors.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  @JSName("dataLabels")
  var dataLabels_FunnelChart: js.UndefOr[PieDataLabels] = js.undefined
  /**
    * The thickness of a 3D pie. Requires highcharts-3d.js
    * @default 0
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the funnel or pyramid. If it is a number it defines the pixel height, if it is a percentage string
    * it is the percentage of the plot area height.
    * @since 3.0
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels
    * in side the plot area, but only to this size.
    * @default 80
    * @since 3.0
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a
    * percentage of the plot area height.
    * @default '25%'
    */
  var neckHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The width of the neck, the lower part of the funnel. A number defines pixel width, a percentage string defines a
    * percentage of the plot area width.
    * @default '30%'
    * @since 3.0
    */
  var neckWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * A reversed funnel has the widest area down. A reversed funnel with no neck width and neck height is a pyramid.
    * @default false
    * @since 3.0.10
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If a point is sliced, moved out from the center, how many pixels should it be moved?
    * @default 10
    */
  var slicedOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_FunnelChart: js.UndefOr[highchartsLib.Anon_Hover] = js.undefined
  /**
    * The width of the funnel compared to the width of the plot area, or the pixel width if it is a number.
    * @default '90%'
    * @since 3.0
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

