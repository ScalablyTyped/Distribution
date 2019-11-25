package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.chart_
import typings.highcharts.highchartsStrings.flap
import typings.highcharts.highchartsStrings.ortho
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisTitleOptions extends js.Object {
  /**
    * (Highstock, Gantt) Alignment of the title relative to the axis values.
    * Possible values are "low", "middle" or "high".
    */
  var align: js.UndefOr[AxisTitleAlignValue] = js.undefined
  /**
    * (Highstock, Gantt) The pixel distance between the axis labels and the
    * title. Positive values are outside the axis line, negative are inside.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock, Gantt) The distance of the axis title from the axis line. By
    * default, this distance is computed from the offset width of the labels,
    * the labels' distance from the axis and the title's margin. However when
    * the offset option is set, it overrides all this.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Defines how the title is repositioned according to the 3D
    * chart orientation.
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
    *
    * - `undefined`: Will use the config from `labels.position3d`
    */
  var position3d: js.UndefOr[chart_ | flap | typings.highcharts.highchartsStrings.offset | ortho | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to reserve space for the title
    * when laying out the axis.
    */
  var reserveSpace: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock, Gantt) The rotation of the text in degrees. 0 is horizontal,
    * 270 is vertical reading from bottom to top.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) If enabled, the axis title will skewed to follow the
    * perspective.
    *
    * This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.
    *
    * The final appearance depends heavily on `title.position3d`.
    *
    * A `null` value will use the config from `labels.skew3d`.
    */
  var skew3d: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * (Highstock, Gantt) CSS styles for the title. If the title text is longer
    * than the axis length, it will wrap to multiple lines by default. This can
    * be customized by setting `textOverflow: 'ellipsis'`, by setting a
    * specific `width` or by setting `whiteSpace: 'nowrap'`.
    *
    * In styled mode, the stroke width is given in the `.highcharts-axis-title`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The actual text of the axis title.
    * Horizontal texts can contain HTML, but rotated texts are painted using
    * vector techniques and must be clean text. The Y axis title is disabled by
    * setting the `text` option to `undefined`.
    */
  var text: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highstock, Gantt) Alignment of the text, can be `"left"`, `"right"` or
    * `"center"`. Default alignment depends on the title.align:
    *
    * Horizontal axes:
    *
    * - for `align` = `"low"`, `textAlign` is set to `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"`, `textAlign` is set to `right`
    *
    * Vertical axes:
    *
    * - for `align` = `"low"` and `opposite` = `true`, `textAlign` is set to
    * `right`
    *
    * - for `align` = `"low"` and `opposite` = `false`, `textAlign` is set to
    * `left`
    *
    * - for `align` = `"middle"`, `textAlign` is set to `center`
    *
    * - for `align` = `"high"` and `opposite` = `true` `textAlign` is set to
    * `left`
    *
    * - for `align` = `"high"` and `opposite` = `false` `textAlign` is set to
    * `right`
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to use HTML to render the axis
    * title.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Horizontal pixel offset of the title
    * position.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Vertical pixel offset of the title
    * position.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisTitleOptions {
  @scala.inline
  def apply(
    align: AxisTitleAlignValue = null,
    margin: Int | Double = null,
    offset: Int | Double = null,
    position3d: chart_ | flap | typings.highcharts.highchartsStrings.offset | ortho = null,
    reserveSpace: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    skew3d: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    text: js.Any = null,
    textAlign: AlignValue = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): NavigatorYAxisTitleOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position3d != null) __obj.updateDynamic("position3d")(position3d.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(skew3d)) __obj.updateDynamic("skew3d")(skew3d.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorYAxisTitleOptions]
  }
}

