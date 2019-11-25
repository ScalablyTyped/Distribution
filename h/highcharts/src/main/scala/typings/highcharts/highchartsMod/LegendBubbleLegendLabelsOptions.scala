package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendBubbleLegendLabelsOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) The alignment of the labels compared to
    * the bubble legend. Can be one of `left`, `center` or `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Whether to allow data labels to
    * overlap.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) An additional class name to apply to
    * the bubble legend label graphical elements. This option does not replace
    * default class names of the graphical element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) A format string for the bubble legend
    * labels. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) Available `this` properties are:
    *
    * - `this.value`: The bubble value.
    *
    * - `this.radius`: The radius of the bubble range.
    *
    * - `this.center`: The center y position of the range.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[BubbleLegendFormatterContextObject]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) CSS styles for the labels.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The x position offset of the label
    * relative to the connector.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The y position offset of the label
    * relative to the connector.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegendLabelsOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    format: String = null,
    formatter: FormatterCallbackFunction[BubbleLegendFormatterContextObject] = null,
    style: CSSObject = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): LegendBubbleLegendLabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendBubbleLegendLabelsOptions]
  }
}

