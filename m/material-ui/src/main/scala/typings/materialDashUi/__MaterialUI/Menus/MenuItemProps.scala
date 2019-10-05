package typings.materialDashUi.__MaterialUI.Menus

import typings.materialDashUi.__MaterialUI.List.ListItemProps
import typings.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends ListItemProps {
  // <ListItem/> is the element that get the 'other' properties
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  @JSName("containerElement")
  var containerElement_MenuItemProps: js.UndefOr[ReactNode | String] = js.undefined
  var desktop: js.UndefOr[Boolean] = js.undefined
  var focusState: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
  var menuItems: js.UndefOr[ReactNode] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    ListItemProps: ListItemProps = null,
    animation: ComponentClass[PopoverAnimationProps, ComponentState] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusState: String = null,
    innerDivStyle: CSSProperties = null,
    insetChildren: js.UndefOr[Boolean] = js.undefined,
    label: String | ReactNode = null,
    leftIcon: ReactElement = null,
    menuItems: ReactNode = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    primaryText: ReactNode = null,
    rightIcon: ReactElement = null,
    secondaryText: ReactNode = null,
    style: CSSProperties = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ListItemProps)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (focusState != null) __obj.updateDynamic("focusState")(focusState)
    if (innerDivStyle != null) __obj.updateDynamic("innerDivStyle")(innerDivStyle)
    if (!js.isUndefined(insetChildren)) __obj.updateDynamic("insetChildren")(insetChildren)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText.asInstanceOf[js.Any])
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MenuItemProps]
  }
}

