package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  /**
    * Alignment for the buttons.
    * @default 'right'
    * @since 2.0
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to enable buttons.
    * @default true
    * @since 2.0
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pixel height of the buttons.
    * @default 20
    * @since 2.0
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Fill color for the symbol within the button.
    * @default '#E0E0E0'
    * @since 2.0
    */
  var symbolFill: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel size of the symbol on the button.
    * @default 14
    * @since 2.0
    */
  var symbolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the symbol's stroke or line.
    * @default '#666'
    * @since 2.0
    */
  var symbolStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel stroke width of the symbol on the button.
    * @default 1
    * @since 2.0
    */
  var symbolStrokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x position of the center of the symbol inside the button.
    * @default 12.5
    * @since 2.0
    */
  var symbolX: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position of the center of the symbol inside the button.
    * @default 10.5
    * @since 2.0
    */
  var symbolY: js.UndefOr[scala.Double] = js.undefined
  /**
    * A text string to add to the individual button.
    * @default null
    * @since 3.0
    */
  var text: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A configuration object for the button theme. The object accepts SVG properties like stroke-width, stroke and
    * fill. Tri-state button styles are supported by the states.hover and states.select objects.
    * @since 3.0
    */
  var theme: js.UndefOr[ButtonStatesTheme] = js.undefined
  /**
    * The vertical alignment of the buttons. Can be one of 'top', 'middle' or 'bottom'.
    * @default 'top'
    * @since 2.0
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pixel width of the button.
    * @default 24
    * @since 2.0
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical offset of the button's position relative to its verticalAlign.
    * @default 0
    * @since 2.0
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Button {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    symbolFill: java.lang.String = null,
    symbolSize: scala.Int | scala.Double = null,
    symbolStroke: java.lang.String = null,
    symbolStrokeWidth: scala.Int | scala.Double = null,
    symbolX: scala.Int | scala.Double = null,
    symbolY: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    theme: ButtonStatesTheme = null,
    verticalAlign: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Button = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (symbolFill != null) __obj.updateDynamic("symbolFill")(symbolFill)
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (symbolStroke != null) __obj.updateDynamic("symbolStroke")(symbolStroke)
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (symbolX != null) __obj.updateDynamic("symbolX")(symbolX.asInstanceOf[js.Any])
    if (symbolY != null) __obj.updateDynamic("symbolY")(symbolY.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
}

