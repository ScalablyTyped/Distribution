package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.bottomNavigationBottomNavigationItemMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.BottomNavigationNs.BottomNavigationItemProps
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, tabIndex, onClick, onKeyDown, style, onKeyUp, onFocus, target, type, href, className */
object BottomNavigationItem
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.bottomNavigationBottomNavigationItemMod.default].asInstanceOf[String | js.Object]
  def apply(
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    icon: TagMod[Any] = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    label: TagMod[Any] = null,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BottomNavigationItemProps
}

