package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pie chart is a circular chart divided into sectors, illustrating numerical proportion.
  */
trait PieChart extends SeriesChart {
  /**
    * The color of the border surrounding each slice. When null, the border takes the same color as the slice fill.
    * This can be used together with a borderWidth to fill drawing gaps created by antialiazing artefacts in
    * borderless pies.
    * @default '#FFFFFF'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
    * The width of the border surrounding each column or bar.
    * @default 1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The center of the pie chart relative to the plot area. Can be percentages or pixel values. The default behaviour
    * (as of 3.0) is to center the pie so that all slices and data labels are within the plot area. As a consequence,
    * the pie may actually jump around in a chart with dynamic values, as the data labels move. In that case, the
    * center should be explicitly set, for example to ['50%', '50%'].
    * @default [null, null]
    */
  var center: js.UndefOr[
    js.Tuple2[
      java.lang.String | scala.Double | scala.Null, 
      java.lang.String | scala.Double | scala.Null
    ]
  ] = js.undefined
  /**
    * A series specific or series type specific color set to apply instead of the global colors when colorByPoint is true.
    * @since 3.0
    */
  var colors: js.UndefOr[js.Array[Color]] = js.undefined
  @JSName("dataLabels")
  var dataLabels_PieChart: js.UndefOr[PieDataLabels] = js.undefined
  /**
    * The thickness of a 3D pie. Requires highcharts-3d.js
    * @default 0
    * @since 4.0
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The end angle of the pie in degrees where 0 is top and 90 is right. Defaults to startAngle plus 360.
    * @default null
    * @since 1.3.6
    */
  var endAngle: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * Equivalent to chart.ignoreHiddenSeries, this option tells whether the series shall be redrawn as if the hidden
    * point were null.
    *
    * The default value changed from false to true with Highcharts 3.0.
    *
    * @default true
    * @since 2.3.0
    */
  var ignoreHiddenPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The size of the inner diameter for the pie. A size greater than 0 renders a donut chart. Can be a percentage or
    * pixel value. Percentages are relative to the pie size. Pixel values are given as integers.
    *
    * Note: in Highcharts < 4.1.2, the percentage was relative to the plot area, not the pie size.
    * @default 0
    * @since 2.0
    */
  var innerSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * For area-like series, allow the font size to vary so that small areas get a smaller font size. The default applies this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The minimum size for a pie in response to auto margins. The pie will try to shrink to make room for data labels
    * in side the plot area, but only to this size.
    * @default 80
    * @since 3.0
    */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The diameter of the pie relative to the plot area. Can be a percentage or pixel value. Pixel values are given as
    * integers. The default behaviour (as of 3.0) is to scale to the plot area and give room for data labels within the
    * plot area. As a consequence, the size of the pie may vary when points are updated and data labels more around. In
    * that case it is best to set a fixed value, for example '75%'.
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * If a point is sliced, moved out from the center, how many pixels should it be moved?
    * @default 10
    */
  var slicedOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The start angle of the pie slices in degrees where 0 is top and 90 right.
    * @default 0
    * @since 2.3.4
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * A wrapper object for all the series options in specific states.
    */
  @JSName("states")
  var states_PieChart: js.UndefOr[highchartsLib.Anon_HoverPieStates] = js.undefined
}

