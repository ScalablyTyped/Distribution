package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorXAxisPlotBandsLabelOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) Horizontal alignment of the label. Can be
    * one of "left", "center" or "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Rotation of the text label in degrees .
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-band-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The string text itself. A subset of HTML
    * is supported.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) The text alignment for the label. While
    * `align` determines where the texts anchor point is placed within the plot
    * band, `textAlign` determines how the text is aligned against its anchor
    * point. Possible values are "left", "center" and "right". Defaults to the
    * same as the `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Vertical alignment of the label relative
    * to the plot band. Can be one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Horizontal position relative the
    * alignment. Default varies by orientation.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Vertical position of the text baseline
    * relative to the alignment. Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object NavigatorXAxisPlotBandsLabelOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    rotation: Int | Double = null,
    style: CSSObject = null,
    text: String = null,
    textAlign: AlignValue = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): NavigatorXAxisPlotBandsLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorXAxisPlotBandsLabelOptions]
  }
}

