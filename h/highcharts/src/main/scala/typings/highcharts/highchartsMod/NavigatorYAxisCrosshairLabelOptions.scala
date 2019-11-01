package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorYAxisCrosshairLabelOptions extends js.Object {
  /**
    * (Highstock) Alignment of the label compared to the axis. Defaults to
    * `"left"` for right-side axes, `"right"` for left-side axes and `"center"`
    * for horizontal axes.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highstock) The background color for the label. Defaults to the related
    * series color, or `#666666` if that is not available.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The border color for the crosshair label
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highstock) The border corner radius of the crosshair label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The border width for the crosshair label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Flag to enable crosshair's label.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highstock) A format string for the crosshair label. Defaults to
    * `{value}` for numeric axes and `{value:%b %d, %Y}` for datetime axes.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Formatter function for the label text.
    */
  var formatter: js.UndefOr[XAxisCrosshairLabelFormatterCallbackFunction] = js.undefined
  /**
    * (Highstock) Padding inside the crosshair label.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) The shape to use for the label box.
    */
  var shape: js.UndefOr[String] = js.undefined
  /**
    * (Highstock) Text styles for the crosshair label.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object NavigatorYAxisCrosshairLabelOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: XAxisCrosshairLabelFormatterCallbackFunction = null,
    padding: Int | Double = null,
    shape: String = null,
    style: CSSObject = null
  ): NavigatorYAxisCrosshairLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NavigatorYAxisCrosshairLabelOptions]
  }
}

