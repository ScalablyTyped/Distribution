package typings.ink.anon

import typings.ink.domMod.DOMElement
import typings.ink.inkStrings.`column-reverse`
import typings.ink.inkStrings.`flex-end`
import typings.ink.inkStrings.`flex-start`
import typings.ink.inkStrings.`row-reverse`
import typings.ink.inkStrings.`space-around`
import typings.ink.inkStrings.`space-between`
import typings.ink.inkStrings.absolute
import typings.ink.inkStrings.auto
import typings.ink.inkStrings.bold
import typings.ink.inkStrings.center
import typings.ink.inkStrings.classic
import typings.ink.inkStrings.column
import typings.ink.inkStrings.double
import typings.ink.inkStrings.doubleSingle
import typings.ink.inkStrings.flex
import typings.ink.inkStrings.none
import typings.ink.inkStrings.relative
import typings.ink.inkStrings.round
import typings.ink.inkStrings.row
import typings.ink.inkStrings.single
import typings.ink.inkStrings.singleDouble
import typings.ink.inkStrings.stretch
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined { readonly margin :number | undefined,  readonly marginX :number | undefined,  readonly marginY :number | undefined,  readonly padding :number | undefined,  readonly paddingX :number | undefined,  readonly paddingY :number | undefined,   children :react.react.ReactNode | undefined} & std.Pick<ink.ink/build/styles.Styles, 'position' | 'marginLeft' | 'marginRight' | 'marginTop' | 'marginBottom' | 'paddingLeft' | 'paddingRight' | 'paddingTop' | 'paddingBottom' | 'flexGrow' | 'flexShrink' | 'flexDirection' | 'flexBasis' | 'alignItems' | 'alignSelf' | 'justifyContent' | 'width' | 'height' | 'minWidth' | 'minHeight' | 'display' | 'borderStyle' | 'borderColor'> & react.react.RefAttributes<ink.ink/build/dom.DOMElement> */
@js.native
trait readonlymarginnumberundef extends StObject {
  
  var alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.native
  
  var alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.native
  
  var borderColor: js.UndefOr[
    LiteralUnion[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
      String
    ]
  ] = js.native
  
  var borderStyle: js.UndefOr[single | double | round | bold | singleDouble | doubleSingle | classic] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var display: js.UndefOr[flex | none] = js.native
  
  var flexBasis: js.UndefOr[Double | String] = js.native
  
  var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  
  var flexGrow: js.UndefOr[Double] = js.native
  
  var flexShrink: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.native
  
  var key: js.UndefOr[Key | Null] = js.native
  
  /**
    * Margin on all sides. Equivalent to setting `marginTop`, `marginBottom`, `marginLeft` and `marginRight`.
    *
    * @default 0
    */
  val margin: js.UndefOr[Double] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  /**
    * Horizontal margin. Equivalent to setting `marginLeft` and `marginRight`.
    *
    * @default 0
    */
  val marginX: js.UndefOr[Double] = js.native
  
  /**
    * Vertical margin. Equivalent to setting `marginTop` and `marginBottom`.
    *
    * @default 0
    */
  val marginY: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double | String] = js.native
  
  var minWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Padding on all sides. Equivalent to setting `paddingTop`, `paddingBottom`, `paddingLeft` and `paddingRight`.
    *
    * @default 0
    */
  val padding: js.UndefOr[Double] = js.native
  
  var paddingBottom: js.UndefOr[Double] = js.native
  
  var paddingLeft: js.UndefOr[Double] = js.native
  
  var paddingRight: js.UndefOr[Double] = js.native
  
  var paddingTop: js.UndefOr[Double] = js.native
  
  /**
    * Horizontal padding. Equivalent to setting `paddingLeft` and `paddingRight`.
    *
    * @default 0
    */
  val paddingX: js.UndefOr[Double] = js.native
  
  /**
    * Vertical padding. Equivalent to setting `paddingTop` and `paddingBottom`.
    *
    * @default 0
    */
  val paddingY: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[absolute | relative] = js.native
  
  var ref: js.UndefOr[Ref[DOMElement]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object readonlymarginnumberundef {
  
  @scala.inline
  def apply(): readonlymarginnumberundef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[readonlymarginnumberundef]
  }
  
  @scala.inline
  implicit class readonlymarginnumberundefMutableBuilder[Self <: readonlymarginnumberundef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    @scala.inline
    def setBorderColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
          String
        ]
    ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisplay(value: flex | none): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginX(value: Double): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
    
    @scala.inline
    def setMarginY(value: Double): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
    
    @scala.inline
    def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
    
    @scala.inline
    def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRef(value: Ref[DOMElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ DOMElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
