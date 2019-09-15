package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.iconMenuMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.IconMenuProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onMouseLeave, style, open, onMouseUp, className, multiple, value, onMouseEnter, onMouseDown */
object IconMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.iconMenuMod.default].asInstanceOf[String | js.Object]
  def apply(
    iconButtonElement: ReactElement,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    clickCloseDelay: Int | Double = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onClick: /* e */ SyntheticEvent[js.Object, typings.react.Event] => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* item */ typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.MenuItem) => Unit = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Unit = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement)
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (clickCloseDelay != null) __obj.updateDynamic("clickCloseDelay")(clickCloseDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IconMenuProps
}

