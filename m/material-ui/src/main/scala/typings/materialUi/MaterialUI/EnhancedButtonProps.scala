package typings.materialUi.MaterialUI

import typings.react.mod.FocusEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp, style, tabIndex. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait EnhancedButtonProps
  extends HTMLAttributes[js.Object] {
  var centerRipple: js.UndefOr[Boolean] = js.native
  // container element, <button/>, or <span/>(if disabled link) is the element that get the 'other' properties
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var focusRippleColor: js.UndefOr[String] = js.native
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  var href: js.UndefOr[String] = js.native
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  var target: js.UndefOr[String] = js.native
  var touchRippleColor: js.UndefOr[String] = js.native
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object EnhancedButtonProps {
  @scala.inline
  def apply(): EnhancedButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedButtonProps]
  }
  @scala.inline
  implicit class EnhancedButtonPropsOps[Self <: EnhancedButtonProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
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
    def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = this.set("onKeyboardFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyboardFocus: Self = this.set("onKeyboardFocus", js.undefined)
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

