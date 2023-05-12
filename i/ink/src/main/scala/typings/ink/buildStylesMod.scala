package typings.ink

import typings.chalk.sourceVendorAnsiStylesMod.ForegroundColorName
import typings.cliBoxes.mod.BoxStyle
import typings.ink.inkStrings.`column-reverse`
import typings.ink.inkStrings.`flex-end`
import typings.ink.inkStrings.`flex-start`
import typings.ink.inkStrings.`row-reverse`
import typings.ink.inkStrings.`space-around`
import typings.ink.inkStrings.`space-between`
import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.`wrap-reverse`
import typings.ink.inkStrings.absolute
import typings.ink.inkStrings.arrow
import typings.ink.inkStrings.auto
import typings.ink.inkStrings.bold
import typings.ink.inkStrings.center
import typings.ink.inkStrings.classic
import typings.ink.inkStrings.column
import typings.ink.inkStrings.double
import typings.ink.inkStrings.doubleSingle
import typings.ink.inkStrings.end
import typings.ink.inkStrings.flex
import typings.ink.inkStrings.hidden
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.none
import typings.ink.inkStrings.nowrap
import typings.ink.inkStrings.relative
import typings.ink.inkStrings.round
import typings.ink.inkStrings.row
import typings.ink.inkStrings.single
import typings.ink.inkStrings.singleDouble
import typings.ink.inkStrings.stretch
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.visible
import typings.ink.inkStrings.wrap
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import typings.yogaWasmWeb.distWrapAsmMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStylesMod {
  
  @JSImport("ink/build/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(node: Node, style: Styles): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Styles extends StObject {
    
    /**
      * The align-items property defines the default behavior for how items are laid out along the cross axis (perpendicular to the main axis).
      * See [align-items](https://css-tricks.com/almanac/properties/a/align-items/).
      */
    val alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.undefined
    
    /**
      * It makes possible to override the align-items value for specific flex items.
      * See [align-self](https://css-tricks.com/almanac/properties/a/align-self/).
      */
    val alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.undefined
    
    /**
      * Determines whether bottom border is visible.
      *
      * @default true
      */
    val borderBottom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change bottom border color.
      * Accepts the same values as `color` in `Text` component.
      */
    val borderBottomColor: js.UndefOr[LiteralUnion[ForegroundColorName, String]] = js.undefined
    
    /**
      * Change border color.
      * Shorthand for setting `borderTopColor`, `borderRightColor`, `borderBottomColor` and `borderLeftColor`.
      */
    val borderColor: js.UndefOr[LiteralUnion[ForegroundColorName, String]] = js.undefined
    
    /**
      * Determines whether left border is visible.
      *
      * @default true
      */
    val borderLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change left border color.
      * Accepts the same values as `color` in `Text` component.
      */
    val borderLeftColor: js.UndefOr[LiteralUnion[ForegroundColorName, String]] = js.undefined
    
    /**
      * Determines whether right border is visible.
      *
      * @default true
      */
    val borderRight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change right border color.
      * Accepts the same values as `color` in `Text` component.
      */
    val borderRightColor: js.UndefOr[LiteralUnion[ForegroundColorName, String]] = js.undefined
    
    /**
      * Add a border with a specified style.
      * If `borderStyle` is `undefined` (which it is by default), no border will be added.
      */
    val borderStyle: js.UndefOr[
        single | double | round | bold | singleDouble | doubleSingle | classic | arrow | BoxStyle
      ] = js.undefined
    
    /**
      * Determines whether top border is visible.
      *
      * @default true
      */
    val borderTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change top border color.
      * Accepts the same values as `color` in `Text` component.
      */
    val borderTopColor: js.UndefOr[LiteralUnion[ForegroundColorName, String]] = js.undefined
    
    /**
      * Size of the gap between an element's columns.
      */
    val columnGap: js.UndefOr[Double] = js.undefined
    
    /**
      * Set this property to `none` to hide the element.
      */
    val display: js.UndefOr[flex | none] = js.undefined
    
    /**
      * It specifies the initial size of the flex item, before any available space is distributed according to the flex factors.
      * See [flex-basis](https://css-tricks.com/almanac/properties/f/flex-basis/).
      */
    val flexBasis: js.UndefOr[Double | String] = js.undefined
    
    /**
      * It establishes the main-axis, thus defining the direction flex items are placed in the flex container.
      * See [flex-direction](https://css-tricks.com/almanac/properties/f/flex-direction/).
      */
    val flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.undefined
    
    /**
      * This property defines the ability for a flex item to grow if necessary.
      * See [flex-grow](https://css-tricks.com/almanac/properties/f/flex-grow/).
      */
    val flexGrow: js.UndefOr[Double] = js.undefined
    
    /**
      * It specifies the “flex shrink factor”, which determines how much the flex item will shrink relative to the rest of the flex items in the flex container when there isn’t enough space on the row.
      * See [flex-shrink](https://css-tricks.com/almanac/properties/f/flex-shrink/).
      */
    val flexShrink: js.UndefOr[Double] = js.undefined
    
    /**
      * It defines whether the flex items are forced in a single line or can be flowed into multiple lines. If set to multiple lines, it also defines the cross-axis which determines the direction new lines are stacked in.
      * See [flex-wrap](https://css-tricks.com/almanac/properties/f/flex-wrap/).
      */
    val flexWrap: js.UndefOr[nowrap | wrap | `wrap-reverse`] = js.undefined
    
    /**
      * Size of the gap between an element's columns and rows. Shorthand for `columnGap` and `rowGap`.
      */
    val gap: js.UndefOr[Double] = js.undefined
    
    /**
      * Height of the element in lines (rows).
      * You can also set it in percent, which will calculate the height based on the height of parent element.
      */
    val height: js.UndefOr[Double | String] = js.undefined
    
    /**
      * It defines the alignment along the main axis.
      * See [justify-content](https://css-tricks.com/almanac/properties/j/justify-content/).
      */
    val justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.undefined
    
    /**
      * Margin on all sides. Equivalent to setting `marginTop`, `marginBottom`, `marginLeft` and `marginRight`.
      */
    val margin: js.UndefOr[Double] = js.undefined
    
    /**
      * Bottom margin.
      */
    val marginBottom: js.UndefOr[Double] = js.undefined
    
    /**
      * Left margin.
      */
    val marginLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Right margin.
      */
    val marginRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Top margin.
      */
    val marginTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal margin. Equivalent to setting `marginLeft` and `marginRight`.
      */
    val marginX: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical margin. Equivalent to setting `marginTop` and `marginBottom`.
      */
    val marginY: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets a minimum height of the element.
      */
    val minHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Sets a minimum width of the element.
      */
    val minWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Behavior for an element's overflow in both directions.
      *
      * @default 'visible'
      */
    val overflow: js.UndefOr[visible | hidden] = js.undefined
    
    /**
      * Behavior for an element's overflow in horizontal direction.
      *
      * @default 'visible'
      */
    val overflowX: js.UndefOr[visible | hidden] = js.undefined
    
    /**
      * Behavior for an element's overflow in vertical direction.
      *
      * @default 'visible'
      */
    val overflowY: js.UndefOr[visible | hidden] = js.undefined
    
    /**
      * Padding on all sides. Equivalent to setting `paddingTop`, `paddingBottom`, `paddingLeft` and `paddingRight`.
      */
    val padding: js.UndefOr[Double] = js.undefined
    
    /**
      * Bottom padding.
      */
    val paddingBottom: js.UndefOr[Double] = js.undefined
    
    /**
      * Left padding.
      */
    val paddingLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Right padding.
      */
    val paddingRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Top padding.
      */
    val paddingTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal padding. Equivalent to setting `paddingLeft` and `paddingRight`.
      */
    val paddingX: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical padding. Equivalent to setting `paddingTop` and `paddingBottom`.
      */
    val paddingY: js.UndefOr[Double] = js.undefined
    
    val position: js.UndefOr[absolute | relative] = js.undefined
    
    /**
      * Size of the gap between element's rows.
      */
    val rowGap: js.UndefOr[Double] = js.undefined
    
    val textWrap: js.UndefOr[
        wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
      ] = js.undefined
    
    /**
      * Width of the element in spaces.
      * You can also set it in percent, which will calculate the width based on the width of parent element.
      */
    val width: js.UndefOr[Double | String] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      inline def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBorderBottom(value: Boolean): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(value: LiteralUnion[ForegroundColorName, String]): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderColor(value: LiteralUnion[ForegroundColorName, String]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderLeft(value: Boolean): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(value: LiteralUnion[ForegroundColorName, String]): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderRight(value: Boolean): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(value: LiteralUnion[ForegroundColorName, String]): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic | arrow | BoxStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTop(value: Boolean): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(value: LiteralUnion[ForegroundColorName, String]): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setDisplay(value: flex | none): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexWrap(value: nowrap | wrap | `wrap-reverse`): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginX(value: Double): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginY(value: Double): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOverflow(value: visible | hidden): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowX(value: visible | hidden): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: visible | hidden): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRowGap(value: Double): Self = StObject.set(x, "rowGap", value.asInstanceOf[js.Any])
      
      inline def setRowGapUndefined: Self = StObject.set(x, "rowGap", js.undefined)
      
      inline def setTextWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = StObject.set(x, "textWrap", value.asInstanceOf[js.Any])
      
      inline def setTextWrapUndefined: Self = StObject.set(x, "textWrap", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
