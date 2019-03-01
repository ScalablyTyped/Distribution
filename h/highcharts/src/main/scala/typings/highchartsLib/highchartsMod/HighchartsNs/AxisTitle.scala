package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisTitle extends js.Object {
  /**
    * Alignment of the title relative to the axis values. Possible values are 'low', 'middle' or 'high'.
    * @default 'middle'
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the text to null to disable the title.
    * @default 'middle'
    * @deprecated
    */
  var enabled: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The pixel distance between the axis labels or line and the title.
    * @default xAxis: 0 for horizontal axes, 10 for vertical axes, yAxis: 40
    */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance of the axis title from the axis line. By default, this distance is computed from the offset width of
    * the labels, the labels' distance from the axis and the title's margin. However when the offset option is set, it
    * overrides all this.
    * @since 2.2.0
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    * @default xAxis: 0, yAxis: 270
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all
    * styles are applicable.
    * @default { 'color': '#707070', 'fontWeight': 'bold' }.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * The actual text of the axis title. It can contain basic HTML text markup like <b>, <i> and spans with style.
    * @default xAxis: null, yAxis: 'Values'
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Horizontal pixel offset of the title position.
    * @default 0
    * @since 4.1.6
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical pixel offset of the title position.
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object AxisTitle {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    enabled: java.lang.String = null,
    margin: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    style: CSSObject = null,
    text: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): AxisTitle = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (enabled != null) __obj.updateDynamic("enabled")(enabled)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisTitle]
  }
}

