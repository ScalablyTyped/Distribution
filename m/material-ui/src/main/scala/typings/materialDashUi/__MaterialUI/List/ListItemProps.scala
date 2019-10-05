package typings.materialDashUi.__MaterialUI.List

import typings.materialDashUi.__MaterialUI.EnhancedButtonProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends EnhancedButtonProps {
  // <EnhancedButton/> is the element that get the 'other' properties
  var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined
  var hoverColor: js.UndefOr[String] = js.undefined
  var initiallyOpen: js.UndefOr[Boolean] = js.undefined
  var innerDivStyle: js.UndefOr[CSSProperties] = js.undefined
  var insetChildren: js.UndefOr[Boolean] = js.undefined
  var leftAvatar: js.UndefOr[ReactElement] = js.undefined
  var leftCheckbox: js.UndefOr[ReactElement] = js.undefined
  var leftIcon: js.UndefOr[ReactElement] = js.undefined
  var nestedItems: js.UndefOr[js.Array[ReactElement]] = js.undefined
  var nestedLevel: js.UndefOr[Double] = js.undefined
  var nestedListStyle: js.UndefOr[CSSProperties] = js.undefined
  var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var primaryText: js.UndefOr[ReactNode] = js.undefined
  var primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined
  var rightAvatar: js.UndefOr[ReactElement] = js.undefined
  var rightIcon: js.UndefOr[ReactElement] = js.undefined
  var rightIconButton: js.UndefOr[ReactElement] = js.undefined
  var rightToggle: js.UndefOr[ReactElement] = js.undefined
  var secondaryText: js.UndefOr[ReactNode] = js.undefined
  var secondaryTextLines: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    EnhancedButtonProps: EnhancedButtonProps = null,
    autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hoverColor: String = null,
    initiallyOpen: js.UndefOr[Boolean] = js.undefined,
    innerDivStyle: CSSProperties = null,
    insetChildren: js.UndefOr[Boolean] = js.undefined,
    leftAvatar: ReactElement = null,
    leftCheckbox: ReactElement = null,
    leftIcon: ReactElement = null,
    nestedItems: js.Array[ReactElement] = null,
    nestedLevel: Int | Double = null,
    nestedListStyle: CSSProperties = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onMouseEnter: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onNestedListToggle: /* item */ ListItem => Unit = null,
    onTouchStart: TouchEvent[js.Object] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    primaryText: ReactNode = null,
    primaryTogglesNestedList: js.UndefOr[Boolean] = js.undefined,
    rightAvatar: ReactElement = null,
    rightIcon: ReactElement = null,
    rightIconButton: ReactElement = null,
    rightToggle: ReactElement = null,
    secondaryText: ReactNode = null,
    secondaryTextLines: Int | Double = null,
    style: CSSProperties = null,
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onNestedListToggle != null) __obj.updateDynamic("onNestedListToggle")(js.Any.fromFunction1(onNestedListToggle))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
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

