package typings.highcharts.mod

import typings.highcharts.highchartsStrings.exportIcon
import typings.highcharts.highchartsStrings.menu
import typings.highcharts.highchartsStrings.menuball
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportingButtonsOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Alignment for the buttons.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel spacing between
    * buttons.
    */
  var buttonSpacing: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
    * button.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Pixel height of the buttons.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
    * appearing from the button.
    */
  var menuClassName: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
    * to config options for the menu items. The config options are defined in
    * the `menuItemDefinitions` option.
    *
    * By default, there is the "View in full screen" and "Print" menu items,
    * plus one menu item for each of the available export types.
    */
  var menuItems: js.UndefOr[js.Array[String]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
    * on the button directly instead of the popup menu.
    */
  var onclick: js.UndefOr[js.Function] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
    * Points to a definition function in the `Highcharts.Renderer.symbols`
    * collection. The default `exportIcon` function is part of the exporting
    * module. Possible values are "circle", "square", "diamond", "triangle",
    * "triangle-down", "menu", "menuball" or custom shape.
    */
  var symbol: js.UndefOr[menu | menuball | exportIcon | String | SymbolKeyValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) See
    * navigation.buttonOptions.symbolFill.
    */
  var symbolFill: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel size of the symbol on
    * the button.
    */
  var symbolSize: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the symbol's stroke
    * or line.
    */
  var symbolStroke: js.UndefOr[ColorString] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel stroke width of the
    * symbol on the button.
    */
  var symbolStrokeWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position of the center of
    * the symbol inside the button.
    */
  var symbolX: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position of the center of
    * the symbol inside the button.
    */
  var symbolY: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
    * individual button.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A configuration object for the
    * button theme. The object accepts SVG properties like `stroke-width`,
    * `stroke` and `fill`. Tri-state button styles are supported by the
    * `states.hover` and `states.select` objects.
    */
  var theme: js.UndefOr[ExportingButtonsContextButtonThemeOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
    * that is used for the button's title tooltip. When the key is
    * `contextButtonTitle`, it refers to lang.contextButtonTitle that defaults
    * to "Chart context menu".
    */
  var titleKey: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * buttons. Can be one of `"top"`, `"middle"` or `"bottom"`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the button.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
    * button relative to the `align` option.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button's position relative to its `verticalAlign`.
    */
  var y: js.UndefOr[Double] = js.native
}

object ExportingButtonsOptionsObject {
  @scala.inline
  def apply(): ExportingButtonsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsOptionsObject]
  }
  @scala.inline
  implicit class ExportingButtonsOptionsObjectOps[Self <: ExportingButtonsOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setButtonSpacing(value: Double): Self = this.set("buttonSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonSpacing: Self = this.set("buttonSpacing", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMenuClassName(value: String): Self = this.set("menuClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuClassName: Self = this.set("menuClassName", js.undefined)
    @scala.inline
    def setMenuItemsVarargs(value: String*): Self = this.set("menuItems", js.Array(value :_*))
    @scala.inline
    def setMenuItems(value: js.Array[String]): Self = this.set("menuItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItems: Self = this.set("menuItems", js.undefined)
    @scala.inline
    def setOnclick(value: js.Function): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setSymbol(value: menu | menuball | exportIcon | String | SymbolKeyValue): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbolFill(value: ColorString): Self = this.set("symbolFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolFill: Self = this.set("symbolFill", js.undefined)
    @scala.inline
    def setSymbolSize(value: Double): Self = this.set("symbolSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolSize: Self = this.set("symbolSize", js.undefined)
    @scala.inline
    def setSymbolStroke(value: ColorString): Self = this.set("symbolStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolStroke: Self = this.set("symbolStroke", js.undefined)
    @scala.inline
    def setSymbolStrokeWidth(value: Double): Self = this.set("symbolStrokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolStrokeWidth: Self = this.set("symbolStrokeWidth", js.undefined)
    @scala.inline
    def setSymbolX(value: Double): Self = this.set("symbolX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolX: Self = this.set("symbolX", js.undefined)
    @scala.inline
    def setSymbolY(value: Double): Self = this.set("symbolY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolY: Self = this.set("symbolY", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTheme(value: ExportingButtonsContextButtonThemeOptions): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitleKey(value: String): Self = this.set("titleKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleKey: Self = this.set("titleKey", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

