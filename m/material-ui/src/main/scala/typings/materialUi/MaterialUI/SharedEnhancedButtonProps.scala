package typings.materialUi.MaterialUI

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedEnhancedButtonProps[T] extends StObject {
  
  var centerRipple: js.UndefOr[Boolean] = js.undefined
  
  var containerElement: js.UndefOr[ReactNode | String] = js.undefined
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
  
  var focusRippleColor: js.UndefOr[String] = js.undefined
  
  var focusRippleOpacity: js.UndefOr[Double] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var keyboardFocused: js.UndefOr[Boolean] = js.undefined
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var touchRippleColor: js.UndefOr[String] = js.undefined
  
  var touchRippleOpacity: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object SharedEnhancedButtonProps {
  
  inline def apply[T](): SharedEnhancedButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedEnhancedButtonProps[T]]
  }
  
  extension [Self <: SharedEnhancedButtonProps[?], T](x: Self & SharedEnhancedButtonProps[T]) {
    
    inline def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    inline def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    inline def setContainerElement(value: ReactNode | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
    
    inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisableKeyboardFocus(value: Boolean): Self = StObject.set(x, "disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    inline def setDisableKeyboardFocusUndefined: Self = StObject.set(x, "disableKeyboardFocus", js.undefined)
    
    inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    inline def setFocusRippleColor(value: String): Self = StObject.set(x, "focusRippleColor", value.asInstanceOf[js.Any])
    
    inline def setFocusRippleColorUndefined: Self = StObject.set(x, "focusRippleColor", js.undefined)
    
    inline def setFocusRippleOpacity(value: Double): Self = StObject.set(x, "focusRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def setFocusRippleOpacityUndefined: Self = StObject.set(x, "focusRippleOpacity", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setKeyboardFocused(value: Boolean): Self = StObject.set(x, "keyboardFocused", value.asInstanceOf[js.Any])
    
    inline def setKeyboardFocusedUndefined: Self = StObject.set(x, "keyboardFocused", js.undefined)
    
    inline def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: KeyboardEvent[js.Object] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2(value))
    
    inline def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTouchRippleColor(value: String): Self = StObject.set(x, "touchRippleColor", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleColorUndefined: Self = StObject.set(x, "touchRippleColor", js.undefined)
    
    inline def setTouchRippleOpacity(value: Double): Self = StObject.set(x, "touchRippleOpacity", value.asInstanceOf[js.Any])
    
    inline def setTouchRippleOpacityUndefined: Self = StObject.set(x, "touchRippleOpacity", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
