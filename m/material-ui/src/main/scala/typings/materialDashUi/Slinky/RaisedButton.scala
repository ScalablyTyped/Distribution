package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.materialDashUiStrings.after
import typings.materialDashUi.materialDashUiStrings.before
import typings.materialDashUi.raisedButtonMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.RaisedButtonProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, tabIndex, onClick, onKeyDown, style, onKeyUp, onFocus, target, type, href, onMouseLeave, onTouchStart, onMouseUp, onTouchEnd, className, disabled, onMouseEnter, onMouseDown */
object RaisedButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.raisedButtonMod.default].asInstanceOf[String | js.Object]
  def apply(
    backgroundColor: String = null,
    buttonStyle: CSSProperties = null,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    disabledBackgroundColor: String = null,
    disabledLabelColor: String = null,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    icon: TagMod[Any] = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    labelColor: String = null,
    labelPosition: before | after = null,
    labelStyle: CSSProperties = null,
    linkButton: js.UndefOr[Boolean] = js.undefined,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    overlayStyle: CSSProperties = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    rippleStyle: CSSProperties = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (disabledBackgroundColor != null) __obj.updateDynamic("disabledBackgroundColor")(disabledBackgroundColor)
    if (disabledLabelColor != null) __obj.updateDynamic("disabledLabelColor")(disabledLabelColor)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (!js.isUndefined(linkButton)) __obj.updateDynamic("linkButton")(linkButton)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (rippleStyle != null) __obj.updateDynamic("rippleStyle")(rippleStyle)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RaisedButtonProps
}

