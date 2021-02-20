package typings.materialUi.MaterialUI

import typings.materialUi.MaterialUI.propTypes.cornersAndCenter
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait IconButtonProps
  extends HTMLAttributes[js.Object] {
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusRippleColor: js.UndefOr[String] = js.native
  
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  
  var hoveredStyle: js.UndefOr[CSSProperties] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var iconClassName: js.UndefOr[String] = js.native
  
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[ReactNode | String] = js.native
  
  var tooltipPosition: js.UndefOr[cornersAndCenter] = js.native
  
  var tooltipStyles: js.UndefOr[CSSProperties] = js.native
  
  var touch: js.UndefOr[Boolean] = js.native
  
  var touchRippleColor: js.UndefOr[String] = js.native
  
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object IconButtonProps {
  
  @scala.inline
  def apply(): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonProps]
  }
  
  @scala.inline
  implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    @scala.inline
    def setContainerElement(value: ReactNode | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableKeyboardFocus(value: Boolean): Self = StObject.set(x, "disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableKeyboardFocusUndefined: Self = StObject.set(x, "disableKeyboardFocus", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFocusRippleColor(value: String): Self = StObject.set(x, "focusRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleColorUndefined: Self = StObject.set(x, "focusRippleColor", js.undefined)
    
    @scala.inline
    def setFocusRippleOpacity(value: Double): Self = StObject.set(x, "focusRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleOpacityUndefined: Self = StObject.set(x, "focusRippleOpacity", js.undefined)
    
    @scala.inline
    def setHoveredStyle(value: CSSProperties): Self = StObject.set(x, "hoveredStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoveredStyleUndefined: Self = StObject.set(x, "hoveredStyle", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = StObject.set(x, "keyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyboardFocusedUndefined: Self = StObject.set(x, "keyboardFocused", js.undefined)
    
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTooltip(value: ReactNode | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPosition(value: cornersAndCenter): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
    
    @scala.inline
    def setTooltipStyles(value: CSSProperties): Self = StObject.set(x, "tooltipStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipStylesUndefined: Self = StObject.set(x, "tooltipStyles", js.undefined)
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleColor(value: String): Self = StObject.set(x, "touchRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleColorUndefined: Self = StObject.set(x, "touchRippleColor", js.undefined)
    
    @scala.inline
    def setTouchRippleOpacity(value: Double): Self = StObject.set(x, "touchRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRippleOpacityUndefined: Self = StObject.set(x, "touchRippleOpacity", js.undefined)
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
