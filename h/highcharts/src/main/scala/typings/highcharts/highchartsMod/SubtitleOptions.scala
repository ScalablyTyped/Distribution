package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubtitleOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * subtitle. Can be one of "left", "center" and "right".
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the subtitle is floating,
    * the plot area will not move to make space for it.
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the title.
    *
    * In styled mode, the subtitle style is given in the `.highcharts-subtitle`
    * class.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The subtitle of the chart.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the text.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * title. Can be one of `"top"`, `"middle"` and `"bottom"`. When a value is
    * given, the title behaves as floating.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Adjustment made to the subtitle
    * width, normally to reserve space for the exporting burger menu.
    */
  var widthAdjust: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the subtitle
    * relative to the alignment within `chart.spacingLeft` and
    * `chart.spacingRight`.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the subtitle
    * relative to the alignment within `chart.spacingTop` and
    * `chart.spacingBottom`. By default the subtitle is laid out below the
    * title unless the title is floating.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object SubtitleOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    text: String = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    widthAdjust: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): SubtitleOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (widthAdjust != null) __obj.updateDynamic("widthAdjust")(widthAdjust.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtitleOptions]
  }
}

