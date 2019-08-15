package typings.highcharts.highchartsMod

import typings.highcharts.highchartsStrings.exportIcon
import typings.highcharts.highchartsStrings.menu
import typings.highcharts.highchartsStrings.menuball
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingButtonsContextButtonOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
    * button.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
    * appearing from the button.
    */
  var menuClassName: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
    * to config options for the menu items. The config options are defined in
    * the `menuItemDefinitions` option.
    *
    * By default, there is the "View in full screen" and "Print" menu items,
    * plus one menu item for each of the available export types.
    */
  var menuItems: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
    * on the button directly instead of the popup menu.
    */
  var onclick: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
    * Points to a definition function in the `Highcharts.Renderer.symbols`
    * collection. The default `exportIcon` function is part of the exporting
    * module. Possible values are "circle", "square", "diamond", "triangle",
    * "triangle-down", "menu", "menuball" or custom shape.
    */
  var symbol: js.UndefOr[menu | menuball | exportIcon | String | SymbolKeyValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) See
    * navigation.buttonOptions.symbolFill.
    */
  var symbolFill: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
    * or line.
    */
  var symbolStroke: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * symbol on the button.
    */
  var symbolStrokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
    * individual button.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
    * button theme. The object accepts SVG properties like `stroke-width`,
    * `stroke` and `fill`. Tri-state button styles are supported by the
    * `states.hover` and `states.select` objects.
    */
  var theme: js.UndefOr[ExportingButtonsContextButtonThemeOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
    * that is used for the button's title tooltip. When the key is
    * `contextButtonTitle`, it refers to lang.contextButtonTitle that defaults
    * to "Chart context menu".
    */
  var titleKey: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
    * button relative to the `align` option.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button's position relative to its `verticalAlign`.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ExportingButtonsContextButtonOptions {
  @scala.inline
  def apply(
    className: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    menuClassName: String = null,
    menuItems: js.Array[String] = null,
    onclick: js.Function = null,
    symbol: menu | menuball | exportIcon | String | SymbolKeyValue = null,
    symbolFill: ColorString = null,
    symbolStroke: ColorString = null,
    symbolStrokeWidth: Int | Double = null,
    text: String = null,
    theme: ExportingButtonsContextButtonThemeOptions = null,
    titleKey: String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): ExportingButtonsContextButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (menuClassName != null) __obj.updateDynamic("menuClassName")(menuClassName)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (symbolFill != null) __obj.updateDynamic("symbolFill")(symbolFill)
    if (symbolStroke != null) __obj.updateDynamic("symbolStroke")(symbolStroke)
    if (symbolStrokeWidth != null) __obj.updateDynamic("symbolStrokeWidth")(symbolStrokeWidth.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (titleKey != null) __obj.updateDynamic("titleKey")(titleKey)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportingButtonsContextButtonOptions]
  }
}

