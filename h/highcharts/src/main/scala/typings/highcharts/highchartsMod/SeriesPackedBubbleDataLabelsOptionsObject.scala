package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesPackedBubbleDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Callback JavaScript function to format the data label for a node. Note
    * that if a `format` is defined, the format takes precedence and the
    * formatter is ignored.
    */
  @JSName("formatter")
  var formatter_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsFormatterCallbackFunction] = js.undefined
  var parentNodeFormat: js.UndefOr[String] = js.undefined
  /**
    * Callback to format data labels for _parentNodes_. The `parentNodeFormat`
    * option takes precedence over the `parentNodeFormatter`.
    */
  var parentNodeFormatter: js.UndefOr[FormatterCallbackFunction[DataLabelsFormatterContextObject]] = js.undefined
  /**
    * Options for a _parentNode_ label text.
    */
  var parentNodeTextPath: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.undefined
  /**
    * Options for a _node_ label text which should follow marker's shape.
    * **Note:** Only SVG-based renderer supports this option.
    */
  @JSName("textPath")
  var textPath_SeriesPackedBubbleDataLabelsOptionsObject: js.UndefOr[SeriesPackedBubbleDataLabelsTextPathOptionsObject] = js.undefined
}

object SeriesPackedBubbleDataLabelsOptionsObject {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: DataLabelsFilterOptionsObject = null,
    format: String = null,
    formatter: SeriesPackedBubbleDataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: Int | Double = null,
    parentNodeFormat: String = null,
    parentNodeFormatter: FormatterCallbackFunction[DataLabelsFormatterContextObject] = null,
    parentNodeTextPath: SeriesPackedBubbleDataLabelsTextPathOptionsObject = null,
    rotation: Int | Double = null,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    textPath: SeriesPackedBubbleDataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zIndex: Int | Double = null
  ): SeriesPackedBubbleDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parentNodeFormat != null) __obj.updateDynamic("parentNodeFormat")(parentNodeFormat)
    if (parentNodeFormatter != null) __obj.updateDynamic("parentNodeFormatter")(parentNodeFormatter)
    if (parentNodeTextPath != null) __obj.updateDynamic("parentNodeTextPath")(parentNodeTextPath)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textPath != null) __obj.updateDynamic("textPath")(textPath)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesPackedBubbleDataLabelsOptionsObject]
  }
}

