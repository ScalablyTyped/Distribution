package typings.highcharts.highchartsMod

import typings.highcharts.highchartsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartParallelAxesLabelsOptions extends js.Object {
  /**
    * (Highcharts) What part of the string the given position is anchored to.
    * Can be one of `"left"`, `"center"` or `"right"`. The exact position also
    * depends on the `labels.x` setting.
    *
    * Angular gauges and solid gauges defaults to `"center"`. Solid gauges with
    * two labels have additional option `"auto"` for automatic horizontal and
    * vertical alignment.
    */
  var align: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
    * of label rotation to prevent overlapping labels. If there is enough
    * space, labels are not rotated. As the chart gets narrower, it will start
    * rotating the labels -45 degrees, then remove every second label and try
    * again with rotations 0 and -45 etc. Set it to `false` to disable
    * rotation, which will cause the labels to word-wrap if possible.
    */
  var autoRotation: js.UndefOr[`false` | js.Array[Double]] = js.undefined
  /**
    * (Highcharts, Gantt) When each category width is more than this many
    * pixels, we don't apply auto rotation. Instead, we lay out the axis label
    * with word wrap. A lower limit makes sense when the label contains
    * multiple short words that don't extend the available horizontal space for
    * each label.
    */
  var autoRotationLimit: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Angular gauges and solid gauges only. The label's pixel
    * distance from the perimeter of the plot area.
    *
    * Since v7.1.2: If it's a percentage string, it is interpreted the same as
    * series.radius, so label can be aligned under the gauge's shape.
    */
  var distance: js.UndefOr[Double | String] = js.undefined
  /**
    * (Highcharts) Enable or disable the axis labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) A format string for the axis label.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Callback JavaScript function to format the label. The value
    * is given by `this.value`. Additional properties for `this` are `axis`,
    * `chart`, `isFirst` and `isLast`. The value of the default label formatter
    * can be retrieved by calling `this.axis.defaultLabelFormatter.call(this)`
    * within the function.
    *
    * Defaults to:
    *
    * (see online documentation for example)
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[AxisLabelsFormatterContextObject]] = js.undefined
  /**
    * (Gantt) The number of pixels to indent the labels per level in a treegrid
    * axis.
    */
  var indentation: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Set options on specific levels in a tree grid axis. Takes
    * precedence over labels options.
    */
  var levels: js.UndefOr[js.Array[ChartParallelAxesLabelsLevelsOptions]] = js.undefined
  /**
    * (Highcharts) Horizontal axis only. When `staggerLines` is not set,
    * `maxStaggerLines` defines how many lines the axis is allowed to add to
    * automatically avoid overlapping X labels. Set to `1` to disable overlap
    * detection.
    */
  var maxStaggerLines: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) How to handle overflowing labels on horizontal axis. If set
    * to `"allow"`, it will not be aligned at all. By default it `"justify"`
    * labels inside the chart area. If there is room to move it, it will be
    * aligned to the edge, else it will be removed.
    */
  var overflow: js.UndefOr[OptionsOverflowValue] = js.undefined
  /**
    * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
    * space between them.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Defines how the labels are be repositioned according to the
    * 3D chart orientation.
    *
    * - `'offset'`: Maintain a fixed horizontal/vertical distance from the tick
    * marks, despite the chart orientation. This is the backwards compatible
    * behavior, and causes skewing of X and Z axes.
    *
    * - `'chart'`: Preserve 3D position relative to the chart. This looks nice,
    * but hard to read if the text isn't forward-facing.
    *
    * - `'flap'`: Rotated text along the axis to compensate for the chart
    * orientation. This tries to maintain text as legible as possible on all
    * orientations.
    *
    * - `'ortho'`: Rotated text along the axis direction so that the labels are
    * orthogonal to the axis. This is very similar to `'flap'`, but prevents
    * skewing the labels (X and Y scaling are still present).
    */
  var position3d: js.UndefOr[OptionsPosition3dValue] = js.undefined
  /**
    * (Highcharts, Gantt) Whether to reserve space for the labels. By default,
    * space is reserved for the labels in these cases:
    *
    * * On all horizontal axes.
    *
    * * On vertical axes if `label.align` is `right` on a left-side axis or
    * `left` on a right-side axis.
    *
    * * On vertical axes if `label.align` is `center`.
    *
    * This can be turned off when for example the labels are rendered inside
    * the plot area instead of outside.
    */
  var reserveSpace: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) If enabled, the axis labels will skewed to follow the
    * perspective.
    *
    * This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.
    *
    * The final appearance depends heavily on `labels.position3d`.
    */
  var skew3d: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Horizontal axes only. The number of lines to spread the
    * labels over to make room or tighter labels.
    */
  var staggerLines: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) To show only every _n_'th label on the axis, set the step to
    * _n_. Setting the step to 2 shows every other label.
    *
    * By default, the step is calculated automatically to avoid overlap. To
    * prevent this, set it to 1\. This usually only happens on a category axis,
    * and is often a sign that you have chosen the wrong axis type.
    *
    * Read more at Axis docs => What axis should I use?
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) CSS styles for the label. Use `whiteSpace: 'nowrap'` to
    * prevent wrapping of category labels. Use `textOverflow: 'none'` to
    * prevent ellipsis (dots).
    *
    * In styled mode, the labels are styled with the `.highcharts-axis-labels`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Gantt) The symbol for the collapse and expand icon in a treegrid.
    */
  var symbol: js.UndefOr[ChartParallelAxesLabelsSymbolOptions] = js.undefined
  /**
    * (Highcharts) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The x position offset of the label relative to the tick
    * position on the axis. Defaults to -15 for left axis, 15 for right axis.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The y position offset of the label relative to the tick
    * position on the axis.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The Z index for the axis labels.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ChartParallelAxesLabelsOptions {
  @scala.inline
  def apply(
    align: String = null,
    autoRotation: `false` | js.Array[Double] = null,
    autoRotationLimit: Int | Double = null,
    distance: Double | String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: FormatterCallbackFunction[AxisLabelsFormatterContextObject] = null,
    indentation: Int | Double = null,
    levels: js.Array[ChartParallelAxesLabelsLevelsOptions] = null,
    maxStaggerLines: Int | Double = null,
    overflow: OptionsOverflowValue = null,
    padding: Int | Double = null,
    position3d: OptionsPosition3dValue = null,
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    skew3d: js.UndefOr[Boolean] = js.undefined,
    staggerLines: Int | Double = null,
    step: Int | Double = null,
    style: CSSObject = null,
    symbol: ChartParallelAxesLabelsSymbolOptions = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null,
    zIndex: Int | Double = null
  ): ChartParallelAxesLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (autoRotation != null) __obj.updateDynamic("autoRotation")(autoRotation.asInstanceOf[js.Any])
    if (autoRotationLimit != null) __obj.updateDynamic("autoRotationLimit")(autoRotationLimit.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (maxStaggerLines != null) __obj.updateDynamic("maxStaggerLines")(maxStaggerLines.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position3d != null) __obj.updateDynamic("position3d")(position3d)
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(skew3d)) __obj.updateDynamic("skew3d")(skew3d)
    if (staggerLines != null) __obj.updateDynamic("staggerLines")(staggerLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartParallelAxesLabelsOptions]
  }
}

