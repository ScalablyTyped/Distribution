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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedEnhancedButtonProps[T] extends js.Object {
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var focusRippleColor: js.UndefOr[String] = js.native
  
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[js.Object]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[js.Object]] = js.native
  
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var touchRippleColor: js.UndefOr[String] = js.native
  
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SharedEnhancedButtonProps {
  
  @scala.inline
  def apply[T](): SharedEnhancedButtonProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedEnhancedButtonProps[T]]
  }
  
  @scala.inline
  implicit class SharedEnhancedButtonPropsOps[Self <: SharedEnhancedButtonProps[_], T] (val x: Self with SharedEnhancedButtonProps[T]) extends AnyVal {
    
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
    def setCenterRipple(value: Boolean): Self = this.set("centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterRipple: Self = this.set("centerRipple", js.undefined)
    
    @scala.inline
    def setContainerElement(value: ReactNode | String): Self = this.set("containerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerElement: Self = this.set("containerElement", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = this.set("disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFocusRipple: Self = this.set("disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableKeyboardFocus(value: Boolean): Self = this.set("disableKeyboardFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableKeyboardFocus: Self = this.set("disableKeyboardFocus", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = this.set("disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTouchRipple: Self = this.set("disableTouchRipple", js.undefined)
    
    @scala.inline
    def setFocusRippleColor(value: String): Self = this.set("focusRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusRippleColor: Self = this.set("focusRippleColor", js.undefined)
    
    @scala.inline
    def setFocusRippleOpacity(value: Double): Self = this.set("focusRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusRippleOpacity: Self = this.set("focusRippleOpacity", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = this.set("keyboardFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardFocused: Self = this.set("keyboardFocused", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[js.Object] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[js.Object] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[js.Object] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[js.Object] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = this.set("onKeyboardFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyboardFocus: Self = this.set("onKeyboardFocus", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTouchRippleColor(value: String): Self = this.set("touchRippleColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRippleColor: Self = this.set("touchRippleColor", js.undefined)
    
    @scala.inline
    def setTouchRippleOpacity(value: Double): Self = this.set("touchRippleOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchRippleOpacity: Self = this.set("touchRippleOpacity", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
