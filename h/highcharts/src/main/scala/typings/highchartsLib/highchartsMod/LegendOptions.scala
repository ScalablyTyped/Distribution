package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  /**
    * The horizontal alignment of the legend box within the chart area. Valid values are 'left', 'center' and 'right'.
    * In the case that the legend is aligned in a corner position, the layout option will determine whether to place it
    * above/below or on the side of the plot area.
    * @default 'center'
    * @since 2.0
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The background color of the legend.
    */
  var backgroundColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The color of the drawn border around the legend.
    * @default '#909090'
    */
  var borderColor: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * The border corner radius of the legend.
    * @default 0
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the drawn border around the legend.
    * @default 0
    */
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable or disable the legend.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When the legend is floating, the plot area ignores it and is allowed to be placed below it.
    * @default false
    * @since 2.1
    */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * In a legend with horizontal layout, the itemDistance defines the pixel distance between each item.
    * @default 20
    * @since 3.0.3
    */
  var itemDistance: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for each legend item when the corresponding series or point is hidden. Only a subset of CSS is
    * supported, notably those options related to text. Properties are inherited from style unless overridden here.
    * @default {color: '#CCC'}
    */
  var itemHiddenStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * CSS styles for each legend item in hover mode. Only a subset of CSS is supported, notably those options related
    * to text. Properties are inherited from style unless overridden here.
    * @default {color: '#000'}
    */
  var itemHoverStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * The pixel bottom margin for each legend item.
    * @default 0
    * @since 2.2.0
    */
  var itemMarginBottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel top margin for each legend item.
    * @default 0
    * @since 2.2.0
    */
  var itemMarginTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for each legend item. Only a subset of CSS is supported, notably those options related to text.
    * @default { 'color': '#333333', 'cursor': 'pointer', 'fontSize': '12px', 'fontWeight': 'bold' }
    */
  var itemStyle: js.UndefOr[CSSObject] = js.undefined
  /**
    * The width for each legend item. This is useful in a horizontal layout with many items when you want the items to
    * align vertically.
    * @since 2.0
    */
  var itemWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * A format string for each legend label. Available variables relates to properties on the series, or the point in
    * case of pies.
    * @default '{name}'
    * @since 1.3
    */
  var labelFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function to format each of the series' labels. The this keyword refers to the series object, or the
    * point object in case of pie charts. By default the series or point name is printed.
    */
  var labelFormatter: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /**
    * The layout of the legend items. Can be one of 'horizontal' or 'vertical'.
    * @default 'horizontal'
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Line height for the legend items. Deprecated as of 2.1. Instead, the line height for each item can be set using
    * itemStyle.lineHeight, and the padding between items using itemMarginTop and itemMarginBottom.
    * @default 16
    * @since 2.0
    * @deprecated
    */
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * If the plot area sized is calculated automatically and the legend is not floating, the legend margin is the space
    * between the legend and the axis labels or plot area.
    * @default 12
    * @since 2.1
    */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
    * Maximum pixel height for the legend. When the maximum height is extended, navigation will show.
    * @since 2.3.0
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options for the paging or navigation appearing when the legend is overflown.
    */
  var navigation: js.UndefOr[LegendNavigationOptions] = js.undefined
  /**
    * The inner padding of the legend box.
    * @default 8
    * @since 2.2.0
    */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to reverse the order of the legend items compared to the order of the series or points as defined in the
    * configuration object.
    * @default false
    * @since 1.2.5
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to show the symbol on the right side of the text rather than the left side. This is common in Arabic and
    * Hebraic.
    * @default false
    * @since 2.2
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to apply a drop shadow to the legend. A backgroundColor also needs to be applied for this to take effect.
    * Since 2.3 the shadow can be an object configuration containing color, offsetX, offsetY, opacity and width.
    * @default false
    */
  var shadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
    * CSS styles for the legend area. In the 1.x versions the position of the legend area was determined by CSS. In
    * 2.x, the position is determined by properties like align, verticalAlign, x and y, but the styles are still parsed
    * for backwards compatibility.
    * @deprecated
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * The pixel height of the symbol for series types that use a rectangle in the legend. Defaults to the font size of
    * legend items.
    * @since 3.0.8
    */
  var symbolHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel padding between the legend item symbol and the legend item text.
    * @default 5
    */
  var symbolPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The border radius of the symbol for series types that use a rectangle in the legend.
    * @default 0
    * @since 3.0.8
    */
  var symbolRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel width of the legend item symbol.
    * @default 16
    */
  var symbolWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * A title to be added on top of the legend.
    * @since 3.0
    */
  var title: js.UndefOr[LegendTitleOptions] = js.undefined
  /**
    * Whether to use HTML to render the legend item texts. Prior to 4.1.7, when using HTML, legend.navigation was
    * disabled.
    * @default false
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The vertical alignment of the legend box. Can be one of 'top', 'middle' or 'bottom'. Vertical position can be
    * further determined by the y option.
    *
    * In the case that the legend is aligned in a corner position, the layout option will determine whether to place it
    * above/below or on the side of the plot area.
    *
    * @default 'bottom'
    * @since 2.0
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the legend box.
    * @since 2.0
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x offset of the legend relative to its horizontal alignment align within chart.spacingLeft and
    * chart.spacingRight. Negative x moves it to the left, positive x moves it to the right.
    * @default 0
    * @since 2.0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical offset of the legend relative to it's vertical alignment verticalAlign within chart.spacingTop and
    * chart.spacingBottom. Negative y moves it up, positive y moves it down.
    * @default 0
    * @since 2.0
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object LegendOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    itemDistance: scala.Int | scala.Double = null,
    itemHiddenStyle: CSSObject = null,
    itemHoverStyle: CSSObject = null,
    itemMarginBottom: scala.Int | scala.Double = null,
    itemMarginTop: scala.Int | scala.Double = null,
    itemStyle: CSSObject = null,
    itemWidth: scala.Int | scala.Double = null,
    labelFormat: java.lang.String = null,
    labelFormatter: () => java.lang.String = null,
    layout: java.lang.String = null,
    lineHeight: scala.Int | scala.Double = null,
    margin: scala.Int | scala.Double = null,
    maxHeight: scala.Int | scala.Double = null,
    navigation: LegendNavigationOptions = null,
    padding: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    shadow: scala.Boolean | Shadow = null,
    style: CSSObject = null,
    symbolHeight: scala.Int | scala.Double = null,
    symbolPadding: scala.Int | scala.Double = null,
    symbolRadius: scala.Int | scala.Double = null,
    symbolWidth: scala.Int | scala.Double = null,
    title: LegendTitleOptions = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (itemDistance != null) __obj.updateDynamic("itemDistance")(itemDistance.asInstanceOf[js.Any])
    if (itemHiddenStyle != null) __obj.updateDynamic("itemHiddenStyle")(itemHiddenStyle)
    if (itemHoverStyle != null) __obj.updateDynamic("itemHoverStyle")(itemHoverStyle)
    if (itemMarginBottom != null) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.asInstanceOf[js.Any])
    if (itemMarginTop != null) __obj.updateDynamic("itemMarginTop")(itemMarginTop.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat)
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction0(labelFormatter))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
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

