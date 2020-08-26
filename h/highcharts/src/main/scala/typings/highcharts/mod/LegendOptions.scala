package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * legend. Requires the Accessibility module.
    */
  var accessibility: js.UndefOr[LegendAccessibilityOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal alignment of the
    * legend box within the chart area. Valid values are `left`, `center` and
    * `right`.
    *
    * In the case that the legend is aligned in a corner position, the `layout`
    * option will determine whether to place it above/below or on the side of
    * the plot area.
    */
  var align: js.UndefOr[AlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the layout is `horizontal`
    * and the legend items span over two lines or more, whether to align the
    * items into vertical columns. Setting this to `false` makes room for more
    * items, but will look more messy.
    */
  var alignColumns: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color of the
    * legend.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
    * around the legend.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border corner radius of the
    * legend.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the drawn border
    * around the legend.
    */
  var borderWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps) The bubble legend is an additional
    * element in legend which presents the scale of the bubble series.
    * Individual bubble ranges can be defined by user or calculated from
    * series. In the case of automatically calculated ranges, a 1px margin of
    * error is permitted.
    */
  var bubbleLegend: js.UndefOr[LegendBubbleLegendOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the legend.
    * There is also a series-specific option, showInLegend, that can hide the
    * series from the legend. In some series types this is `false` by default,
    * so it must set to `true` in order to show the legend for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When the legend is floating, the
    * plot area ignores it and is allowed to be placed below it.
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Default styling for the checkbox
    * next to a legend item when `showCheckbox` is true.
    */
  var itemCheckboxStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) In a legend with horizontal
    * layout, the itemDistance defines the pixel distance between each item.
    */
  var itemDistance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * when the corresponding series or point is hidden. Only a subset of CSS is
    * supported, notably those options related to text. Properties are
    * inherited from `style` unless overridden here.
    */
  var itemHiddenStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item
    * in hover mode. Only a subset of CSS is supported, notably those options
    * related to text. Properties are inherited from `style` unless overridden
    * here.
    */
  var itemHoverStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel bottom margin for each
    * legend item.
    */
  var itemMarginBottom: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel top margin for each
    * legend item.
    */
  var itemMarginTop: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for each legend item.
    * Only a subset of CSS is supported, notably those options related to text.
    * The default `textOverflow` property makes long texts truncate. Set it to
    * `undefined` to wrap text instead. A `width` property can be added to
    * control the text width.
    */
  var itemStyle: js.UndefOr[CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width for each legend item.
    * By default the items are laid out successively. In a horizontal layout,
    * if the items are laid out across two rows or more, they will be
    * vertically aligned depending on the legend.alignColumns option.
    */
  var itemWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for each legend
    * label. Available variables relates to properties on the series, or the
    * point in case of pies.
    */
  var labelFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback function to format each
    * of the series' labels. The `this` keyword refers to the series object, or
    * the point object in case of pie charts. By default the series or point
    * name is printed.
    */
  var labelFormatter: js.UndefOr[FormatterCallbackFunction[Point | Series]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
    * Can be one of `horizontal` or `vertical` or `proximate`. When
    * `proximate`, the legend items will be placed as close as possible to the
    * graphs they're representing, except in inverted charts or when the legend
    * position doesn't allow it.
    */
  var layout: js.UndefOr[OptionsLayoutValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) If the plot area sized is
    * calculated automatically and the legend is not floating, the legend
    * margin is the space between the legend and the axis labels or plot area.
    */
  var margin: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Maximum pixel height for the
    * legend. When the maximum height is extended, navigation will show.
    */
  var maxHeight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the paging or
    * navigation appearing when the legend is overflown. Navigation works well
    * on screen, but not in static exported images. One way of working around
    * that is to increase the chart height in export.
    */
  var navigation: js.UndefOr[LegendNavigationOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The inner padding of the legend
    * box.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to reverse the order of
    * the legend items compared to the order of the series or points as defined
    * in the configuration object.
    */
  var reversed: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to show the symbol on
    * the right side of the text rather than the left side. This is common in
    * Arabic and Hebraic.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to apply a drop shadow
    * to the legend. A `backgroundColor` also needs to be applied for this to
    * take effect. The shadow can be an object configuration containing
    * `color`, `offsetX`, `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | CSSObject] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When this is true, the legend
    * symbol width will be the same as the symbol height, which in turn
    * defaults to the font size of the legend items.
    */
  var squareSymbol: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel height of the symbol
    * for series types that use a rectangle in the legend. Defaults to the font
    * size of legend items.
    */
  var symbolHeight: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel padding between the
    * legend item symbol and the legend item text.
    */
  var symbolPadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius of the symbol
    * for series types that use a rectangle in the legend. Defaults to half the
    * `symbolHeight`.
    */
  var symbolRadius: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of the legend
    * item symbol. When the `squareSymbol` option is set, this defaults to the
    * `symbolHeight`, otherwise 16.
    */
  var symbolWidth: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A title to be added on top of
    * the legend.
    */
  var title: js.UndefOr[LegendTitleOptions] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the legend item texts.
    *
    * Prior to 4.1.7, when using HTML, legend.navigation was disabled.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
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
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The width of the legend box. If
    * a number is set, it translates to pixels. Since v7.0.2 it allows setting
    * a percent string of the full chart width, for example `40%`.
    *
    * Defaults to the full chart width from legends below or above the chart,
    * half the chart width for legends to the left and right.
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x offset of the legend
    * relative to its horizontal alignment `align` within chart.spacingLeft and
    * chart.spacingRight. Negative x moves it to the left, positive x moves it
    * to the right.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * legend relative to it's vertical alignment `verticalAlign` within
    * chart.spacingTop and chart.spacingBottom. Negative y moves it up,
    * positive y moves it down.
    */
  var y: js.UndefOr[Double] = js.native
}

object LegendOptions {
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: LegendAccessibilityOptions): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAlign(value: AlignValue): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAlignColumns(value: Boolean): Self = this.set("alignColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignColumns: Self = this.set("alignColumns", js.undefined)
    @scala.inline
    def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBubbleLegend(value: LegendBubbleLegendOptions): Self = this.set("bubbleLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbleLegend: Self = this.set("bubbleLegend", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setItemCheckboxStyle(value: CSSObject): Self = this.set("itemCheckboxStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemCheckboxStyle: Self = this.set("itemCheckboxStyle", js.undefined)
    @scala.inline
    def setItemDistance(value: Double): Self = this.set("itemDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemDistance: Self = this.set("itemDistance", js.undefined)
    @scala.inline
    def setItemHiddenStyle(value: CSSObject): Self = this.set("itemHiddenStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHiddenStyle: Self = this.set("itemHiddenStyle", js.undefined)
    @scala.inline
    def setItemHoverStyle(value: CSSObject): Self = this.set("itemHoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHoverStyle: Self = this.set("itemHoverStyle", js.undefined)
    @scala.inline
    def setItemMarginBottom(value: Double): Self = this.set("itemMarginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMarginBottom: Self = this.set("itemMarginBottom", js.undefined)
    @scala.inline
    def setItemMarginTop(value: Double): Self = this.set("itemMarginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemMarginTop: Self = this.set("itemMarginTop", js.undefined)
    @scala.inline
    def setItemStyle(value: CSSObject): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setLabelFormat(value: String): Self = this.set("labelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormat: Self = this.set("labelFormat", js.undefined)
    @scala.inline
    def setLabelFormatter(value: FormatterCallbackFunction[Point | Series]): Self = this.set("labelFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFormatter: Self = this.set("labelFormatter", js.undefined)
    @scala.inline
    def setLayout(value: OptionsLayoutValue): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setNavigation(value: LegendNavigationOptions): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setShadow(value: Boolean | CSSObject): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSquareSymbol(value: Boolean): Self = this.set("squareSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquareSymbol: Self = this.set("squareSymbol", js.undefined)
    @scala.inline
    def setSymbolHeight(value: Double): Self = this.set("symbolHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolHeight: Self = this.set("symbolHeight", js.undefined)
    @scala.inline
    def setSymbolPadding(value: Double): Self = this.set("symbolPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolPadding: Self = this.set("symbolPadding", js.undefined)
    @scala.inline
    def setSymbolRadius(value: Double): Self = this.set("symbolRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolRadius: Self = this.set("symbolRadius", js.undefined)
    @scala.inline
    def setSymbolWidth(value: Double): Self = this.set("symbolWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolWidth: Self = this.set("symbolWidth", js.undefined)
    @scala.inline
    def setTitle(value: LegendTitleOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUseHTML(value: Boolean): Self = this.set("useHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHTML: Self = this.set("useHTML", js.undefined)
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
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

