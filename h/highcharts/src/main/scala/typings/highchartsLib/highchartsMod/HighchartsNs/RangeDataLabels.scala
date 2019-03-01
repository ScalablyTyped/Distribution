package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeDataLabels extends js.Object {
  /**
    * The alignment of the data label compared to the point. If right, the right side of the label should be touching
    * the point. For points with an extent, like columns, the alignments also dictates how to align it inside the box,
    * as given with the inside option. Can be one of 'left', 'center' or 'right'.
    * @default 'center'
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to allow data labels to overlap. To make the labels less sensitive for overlapping, the
    * dataLabels.padding can be set to 0.
    * @default false
    * @since 4.1.0
    */
  var allowOverlap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The background color or gradient for the data label.
    * @default undefined
    * @since 2.2.1
    */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border color for the data label.
    * @default undefined
    * @since 2.2.1
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border radius in pixels for the data label.
    * @default 0
    * @since 2.2.1
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The border width in pixels for the data label.
    * @default 0
    * @since 2.2.1
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The text color for the data labels.
    * @default null
    */
  var color: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
    * Whether to hide data labels that are outside the plot area. By default, the data label is moved inside the plot
    * area according to the overflow option.
    * @default true
    * @since 2.3.3
    */
  var crop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to defer displaying the data labels until the initial series animation has finished.
    * @default true
    * @since 4.0
    */
  var defer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable the data labels.
    * @default false
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A format string for the data label. Available variables are the same as for formatter.
    * @default '{y}'
    * @since 3.0
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback JavaScript function to format the data label. Note that if a format is defined, the format takes
    * precedence and the formatter is ignored.
    * Available data are:
    * - this.percentage Stacked series and pies only. The point's percentage of the total.
    * - this.point      The point object. The point name, if defined, is available through this.point.name.
    * - this.series     The series object. The series name is available through this.series.name.
    * - this.total      Stacked series only. The total value at this point's x value.
    * - this.x:         The x value.
    * - this.y:         The y value.
    */
  var formatter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
    * For points with an extent, like columns, whether to align the data label inside the box or to the actual value
    * point. Defaults to false in most cases, true in stacked columns.
    * @since 3.0
    */
  var inside: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How to handle data labels that flow outside the plot area. The default is justify, which aligns them inside the
    * plot area. For columns and bars, this means it will be moved inside the bar. To display data labels outside the
    * plot area, set crop to false and overflow to 'none'.
    * @default 'justify'
    * @since 3.0.6
    */
  var overflow: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When either the borderWidth or the backgroundColor is set, this  is the padding within the box.
    * @default 5
    * @since 2.2.1
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text rotation in degrees. Note that due to a more complex structure, backgrounds, borders and padding will be
    * lost on a rotated data label.
    * @default 0
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * The shadow of the box. Works best with borderWidth or backgroundColor. Since 2.3 the shadow can be an object
    * configuration containing color, offsetX, offsetY, opacity and width.
    * @default false
    * @since 2.2.1
    */
  var shadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
    * The name of a symbol to use for the border around the label. Symbols are predefined functions on the Renderer
    * object.
    * @default 'square'
    * @since 4.1.2
    */
  var shape: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Styles for the label.
    * @default {'color': 'contrast', 'fontSize': '11px', 'fontWeight': 'bold', 'textShadow': '0 0 6px contrast, 0 0 3px contrast' }
    * @since 4.1.0
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * Whether to {@link http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html|use HTML} to render the labels.
    * @default false
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The vertical alignment of a data label. Can be one of 'top', 'middle' or 'bottom'. The default value depends on the
    * data, for instance in a column chart, the label is above positive values and below negative values.
    * @since 2.3.3
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * X offset of the higher data labels relative to the point value.
    * @default 0
    * @since 2.3.0
    */
  var xHigh: js.UndefOr[scala.Double] = js.undefined
  /**
    * X offset of the lower data labels relative to the point value.
    * @default 0
    * @since 2.3.0
    */
  var xLow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y offset of the higher data labels relative to the point value.
    * @default -6
    * @since 2.3.0
    */
  var yHigh: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y offset of the lower data labels relative to the point value.
    * @default 16
    * @since 2.3.0
    */
  var yLow: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Z index of the data labels. The default Z index puts it above the series. Use a Z index of 2 to display it
    * behind the series.
    * @default 6
    * @since 2.3.5
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object RangeDataLabels {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    allowOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    color: java.lang.String | Gradient = null,
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formatter: js.Function0[java.lang.String] = null,
    inside: js.UndefOr[scala.Boolean] = js.undefined,
    overflow: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    shadow: scala.Boolean | Shadow = null,
    shape: java.lang.String = null,
    style: CSSObject = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    xHigh: scala.Int | scala.Double = null,
    xLow: scala.Int | scala.Double = null,
    yHigh: scala.Int | scala.Double = null,
    yLow: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): RangeDataLabels = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (xHigh != null) __obj.updateDynamic("xHigh")(xHigh.asInstanceOf[js.Any])
    if (xLow != null) __obj.updateDynamic("xLow")(xLow.asInstanceOf[js.Any])
    if (yHigh != null) __obj.updateDynamic("yHigh")(yHigh.asInstanceOf[js.Any])
    if (yLow != null) __obj.updateDynamic("yLow")(yLow.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDataLabels]
  }
}

