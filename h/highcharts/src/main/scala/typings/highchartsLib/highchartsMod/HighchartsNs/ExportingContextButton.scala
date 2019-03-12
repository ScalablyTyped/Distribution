package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingContextButton extends Button {
  /**
    * A collection of config options for the menu items. Each options object consists of a text option which is a
    * string to show in the menu item, as well as an onclick parameter which is a callback function to run on click.
    *
    * By default, there is the 'Print' menu item plus one menu item for each of the available export types. Menu items
    * can be customized by defining a new array of items and assigning null to unwanted positions.
    * @since 2.0
    */
  var menuItems: js.UndefOr[js.Array[java.lang.String] | js.Array[MenuItem]] = js.undefined
  /**
    * A click handler callback to use on the button directly instead of the popup menu.
    * @since 2.0
    */
  var onclick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The symbol for the button. Points to a definition function in the Highcharts.Renderer.symbols collection. The
    * default exportIcon function is part of the exporting module.
    * @default 'menu'
    */
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The horizontal position of the button relative to the align option.
    * @default -10
    */
  var x: js.UndefOr[scala.Double] = js.undefined
}

object ExportingContextButton {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    menuItems: js.Array[java.lang.String] | js.Array[MenuItem] = null,
    onclick: () => scala.Unit = null,
    symbol: java.lang.String = null,
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
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ExportingContextButton = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction0(onclick))
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
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
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportingContextButton]
  }
}

