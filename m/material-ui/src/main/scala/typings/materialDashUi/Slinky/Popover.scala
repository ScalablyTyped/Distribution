package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typings.materialDashUi.popoverMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, open, className */
object Popover
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.popoverMod.default].asInstanceOf[String | js.Object]
  def apply(
    anchorEl: ReactInstance = null,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined,
    canAutoPosition: js.UndefOr[Boolean] = js.undefined,
    onRequestClose: /* reason */ String => Unit = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    zDepth: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoCloseWhenOffScreen)) __obj.updateDynamic("autoCloseWhenOffScreen")(autoCloseWhenOffScreen)
    if (!js.isUndefined(canAutoPosition)) __obj.updateDynamic("canAutoPosition")(canAutoPosition)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PopoverProps
}

