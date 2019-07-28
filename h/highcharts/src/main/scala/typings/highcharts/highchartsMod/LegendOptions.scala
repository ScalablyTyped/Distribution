package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
    * legend. Requires the Accessibility module.
    */
  var accessibility: js.UndefOr[js.Object | LegendAccessibilityOptions] = js.undefined
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
  var backgroundColor: js.UndefOr[ColorString] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The color of the drawn border
    * around the legend.
    */
  var borderColor: js.UndefOr[ColorString] = js.undefined
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
    * error is permitted. Requires `highcharts-more.js`.
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
  var labelFormatter: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The layout of the legend items.
    * Can be one of `horizontal` or `vertical` or `proximate`. When
    * `proximate`, the legend items will be placed as close as possible to the
    * graphs they're representing, except in inverted charts or when the legend
    * position doesn't allow it.
    */
  var layout: js.UndefOr[OptionsLayoutValue] = js.undefined
  /**
    * (Highcharts, Gantt) Line height for the legend items. Deprecated as of
    * 2.1\. Instead, the line height for each item can be set using
    * itemStyle.lineHeight, and the padding between items using `itemMarginTop`
    * and `itemMarginBottom`.
    */
  var lineHeight: js.UndefOr[Double] = js.undefined
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
    * (Highcharts, Highstock) CSS styles for the legend area. In the 1.x
    * versions the position of the legend area was determined by CSS. In 2.x,
    * the position is determined by properties like `align`, `verticalAlign`,
    * `x` and `y`, but the styles are still parsed for backwards compatibility.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
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
    * Defaults to the full chart width from legends below or above the chart,
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
  @scala.inline
  def apply(
    accessibility: js.Object | LegendAccessibilityOptions = null,
    align: AlignValue = null,
    alignColumns: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString = null,
    borderColor: ColorString = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    bubbleLegend: LegendBubbleLegendOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    floating: js.UndefOr[Boolean] = js.undefined,
    itemCheckboxStyle: CSSObject = null,
    itemDistance: Int | Double = null,
    itemHiddenStyle: CSSObject = null,
    itemHoverStyle: CSSObject = null,
    itemMarginBottom: Int | Double = null,
    itemMarginTop: Int | Double = null,
    itemStyle: CSSObject = null,
    itemWidth: Int | Double = null,
    labelFormat: String = null,
    labelFormatter: js.Any = null,
    layout: OptionsLayoutValue = null,
    lineHeight: Int | Double = null,
    margin: Int | Double = null,
    maxHeight: Int | Double = null,
    navigation: LegendNavigationOptions = null,
    padding: Int | Double = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    shadow: Boolean | CSSObject = null,
    squareSymbol: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null,
    symbolHeight: Int | Double = null,
    symbolPadding: Int | Double = null,
    symbolRadius: Int | Double = null,
    symbolWidth: Int | Double = null,
    title: LegendTitleOptions = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    width: Double | String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(alignColumns)) __obj.updateDynamic("alignColumns")(alignColumns)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (bubbleLegend != null) __obj.updateDynamic("bubbleLegend")(bubbleLegend)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (itemCheckboxStyle != null) __obj.updateDynamic("itemCheckboxStyle")(itemCheckboxStyle)
    if (itemDistance != null) __obj.updateDynamic("itemDistance")(itemDistance.asInstanceOf[js.Any])
    if (itemHiddenStyle != null) __obj.updateDynamic("itemHiddenStyle")(itemHiddenStyle)
    if (itemHoverStyle != null) __obj.updateDynamic("itemHoverStyle")(itemHoverStyle)
    if (itemMarginBottom != null) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.asInstanceOf[js.Any])
    if (itemMarginTop != null) __obj.updateDynamic("itemMarginTop")(itemMarginTop.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat)
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(labelFormatter)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(squareSymbol)) __obj.updateDynamic("squareSymbol")(squareSymbol)
    if (style != null) __obj.updateDynamic("style")(style)
    if (symbolHeight != null) __obj.updateDynamic("symbolHeight")(symbolHeight.asInstanceOf[js.Any])
    if (symbolPadding != null) __obj.updateDynamic("symbolPadding")(symbolPadding.asInstanceOf[js.Any])
    if (symbolRadius != null) __obj.updateDynamic("symbolRadius")(symbolRadius.asInstanceOf[js.Any])
    if (symbolWidth != null) __obj.updateDynamic("symbolWidth")(symbolWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendOptions]
  }
}

