package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisLabels extends js.Object {
  /**
    * What part of the string the given position is anchored to. Can be one of 'left', 'center' or 'right'. Defaults to
    * an intelligent guess based on which side of the chart the axis is on and the rotation of the label.
    * @default 'center' on xAxis, 'right' on yAxis
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For horizontal axes, the allowed degrees of label rotation to prevent overlapping labels. If there is enough
    * space, labels are not rotated. As the chart gets narrower, it will start rotating the labels -45 degrees, then
    * remove every second label and try again with rotations 0 and -45 etc. Set it to false to disable rotation, which
    * will cause the labels to word-wrap if possible.
    * @default [-45]
    * @since 4.1.0
    */
  var autoRotation: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * When each category width is more than this many pixels, we don't apply auto rotation. Instead, we lay out the
    * axis label with word wrap. A lower limit makes sense when the label contains multiple short words that don't
    * extend the available horizontal space for each label.
    * @default 80
    * @since 4.1.5
    */
  var autoRotationLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Polar charts only. The label's pixel distance from the perimeter of the plot area.
    * @default 15
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable or disable the axis labels.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A {@link http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting|format string} for the axis label.
    * @default '{value}'
    * @since 3.0
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback JavaScript function to format the label. The value is given by this.value. Additional properties for
    * this are axis, chart, isFirst and isLast. The value of the default label formatter can be retrieved by calling
    * this.axis.defaultLabelFormatter.call(this) within the function.
    * @default function() {return this.value;}
    */
  var formatter: js.UndefOr[js.ThisFunction0[/* this */ AxisLabelFormatterOptions, java.lang.String]] = js.undefined
  /**
    * Horizontal axis only. When staggerLines is not set, maxStaggerLines defines how many lines the axis is allowed to
    * add to automatically avoid overlapping X labels. Set to 1 to disable overlap detection.
    * @default 5
    * @since 3.0.3
    * @deprecated
    */
  var maxStaggerLines: js.UndefOr[scala.Double] = js.undefined
  /**
    * How to handle overflowing labels on horizontal axis. Can be undefined, false or 'justify'. By default it aligns
    * inside the chart area. If 'justify', labels will not render outside the plot area. If false, it will not be
    * aligned at all. If there is room to move it, it will be aligned to the edge, else it will be removed.
    * @since 2.2.5
    * @deprecated
    */
  var overflow: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * The pixel padding for axis labels, to ensure white space between them.
    * @default 5
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to reserve space for the labels. This can be turned off when for example the labels are rendered inside
    * the plot area instead of outside.
    * @default true
    * @since 4.1.10
    */
  var reserveSpace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Rotation of the labels in degrees.
    * @default 0
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Horizontal axes only. The number of lines to spread the labels over to make room or tighter labels.
    * @since 2.1
    */
  var staggerLines: js.UndefOr[scala.Double] = js.undefined
  /**
    * To show only every n'th label on the axis, set the step to n. Setting the step to 2 shows every other label. By
    * default, the step is calculated automatically to avoid overlap. To prevent this, set it to 1. This usually only
    * happens on a category axis, and is often a sign that you have chosen the wrong axis type.
    * Read more at {@link http://www.highcharts.com/docs/chart-concepts/axes|Axis docs} => What axis should I use?
    * @since 2.1
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for the label. Use whiteSpace: 'nowrap' to prevent wrapping of category labels. Use textOverflow:
    * 'none' to prevent ellipsis (dots).
    * @default {'color':'#6D869F','fontWeight':'bold'}.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * Whether to use HTML to render the labels.
    * @default false
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The x position offset of the label relative to the tick position on the axis.
    * @default 0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position offset of the label relative to the tick position on the axis. The default makes it adapt to the
    * font size on bottom axis.
    * @default null
    */
  var y: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
    * The Z index for the axis labels.
    * @default 7
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object AxisLabels {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    autoRotation: js.Array[scala.Double] = null,
    autoRotationLimit: scala.Int | scala.Double = null,
    distance: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formatter: js.ThisFunction0[/* this */ AxisLabelFormatterOptions, java.lang.String] = null,
    maxStaggerLines: scala.Int | scala.Double = null,
    overflow: java.lang.String | scala.Boolean = null,
    padding: scala.Int | scala.Double = null,
    reserveSpace: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    staggerLines: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null,
    style: CSSObject = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): AxisLabels = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (autoRotation != null) __obj.updateDynamic("autoRotation")(autoRotation)
    if (autoRotationLimit != null) __obj.updateDynamic("autoRotationLimit")(autoRotationLimit.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (maxStaggerLines != null) __obj.updateDynamic("maxStaggerLines")(maxStaggerLines.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (staggerLines != null) __obj.updateDynamic("staggerLines")(staggerLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabels]
  }
}

