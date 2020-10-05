package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.after
import typings.materialUi.materialUiStrings.before
import typings.react.mod.CSSProperties
import typings.react.mod.DOMAttributes
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.materialUi.MaterialUI.SharedEnhancedButtonProps because var conflicts: onBlur, onClick, onFocus, onKeyDown, onKeyUp. Inlined centerRipple, disableFocusRipple, disableKeyboardFocus, disableTouchRipple, focusRippleColor, focusRippleOpacity, href, keyboardFocused, onKeyboardFocus, style, tabIndex, target, touchRippleColor, touchRippleOpacity, `type`, containerElement */ @js.native
trait FlatButtonProps
  extends DOMAttributes[js.Object] {
  // <EnhancedButton/> is the element that get the 'other' properties
  var backgroundColor: js.UndefOr[String] = js.native
  var centerRipple: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var containerElement: js.UndefOr[ReactNode | String] = js.native
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  var disableKeyboardFocus: js.UndefOr[Boolean] = js.native
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var focusRippleColor: js.UndefOr[String] = js.native
  var focusRippleOpacity: js.UndefOr[Double] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var href: js.UndefOr[String] = js.native
  var icon: js.UndefOr[ReactNode] = js.native
  var keyboardFocused: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var labelPosition: js.UndefOr[before | after] = js.native
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  var linkButton: js.UndefOr[Boolean] = js.native
  var onKeyboardFocus: js.UndefOr[
    js.Function2[/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean, Unit]
  ] = js.native
  var primary: js.UndefOr[Boolean] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var secondary: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  var target: js.UndefOr[String] = js.native
  var touchRippleColor: js.UndefOr[String] = js.native
  var touchRippleOpacity: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object FlatButtonProps {
  @scala.inline
  def apply(): FlatButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatButtonProps]
  }
  @scala.inline
  implicit class FlatButtonPropsOps[Self <: FlatButtonProps] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCenterRipple(value: Boolean): Self = this.set("centerRipple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterRipple: Self = this.set("centerRipple", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
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
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setKeyboardFocused(value: Boolean): Self = this.set("keyboardFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardFocused: Self = this.set("keyboardFocused", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLabelPosition(value: before | after): Self = this.set("labelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPosition: Self = this.set("labelPosition", js.undefined)
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    @scala.inline
    def setLinkButton(value: Boolean): Self = this.set("linkButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkButton: Self = this.set("linkButton", js.undefined)
    @scala.inline
    def setOnKeyboardFocus(value: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit): Self = this.set("onKeyboardFocus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyboardFocus: Self = this.set("onKeyboardFocus", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setRippleColor(value: String): Self = this.set("rippleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRippleColor: Self = this.set("rippleColor", js.undefined)
    @scala.inline
    def setSecondary(value: Boolean): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
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

