package typings.materialDashUi.__MaterialUI.Menus

import typings.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typings.materialDashUi.__MaterialUI.propTypes.origin
import typings.react.Event
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownMenuProps extends js.Object {
  // <div/> is the element that gets the 'other' properties
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var iconButton: js.UndefOr[ReactNode] = js.undefined
  var iconStyle: js.UndefOr[CSSProperties] = js.undefined
  var labelStyle: js.UndefOr[CSSProperties] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var menuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var menuStyle: js.UndefOr[CSSProperties] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* e */ SyntheticEvent[js.Object, Event], 
      /* index */ Double, 
      /* menuItemValue */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[js.Object, Event], Unit]] = js.undefined
  var openImmediately: js.UndefOr[Boolean] = js.undefined
  var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
  var selectionRenderer: js.UndefOr[js.Function2[/* value */ js.Any, /* menuItem */ js.Any, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object DropDownMenuProps {
  @scala.inline
  def apply(
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClass[PopoverAnimationProps, ComponentState] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    iconButton: ReactNode = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: CSSProperties = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* e */ SyntheticEvent[js.Object, Event], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    onClose: /* e */ SyntheticEvent[js.Object, Event] => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: (/* value */ js.Any, /* menuItem */ js.Any) => Unit = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null
  ): DropDownMenuProps = {
    val __obj = js.Dynamic.literal()
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (iconButton != null) __obj.updateDynamic("iconButton")(iconButton.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction2(selectionRenderer))
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DropDownMenuProps]
  }
}

