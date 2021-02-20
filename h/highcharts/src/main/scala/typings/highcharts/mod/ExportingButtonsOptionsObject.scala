package typings.highcharts.mod

import typings.highcharts.highchartsStrings.exportIcon
import typings.highcharts.highchartsStrings.menu
import typings.highcharts.highchartsStrings.menuball
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingButtonsOptionsObject extends StObject {
  
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
  implicit class ExportingButtonsOptionsObjectMutableBuilder[Self <: ExportingButtonsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setButtonSpacing(value: Double): Self = StObject.set(x, "buttonSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonSpacingUndefined: Self = StObject.set(x, "buttonSpacing", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
    
    @scala.inline
    def setMenuItems(value: js.Array[String]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    @scala.inline
    def setMenuItemsVarargs(value: String*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    
    @scala.inline
    def setOnclick(value: js.Function): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setSymbol(value: menu | menuball | exportIcon | String | SymbolKeyValue): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolFill(value: ColorString): Self = StObject.set(x, "symbolFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolFillUndefined: Self = StObject.set(x, "symbolFill", js.undefined)
    
    @scala.inline
    def setSymbolSize(value: Double): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
    
    @scala.inline
    def setSymbolStroke(value: ColorString): Self = StObject.set(x, "symbolStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolStrokeUndefined: Self = StObject.set(x, "symbolStroke", js.undefined)
    
    @scala.inline
    def setSymbolStrokeWidth(value: Double): Self = StObject.set(x, "symbolStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolStrokeWidthUndefined: Self = StObject.set(x, "symbolStrokeWidth", js.undefined)
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setSymbolX(value: Double): Self = StObject.set(x, "symbolX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolXUndefined: Self = StObject.set(x, "symbolX", js.undefined)
    
    @scala.inline
    def setSymbolY(value: Double): Self = StObject.set(x, "symbolY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolYUndefined: Self = StObject.set(x, "symbolY", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTheme(value: ExportingButtonsContextButtonThemeOptions): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitleKey(value: String): Self = StObject.set(x, "titleKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleKeyUndefined: Self = StObject.set(x, "titleKey", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
