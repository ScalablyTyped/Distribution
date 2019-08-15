package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesNetworkgraphDataLabelsOptionsObject extends DataLabelsOptionsObject {
  /**
    * Callback JavaScript function to format the data label for a node. Note
    * that if a `format` is defined, the format takes precedence and the
    * formatter is ignored.
    */
  @JSName("formatter")
  var formatter_SeriesNetworkgraphDataLabelsOptionsObject: js.UndefOr[SeriesNetworkgraphDataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * The format string specifying what to show for _links_ in the
    * networkgraph. (Default: `undefined`)
    */
  var linkFormat: js.UndefOr[String] = js.undefined
  /**
    * Callback to format data labels for _links_ in the sankey diagram. The
    * `linkFormat` option takes precedence over the `linkFormatter`.
    */
  var linkFormatter: js.UndefOr[SeriesNetworkgraphDataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * Options for a _link_ label text which should follow link connection.
    * Border and background are disabled for a label that follows a path.
    * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
    * to true will disable this option.
    */
  var linkTextPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.undefined
}

object SeriesNetworkgraphDataLabelsOptionsObject {
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
    formatter: SeriesNetworkgraphDataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    linkFormat: String = null,
    linkFormatter: SeriesNetworkgraphDataLabelsFormatterCallbackFunction = null,
    linkTextPath: DataLabelsTextPathOptionsObject = null,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: Int | Double = null,
    rotation: Int | Double = null,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    textPath: DataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zIndex: Int | Double = null
  ): SeriesNetworkgraphDataLabelsOptionsObject = {
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
    if (linkFormat != null) __obj.updateDynamic("linkFormat")(linkFormat)
    if (linkFormatter != null) __obj.updateDynamic("linkFormatter")(linkFormatter)
    if (linkTextPath != null) __obj.updateDynamic("linkTextPath")(linkTextPath)
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SeriesNetworkgraphDataLabelsOptionsObject]
  }
}

