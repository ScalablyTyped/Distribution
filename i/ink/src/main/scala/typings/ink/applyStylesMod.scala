package typings.ink

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
import typings.ink.inkStrings.center
import typings.ink.inkStrings.column
import typings.ink.inkStrings.end
import typings.ink.inkStrings.flex
import typings.ink.inkStrings.middle
import typings.ink.inkStrings.none
import typings.ink.inkStrings.relative
import typings.ink.inkStrings.row
import typings.ink.inkStrings.stretch
import typings.ink.inkStrings.truncate
import typings.ink.inkStrings.wrap
import typings.yogaLayout.mod.YogaNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyStylesMod {
  
  @JSImport("ink/build/apply-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyStyles(node: YogaNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def applyStyles(node: YogaNode, style: Styles): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyles")(node.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Styles extends StObject {
    
    var alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.undefined
    
    var display: js.UndefOr[flex | none] = js.undefined
    
    var flexBasis: js.UndefOr[Double | String] = js.undefined
    
    var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.undefined
    
    var flexGrow: js.UndefOr[Double] = js.undefined
    
    var flexShrink: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.undefined
    
    var marginBottom: js.UndefOr[Double] = js.undefined
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var marginTop: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[absolute | relative] = js.undefined
    
    var textWrap: js.UndefOr[
        wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`
      ] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
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
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTextWrap(value: wrap | end | middle | `truncate-end` | truncate | `truncate-middle` | `truncate-start`): Self = StObject.set(x, "textWrap", value.asInstanceOf[js.Any])
      
      inline def setTextWrapUndefined: Self = StObject.set(x, "textWrap", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
