package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends materialDashUiLib.underscoreUnderscoreMaterialUINs.EnhancedButtonProps {
  // <EnhancedButton/> is the element that get the 'other' properties
  var autoGenerateNestedIndicator: js.UndefOr[scala.Boolean] = js.undefined
  var hoverColor: js.UndefOr[java.lang.String] = js.undefined
  var initiallyOpen: js.UndefOr[scala.Boolean] = js.undefined
  var innerDivStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var insetChildren: js.UndefOr[scala.Boolean] = js.undefined
  var leftAvatar: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var leftCheckbox: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var nestedItems: js.UndefOr[js.Array[reactLib.reactMod.ReactElement[ListItemProps]]] = js.undefined
  var nestedLevel: js.UndefOr[scala.Double] = js.undefined
  var nestedListStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var primaryText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var primaryTogglesNestedList: js.UndefOr[scala.Boolean] = js.undefined
  var rightAvatar: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var rightIconButton: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var rightToggle: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var secondaryText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var secondaryTextLines: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    EnhancedButtonProps: materialDashUiLib.underscoreUnderscoreMaterialUINs.EnhancedButtonProps = null,
    autoGenerateNestedIndicator: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hoverColor: java.lang.String = null,
    initiallyOpen: js.UndefOr[scala.Boolean] = js.undefined,
    innerDivStyle: reactLib.reactMod.CSSProperties = null,
    insetChildren: js.UndefOr[scala.Boolean] = js.undefined,
    leftAvatar: reactLib.reactMod.ReactElement[_] = null,
    leftCheckbox: reactLib.reactMod.ReactElement[_] = null,
    leftIcon: reactLib.reactMod.ReactElement[_] = null,
    nestedItems: js.Array[reactLib.reactMod.ReactElement[ListItemProps]] = null,
    nestedLevel: scala.Int | scala.Double = null,
    nestedListStyle: reactLib.reactMod.CSSProperties = null,
    onClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onKeyboardFocus: (/* e */ reactLib.reactMod.FocusEvent[js.Object], /* isKeyboardFocused */ scala.Boolean) => scala.Unit = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    onNestedListToggle: /* item */ ListItem => scala.Unit = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[js.Object] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    primaryText: reactLib.reactMod.ReactNode = null,
    primaryTogglesNestedList: js.UndefOr[scala.Boolean] = js.undefined,
    rightAvatar: reactLib.reactMod.ReactElement[_] = null,
    rightIcon: reactLib.reactMod.ReactElement[_] = null,
    rightIconButton: reactLib.reactMod.ReactElement[_] = null,
    rightToggle: reactLib.reactMod.ReactElement[_] = null,
    secondaryText: reactLib.reactMod.ReactNode = null,
    secondaryTextLines: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    value: js.Any = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, EnhancedButtonProps)
    if (!js.isUndefined(autoGenerateNestedIndicator)) __obj.updateDynamic("autoGenerateNestedIndicator")(autoGenerateNestedIndicator)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hoverColor != null) __obj.updateDynamic("hoverColor")(hoverColor)
    if (!js.isUndefined(initiallyOpen)) __obj.updateDynamic("initiallyOpen")(initiallyOpen)
    if (innerDivStyle != null) __obj.updateDynamic("innerDivStyle")(innerDivStyle)
    if (!js.isUndefined(insetChildren)) __obj.updateDynamic("insetChildren")(insetChildren)
    if (leftAvatar != null) __obj.updateDynamic("leftAvatar")(leftAvatar)
    if (leftCheckbox != null) __obj.updateDynamic("leftCheckbox")(leftCheckbox)
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (nestedItems != null) __obj.updateDynamic("nestedItems")(nestedItems)
    if (nestedLevel != null) __obj.updateDynamic("nestedLevel")(nestedLevel.asInstanceOf[js.Any])
    if (nestedListStyle != null) __obj.updateDynamic("nestedListStyle")(nestedListStyle)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onNestedListToggle != null) __obj.updateDynamic("onNestedListToggle")(js.Any.fromFunction1(onNestedListToggle))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryTogglesNestedList)) __obj.updateDynamic("primaryTogglesNestedList")(primaryTogglesNestedList)
    if (rightAvatar != null) __obj.updateDynamic("rightAvatar")(rightAvatar)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (rightIconButton != null) __obj.updateDynamic("rightIconButton")(rightIconButton)
    if (rightToggle != null) __obj.updateDynamic("rightToggle")(rightToggle)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (secondaryTextLines != null) __obj.updateDynamic("secondaryTextLines")(secondaryTextLines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ListItemProps]
  }
}

