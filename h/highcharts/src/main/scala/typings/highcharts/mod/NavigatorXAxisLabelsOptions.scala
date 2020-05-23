package typings.highcharts.mod

import typings.highcharts.highchartsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisLabelsOptions extends js.Object {
  /**
    * (Highstock, Gantt) What part of the string the given position is anchored
    * to. If `left`, the left side of the string is at the axis position. Can
    * be one of `"left"`, `"center"` or `"right"`. Defaults to an intelligent
    * guess based on which side of the chart the axis is on and the rotation of
    * the label.
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
    * (Highcharts, Gantt) Polar charts only. The label's pixel distance from
    * the perimeter of the plot area.
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) Enable or disable the axis labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) A format string for the axis label.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highstock, Gantt) Callback JavaScript function to format the label. The
    * value is given by `this.value`. Additional properties for `this` are
    * `axis`, `chart`, `isFirst` and `isLast`. The value of the default label
    * formatter can be retrieved by calling
    * `this.axis.defaultLabelFormatter.call(this)` within the function.
    *
    * Defaults to: (see online documentation for example)
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[AxisLabelsFormatterContextObject]] = js.undefined
  /**
    * (Gantt) The number of pixels to indent the labels per level in a treegrid
    * axis.
    */
  var indentation: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) How to handle overflowing labels on horizontal axis.
    * If set to `"allow"`, it will not be aligned at all. By default it
    * `"justify"` labels inside the chart area. If there is room to move it, it
    * will be aligned to the edge, else it will be removed.
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
    * (Highstock, Gantt) Rotation of the labels in degrees.
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
    * (Highstock, Gantt) Horizontal axes only. The number of lines to spread
    * the labels over to make room or tighter labels.
    */
  var staggerLines: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) To show only every _n_'th label on the axis, set the
    * step to _n_. Setting the step to 2 shows every other label.
    *
    * By default, the step is calculated automatically to avoid overlap. To
    * prevent this, set it to 1\. This usually only happens on a category axis,
    * and is often a sign that you have chosen the wrong axis type.
    *
    * Read more at Axis docs => What axis should I use?
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) CSS styles for the label. Use `whiteSpace: 'nowrap'`
    * to prevent wrapping of category labels. Use `textOverflow: 'none'` to
    * prevent ellipsis (dots).
    *
    * In styled mode, the labels are styled with the `.highcharts-axis-labels`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highstock, Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) The x position offset of the label relative to the
    * tick position on the axis.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The y position offset of the label relative to the
    * tick position on the axis. The default makes it adapt to the font size on
    * bottom axis.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The Z index for the axis labels.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigatorXAxisLabelsOptions {
  @scala.inline
  def apply(
    align: String = null,
    autoRotation: `false` | js.Array[Double] = null,
    autoRotationLimit: js.UndefOr[Double] = js.undefined,
    distance: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: FormatterCallbackFunction[AxisLabelsFormatterContextObject] = null,
    indentation: js.UndefOr[Double] = js.undefined,
    overflow: OptionsOverflowValue = null,
    padding: js.UndefOr[Double] = js.undefined,
    position3d: OptionsPosition3dValue = null,
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    skew3d: js.UndefOr[Boolean] = js.undefined,
    staggerLines: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    style: CSSObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): NavigatorXAxisLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (autoRotation != null) __obj.updateDynamic("autoRotation")(autoRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRotationLimit)) __obj.updateDynamic("autoRotationLimit")(autoRotationLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(indentation)) __obj.updateDynamic("indentation")(indentation.get.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (position3d != null) __obj.updateDynamic("position3d")(position3d.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skew3d)) __obj.updateDynamic("skew3d")(skew3d.get.asInstanceOf[js.Any])
    if (!js.isUndefined(staggerLines)) __obj.updateDynamic("staggerLines")(staggerLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisLabelsOptions]
  }
}

