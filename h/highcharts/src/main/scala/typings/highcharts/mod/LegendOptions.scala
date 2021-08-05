package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * legend. Requires the Accessibility module.
    */
  var accessibility: js.UndefOr[LegendAccessibilityOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * legend box within the chart area. Valid values are `left`, `center` and
    * `right`.
    *
    * In the case that the legend is aligned in a corner position, the `layout`
    * option will determine whether to place it above/below or on the side of
    * the plot area.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the layout is `horizontal`
    * and the legend items span over two lines or more, whether to align the
    * items into vertical columns. Setting this to `false` makes room for more
    * items, but will look more messy.
    */
  var alignColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
    * legend.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
    * around the legend.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
    * legend.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
    * around the legend.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
    * element in legend which presents the scale of the bubble series.
    * Individual bubble ranges can be defined by user or calculated from
    * series. In the case of automatically calculated ranges, a 1px margin of
    * error is permitted.
    */
  var bubbleLegend: js.UndefOr[LegendBubbleLegendOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
    * There is also a series-specific option, showInLegend, that can hide the
    * series from the legend. In some series types this is `false` by default,
    * so it must set to `true` in order to show the legend for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
    * plot area ignores it and is allowed to be placed below it.
    */
  var floating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
    * next to a legend item when `showCheckbox` is true.
    */
  var itemCheckboxStyle: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
    * layout, the itemDistance defines the pixel distance between each item.
    */
  var itemDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * when the corresponding series or point is hidden. Only a subset of CSS is
    * supported, notably those options related to text. Properties are
    * inherited from `style` unless overridden here.
    */
  var itemHiddenStyle: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * in hover mode. Only a subset of CSS is supported, notably those options
    * related to text. Properties are inherited from `style` unless overridden
    * here.
    */
  var itemHoverStyle: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
    * legend item.
    */
  var itemMarginBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
    * legend item.
    */
  var itemMarginTop: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
    * Only a subset of CSS is supported, notably those options related to text.
    * The default `textOverflow` property makes long texts truncate. Set it to
    * `undefined` to wrap text instead. A `width` property can be added to
    * control the text width.
    */
  var itemStyle: js.UndefOr[CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
    * By default the items are laid out successively. In a horizontal layout,
    * if the items are laid out across two rows or more, they will be
    * vertically aligned depending on the legend.alignColumns option.
    */
  var itemWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
    * label. Available variables relates to properties on the series, or the
    * point in case of pies.
    */
  var labelFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
    * of the series' labels. The `this` keyword refers to the series object, or
    * the point object in case of pie charts. By default the series or point
    * name is printed.
    */
  var labelFormatter: js.UndefOr[FormatterCallbackFunction[Point | Series]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
    * Can be one of `horizontal` or `vertical` or `proximate`. When
    * `proximate`, the legend items will be placed as close as possible to the
    * graphs they're representing, except in inverted charts or when the legend
    * position doesn't allow it.
    */
  var layout: js.UndefOr[OptionsLayoutValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
    * calculated automatically and the legend is not floating, the legend
    * margin is the space between the legend and the axis labels or plot area.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
    * legend. When the maximum height is extended, navigation will show.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
    * navigation appearing when the legend is overflown. Navigation works well
    * on screen, but not in static exported images. One way of working around
    * that is to increase the chart height in export.
    */
  var navigation: js.UndefOr[LegendNavigationOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
    * box.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
    * the legend items compared to the order of the series or points as defined
    * in the configuration object.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
    * the right side of the text rather than the left side. This is common in
    * Arabic and Hebraic.
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the legend. A `backgroundColor` also needs to be applied for this to
    * take effect. The shadow can be an object configuration containing
    * `color`, `offsetX`, `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
    * symbol width will be the same as the symbol height, which in turn
    * defaults to the font size of the legend items.
    */
  var squareSymbol: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
    * for series types that use a rectangle in the legend. Defaults to the font
    * size of legend items.
    */
  var symbolHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
    * legend item symbol and the legend item text.
    */
  var symbolPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
    * for series types that use a rectangle in the legend. Defaults to half the
    * `symbolHeight`.
    */
  var symbolRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
    * item symbol. When the `squareSymbol` option is set, this defaults to the
    * `symbolHeight`, otherwise 16.
    */
  var symbolWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
    * the legend.
    */
  var title: js.UndefOr[LegendTitleOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the legend item texts.
    *
    * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of the
    * legend box. Can be one of `top`, `middle` or `bottom`. Vertical position
    * can be further determined by the `y` option.
    *
    * In the case that the legend is aligned in a corner position, the `layout`
    * option will determine whether to place it above/below or on the side of
    * the plot area.
    *
    * When the layout option is `proximate`, the `verticalAlign` option doesn't
    * apply.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
    * a number is set, it translates to pixels. Since v7.0.2 it allows setting
    * a percent string of the full chart width, for example `40%`.
    *
    * Defaults to the full chart width for legends below or above the chart,
    * half the chart width for legends to the left and right.
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
    * relative to its horizontal alignment `align` within chart.spacingLeft and
    * chart.spacingRight. Negative x moves it to the left, positive x moves it
    * to the right.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * legend relative to it's vertical alignment `verticalAlign` within
    * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
    * positive y moves it down.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object LegendOptions {
  
  inline def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  extension [Self <: LegendOptions](x: Self) {
    
    inline def setAccessibility(value: LegendAccessibilityOptions): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignColumns(value: Boolean): Self = StObject.set(x, "alignColumns", value.asInstanceOf[js.Any])
    
    inline def setAlignColumnsUndefined: Self = StObject.set(x, "alignColumns", js.undefined)
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setBubbleLegend(value: LegendBubbleLegendOptions): Self = StObject.set(x, "bubbleLegend", value.asInstanceOf[js.Any])
    
    inline def setBubbleLegendUndefined: Self = StObject.set(x, "bubbleLegend", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    inline def setItemCheckboxStyle(value: CSSObject): Self = StObject.set(x, "itemCheckboxStyle", value.asInstanceOf[js.Any])
    
    inline def setItemCheckboxStyleUndefined: Self = StObject.set(x, "itemCheckboxStyle", js.undefined)
    
    inline def setItemDistance(value: Double): Self = StObject.set(x, "itemDistance", value.asInstanceOf[js.Any])
    
    inline def setItemDistanceUndefined: Self = StObject.set(x, "itemDistance", js.undefined)
    
    inline def setItemHiddenStyle(value: CSSObject): Self = StObject.set(x, "itemHiddenStyle", value.asInstanceOf[js.Any])
    
    inline def setItemHiddenStyleUndefined: Self = StObject.set(x, "itemHiddenStyle", js.undefined)
    
    inline def setItemHoverStyle(value: CSSObject): Self = StObject.set(x, "itemHoverStyle", value.asInstanceOf[js.Any])
    
    inline def setItemHoverStyleUndefined: Self = StObject.set(x, "itemHoverStyle", js.undefined)
    
    inline def setItemMarginBottom(value: Double): Self = StObject.set(x, "itemMarginBottom", value.asInstanceOf[js.Any])
    
    inline def setItemMarginBottomUndefined: Self = StObject.set(x, "itemMarginBottom", js.undefined)
    
    inline def setItemMarginTop(value: Double): Self = StObject.set(x, "itemMarginTop", value.asInstanceOf[js.Any])
    
    inline def setItemMarginTopUndefined: Self = StObject.set(x, "itemMarginTop", js.undefined)
    
    inline def setItemStyle(value: CSSObject): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
    
    inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    inline def setLabelFormat(value: String): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setLabelFormatter(value: FormatterCallbackFunction[Point | Series]): Self = StObject.set(x, "labelFormatter", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    inline def setLayout(value: OptionsLayoutValue): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setNavigation(value: LegendNavigationOptions): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setShadow(value: Boolean | CSSObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSquareSymbol(value: Boolean): Self = StObject.set(x, "squareSymbol", value.asInstanceOf[js.Any])
    
    inline def setSquareSymbolUndefined: Self = StObject.set(x, "squareSymbol", js.undefined)
    
    inline def setSymbolHeight(value: Double): Self = StObject.set(x, "symbolHeight", value.asInstanceOf[js.Any])
    
    inline def setSymbolHeightUndefined: Self = StObject.set(x, "symbolHeight", js.undefined)
    
    inline def setSymbolPadding(value: Double): Self = StObject.set(x, "symbolPadding", value.asInstanceOf[js.Any])
    
    inline def setSymbolPaddingUndefined: Self = StObject.set(x, "symbolPadding", js.undefined)
    
    inline def setSymbolRadius(value: Double): Self = StObject.set(x, "symbolRadius", value.asInstanceOf[js.Any])
    
    inline def setSymbolRadiusUndefined: Self = StObject.set(x, "symbolRadius", js.undefined)
    
    inline def setSymbolWidth(value: Double): Self = StObject.set(x, "symbolWidth", value.asInstanceOf[js.Any])
    
    inline def setSymbolWidthUndefined: Self = StObject.set(x, "symbolWidth", js.undefined)
    
    inline def setTitle(value: LegendTitleOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
