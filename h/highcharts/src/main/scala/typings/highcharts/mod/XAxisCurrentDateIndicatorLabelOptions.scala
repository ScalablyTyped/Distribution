package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxisCurrentDateIndicatorLabelOptions extends js.Object {
  /**
    * (Gantt) Horizontal alignment of the label. Can be one of "left", "center"
    * or "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Gantt) Format of the label. This options is passed as the fist argument
    * to dateFormat function.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) Callback JavaScript function to format the label. Useful
    * properties like the value of plot line or the range of plot band (`from`
    * & `to` properties) can be found in `this.options` object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[PlotLineOrBand]] = js.undefined
  /**
    * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
    * horizontal plot lines and 90 for vertical lines.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-line-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Gantt) The text itself. A subset of HTML is supported.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Gantt) The text alignment for the label. While `align` determines where
    * the texts anchor point is placed within the plot band, `textAlign`
    * determines how the text is aligned against its anchor point. Possible
    * values are "left", "center" and "right". Defaults to the same as the
    * `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gantt) Vertical alignment of the label relative to the plot line. Can be
    * one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Gantt) Horizontal position relative the alignment. Default varies by
    * orientation.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Gantt) Vertical position of the text baseline relative to the alignment.
    * Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object XAxisCurrentDateIndicatorLabelOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    format: String = null,
    formatter: FormatterCallbackFunction[PlotLineOrBand] = null,
    rotation: Int | Double = null,
    style: CSSObject = null,
    text: String = null,
    textAlign: AlignValue = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): XAxisCurrentDateIndicatorLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxisCurrentDateIndicatorLabelOptions]
  }
}

