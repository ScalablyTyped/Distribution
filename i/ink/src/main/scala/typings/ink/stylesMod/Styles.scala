package typings.ink.stylesMod

import typings.ink.inkStrings.`column-reverse`
import typings.ink.inkStrings.`flex-end`
import typings.ink.inkStrings.`flex-start`
import typings.ink.inkStrings.`row-reverse`
import typings.ink.inkStrings.`space-around`
import typings.ink.inkStrings.`space-between`
import typings.ink.inkStrings.`truncate-end`
import typings.ink.inkStrings.`truncate-middle`
import typings.ink.inkStrings.`truncate-start`
import typings.ink.inkStrings.absolute
import typings.ink.inkStrings.auto
import typings.ink.inkStrings.bold
import typings.ink.inkStrings.center
import typings.ink.inkStrings.classic
import typings.ink.inkStrings.column
import typings.ink.inkStrings.double
import typings.ink.inkStrings.doubleSingle
import typings.ink.inkStrings.end
import typings.ink.inkStrings.flex
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.none
import typings.ink.inkStrings.relative
import typings.ink.inkStrings.round
import typings.ink.inkStrings.row
import typings.ink.inkStrings.single
import typings.ink.inkStrings.singleDouble
import typings.ink.inkStrings.stretch
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import typings.typeFest.literalUnionMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  /**
    * The align-items property defines the default behavior for how items are laid out along the cross axis (perpendicular to the main axis).
    * See [align-items](https://css-tricks.com/almanac/properties/a/align-items/).
    */
  val alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.native
  
  /**
    * It makes possible to override the align-items value for specific flex items.
    * See [align-self](https://css-tricks.com/almanac/properties/a/align-self/).
    */
  val alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.native
  
  /**
    * Change border color.
    * Accepts the same values as `color` in <Text> component.
    */
  val borderColor: js.UndefOr[
    LiteralUnion[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
      String
    ]
  ] = js.native
  
  /**
    * Add a border with a specified style.
    * If `borderStyle` is `undefined` (which it is by default), no border will be added.
    */
  val borderStyle: js.UndefOr[single | double | round | bold | singleDouble | doubleSingle | classic] = js.native
  
  /**
    * Set this property to `none` to hide the element.
    */
  val display: js.UndefOr[flex | none] = js.native
  
  /**
    * It specifies the initial size of the flex item, before any available space is distributed according to the flex factors.
    * See [flex-basis](https://css-tricks.com/almanac/properties/f/flex-basis/).
    */
  val flexBasis: js.UndefOr[Double | String] = js.native
  
  /**
    * It establishes the main-axis, thus defining the direction flex items are placed in the flex container.
    * See [flex-direction](https://css-tricks.com/almanac/properties/f/flex-direction/).
    */
  val flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.native
  
  /**
    * This property defines the ability for a flex item to grow if necessary.
    * See [flex-grow](https://css-tricks.com/almanac/properties/f/flex-grow/).
    */
  val flexGrow: js.UndefOr[Double] = js.native
  
  /**
    * It specifies the “flex shrink factor”, which determines how much the flex item will shrink relative to the rest of the flex items in the flex container when there isn’t enough space on the row.
    * See [flex-shrink](https://css-tricks.com/almanac/properties/f/flex-shrink/).
    */
  val flexShrink: js.UndefOr[Double] = js.native
  
  /**
    * Height of the element in lines (rows).
    * You can also set it in percent, which will calculate the height based on the height of parent element.
    */
  val height: js.UndefOr[Double | String] = js.native
  
  /**
    * It defines the alignment along the main axis.
    * See [justify-content](https://css-tricks.com/almanac/properties/j/justify-content/).
    */
  val justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.native
  
  /**
    * Bottom margin.
    */
  val marginBottom: js.UndefOr[Double] = js.native
  
  /**
    * Left margin.
    */
  val marginLeft: js.UndefOr[Double] = js.native
  
  /**
    * Right margin.
    */
  val marginRight: js.UndefOr[Double] = js.native
  
  /**
    * Top margin.
    */
  val marginTop: js.UndefOr[Double] = js.native
  
  /**
    * Sets a minimum height of the element.
    */
  val minHeight: js.UndefOr[Double | String] = js.native
  
  /**
    * Sets a minimum width of the element.
    */
  val minWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Bottom padding.
    */
  val paddingBottom: js.UndefOr[Double] = js.native
  
  /**
    * Left padding.
    */
  val paddingLeft: js.UndefOr[Double] = js.native
  
  /**
    * Right padding.
    */
  val paddingRight: js.UndefOr[Double] = js.native
  
  /**
    * Top padding.
    */
  val paddingTop: js.UndefOr[Double] = js.native
  
  val position: js.UndefOr[absolute | relative] = js.native
  
  val textWrap: js.UndefOr[
    wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
  ] = js.native
  
  /**
    * Width of the element in spaces.
    * You can also set it in percent, which will calculate the width based on the width of parent element.
    */
  val width: js.UndefOr[Double | String] = js.native
}
object Styles {
  
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = this.set("alignItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignItems: Self = this.set("alignItems", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setBorderColor(
      value: LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ _, 
          String
        ]
    ): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic): Self = this.set("borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyle: Self = this.set("borderStyle", js.undefined)
    
    @scala.inline
    def setDisplay(value: flex | none): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFlexBasis(value: Double | String): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
    
    @scala.inline
    def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = this.set("flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexDirection: Self = this.set("flexDirection", js.undefined)
    
    @scala.inline
    def setFlexGrow(value: Double): Self = this.set("flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexGrow: Self = this.set("flexGrow", js.undefined)
    
    @scala.inline
    def setFlexShrink(value: Double): Self = this.set("flexShrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexShrink: Self = this.set("flexShrink", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = this.set("justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyContent: Self = this.set("justifyContent", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Double): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Double): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    
    @scala.inline
    def setPosition(value: absolute | relative): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTextWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = this.set("textWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWrap: Self = this.set("textWrap", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
