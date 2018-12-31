package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chart's subtitle
  */
trait SubtitleOptions extends js.Object {
  /**
    * The horizontal alignment of the subtitle. Can be one of 'left', 'center' and 'right'.
    * @default 'center'
    * @since 2.0
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When the subtitle is floating, the plot area will not move to make space for it.
    * @default false
    * @since 2.1
    */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by
    * adding position: 'absolute' and left and top properties.
    * @default { 'color': '#555555' }
    */
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * The subtitle of the chart.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to {@link http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html|use HTML} to render the text.
    * @default false
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The vertical alignment of the title. Can be one of 'top', 'middle' and 'bottom'. When a value is given, the title
    * behaves as floating.
    * @since 2.1
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @default 0
    * @since 2.0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By
    * default the subtitle is laid out below the title unless the title is floating.
    * @default null
    * @since 2.0
    */
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

