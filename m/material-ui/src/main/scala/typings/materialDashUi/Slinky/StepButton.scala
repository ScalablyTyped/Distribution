package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.StepperNs.StepButtonProps
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onBlur, tabIndex, onClick, onKeyDown, style, onKeyUp, onFocus, target, type, href, onMouseLeave, onTouchStart, disabled, onMouseEnter */
object StepButton
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.materialDashUi.stepperMod.StepButton] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.stepperMod.StepButton].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    containerElement: ReactNode | String = null,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardFocus: js.UndefOr[Boolean] = js.undefined,
    disableTouchRipple: js.UndefOr[Boolean] = js.undefined,
    focusRippleColor: String = null,
    focusRippleOpacity: Int | Double = null,
    icon: TagMod[Any] | String | Double = null,
    keyboardFocused: js.UndefOr[Boolean] = js.undefined,
    onKeyboardFocus: (/* e */ FocusEvent[js.Object], /* isKeyboardFocused */ Boolean) => Unit = null,
    touchRippleColor: String = null,
    touchRippleOpacity: Int | Double = null
  ): BuildingComponent[tag.type, typings.materialDashUi.stepperMod.StepButton] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (containerElement != null) __obj.updateDynamic("containerElement")(containerElement.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusRipple)) __obj.updateDynamic("disableFocusRipple")(disableFocusRipple)
    if (!js.isUndefined(disableKeyboardFocus)) __obj.updateDynamic("disableKeyboardFocus")(disableKeyboardFocus)
    if (!js.isUndefined(disableTouchRipple)) __obj.updateDynamic("disableTouchRipple")(disableTouchRipple)
    if (focusRippleColor != null) __obj.updateDynamic("focusRippleColor")(focusRippleColor)
    if (focusRippleOpacity != null) __obj.updateDynamic("focusRippleOpacity")(focusRippleOpacity.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardFocused)) __obj.updateDynamic("keyboardFocused")(keyboardFocused)
    if (onKeyboardFocus != null) __obj.updateDynamic("onKeyboardFocus")(js.Any.fromFunction2(onKeyboardFocus))
    if (touchRippleColor != null) __obj.updateDynamic("touchRippleColor")(touchRippleColor)
    if (touchRippleOpacity != null) __obj.updateDynamic("touchRippleOpacity")(touchRippleOpacity.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepButtonProps
}

