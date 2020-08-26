package typings.highcharts.mod

import typings.highcharts.highchartsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorYAxisLabelsOptions extends js.Object {
  /**
    * (Highstock, Gantt) What part of the string the given position is anchored
    * to. Can be one of `"left"`, `"center"` or `"right"`. The exact position
    * also depends on the `labels.x` setting.
    *
    * Angular gauges and solid gauges defaults to `"center"`. Solid gauges with
    * two labels have additional option `"auto"` for automatic horizontal and
    * vertical alignment.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For horizontal axes, the allowed degrees
    * of label rotation to prevent overlapping labels. If there is enough
    * space, labels are not rotated. As the chart gets narrower, it will start
    * rotating the labels -45 degrees, then remove every second label and try
    * again with rotations 0 and -45 etc. Set it to `false` to disable
    * rotation, which will cause the labels to word-wrap if possible.
    */
  var autoRotation: js.UndefOr[`false` | js.Array[Double]] = js.native
  /**
    * (Highcharts, Gantt) When each category width is more than this many
    * pixels, we don't apply auto rotation. Instead, we lay out the axis label
    * with word wrap. A lower limit makes sense when the label contains
    * multiple short words that don't extend the available horizontal space for
    * each label.
    */
  var autoRotationLimit: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Angular gauges and solid gauges only. The label's pixel
    * distance from the perimeter of the plot area.
    *
    * Since v7.1.2: If it's a percentage string, it is interpreted the same as
    * series.radius, so label can be aligned under the gauge's shape.
    */
  var distance: js.UndefOr[Double | String] = js.native
  /**
    * (Highstock, Gantt) Enable or disable the axis labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) A format string for the axis label.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highstock, Gantt) Callback JavaScript function to format the label. The
    * value is given by `this.value`. Additional properties for `this` are
    * `axis`, `chart`, `isFirst` and `isLast`. The value of the default label
    * formatter can be retrieved by calling
    * `this.axis.defaultLabelFormatter.call(this)` within the function.
    *
    * Defaults to: (see online documentation for example)
    */
  var formatter: js.UndefOr[AxisLabelsFormatterCallbackFunction] = js.native
  /**
    * (Gantt) The number of pixels to indent the labels per level in a treegrid
    * axis.
    */
  var indentation: js.UndefOr[Double] = js.native
  /**
    * (Gantt) Set options on specific levels in a tree grid axis. Takes
    * precedence over labels options.
    */
  var levels: js.UndefOr[js.Array[NavigatorYAxisLabelsLevelsOptions]] = js.native
  /**
    * (Highstock, Gantt) How to handle overflowing labels on horizontal axis.
    * If set to `"allow"`, it will not be aligned at all. By default it
    * `"justify"` labels inside the chart area. If there is room to move it, it
    * will be aligned to the edge, else it will be removed.
    */
  var overflow: js.UndefOr[OptionsOverflowValue] = js.native
  /**
    * (Highcharts, Gantt) The pixel padding for axis labels, to ensure white
    * space between them.
    */
  var padding: js.UndefOr[Double] = js.native
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
  var position3d: js.UndefOr[OptionsPosition3dValue] = js.native
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
  var reserveSpace: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Rotation of the labels in degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) If enabled, the axis labels will skewed to follow the
    * perspective.
    *
    * This will fix overlapping labels and titles, but texts become less
    * legible due to the distortion.
    *
    * The final appearance depends heavily on `labels.position3d`.
    */
  var skew3d: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) Horizontal axes only. The number of lines to spread
    * the labels over to make room or tighter labels.
    */
  var staggerLines: js.UndefOr[Double] = js.native
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
  var step: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) CSS styles for the label. Use `whiteSpace: 'nowrap'`
    * to prevent wrapping of category labels. Use `textOverflow: 'none'` to
    * prevent ellipsis (dots).
    *
    * In styled mode, the labels are styled with the `.highcharts-axis-labels`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  /**
    * (Gantt) The symbol for the collapse and expand icon in a treegrid.
    */
  var symbol: js.UndefOr[NavigatorYAxisLabelsSymbolOptions] = js.native
  /**
    * (Highstock, Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock, Gantt) The x position offset of the label relative to the
    * tick position on the axis. Defaults to -15 for left axis, 15 for right
    * axis.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The y position offset of the label relative to the
    * tick position on the axis.
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * (Highstock, Gantt) The Z index for the axis labels.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object NavigatorYAxisLabelsOptions {
  @scala.inline
  def apply(): NavigatorYAxisLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorYAxisLabelsOptions]
  }
  @scala.inline
  implicit class NavigatorYAxisLabelsOptionsOps[Self <: NavigatorYAxisLabelsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutoRotationVarargs(value: Double*): Self = this.set("autoRotation", js.Array(value :_*))
    @scala.inline
    def setAutoRotation(value: `false` | js.Array[Double]): Self = this.set("autoRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRotation: Self = this.set("autoRotation", js.undefined)
    @scala.inline
    def setAutoRotationLimit(value: Double): Self = this.set("autoRotationLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRotationLimit: Self = this.set("autoRotationLimit", js.undefined)
    @scala.inline
    def setDistance(value: Double | String): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: AxisLabelsFormatterCallbackFunction): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setIndentation(value: Double): Self = this.set("indentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentation: Self = this.set("indentation", js.undefined)
    @scala.inline
    def setLevelsVarargs(value: NavigatorYAxisLabelsLevelsOptions*): Self = this.set("levels", js.Array(value :_*))
    @scala.inline
    def setLevels(value: js.Array[NavigatorYAxisLabelsLevelsOptions]): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setOverflow(value: OptionsOverflowValue): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPosition3d(value: OptionsPosition3dValue): Self = this.set("position3d", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition3d: Self = this.set("position3d", js.undefined)
    @scala.inline
    def setReserveSpace(value: Boolean): Self = this.set("reserveSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserveSpace: Self = this.set("reserveSpace", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSkew3d(value: Boolean): Self = this.set("skew3d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkew3d: Self = this.set("skew3d", js.undefined)
    @scala.inline
    def setStaggerLines(value: Double): Self = this.set("staggerLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggerLines: Self = this.set("staggerLines", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSymbol(value: NavigatorYAxisLabelsSymbolOptions): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

