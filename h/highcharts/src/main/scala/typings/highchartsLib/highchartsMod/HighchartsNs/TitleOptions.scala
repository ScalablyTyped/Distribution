package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleOptions extends js.Object {
  /**
    * The horizontal alignment of the title. Can be one of 'left', 'center' and 'right'.
    * @default 'center'
    * @since 2.0
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When the title is floating, the plot area will not move to make space for it.
    * @default false
    * @since 2.1
    */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and
    * the plot area.
    * @default 15
    * @since 2.1
    */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by
    * adding position: 'absolute' and left and top properties.
    * @default { 'color': '#333333', 'fontSize': '18px' }
    */
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * The title of the chart. To disable the title, set the text to null.
    * @default 'Chart title'
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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
    * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @default 0
    * @since 2.0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position of the title relative to the alignment within chart.spacingTop and chart.spacingBottom. By default
    * it depends on the font size.
    * @default null
    * @since 2.0
    */
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object TitleOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Int | scala.Double = null,
    style: js.Object = null,
    text: java.lang.String = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TitleOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOptions]
  }
}

