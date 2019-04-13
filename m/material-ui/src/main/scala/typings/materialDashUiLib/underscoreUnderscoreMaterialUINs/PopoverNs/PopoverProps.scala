package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var anchorEl: js.UndefOr[reactLib.reactMod.ReactInstance] = js.undefined
  var anchorOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[
    reactLib.reactMod.ComponentClass[PopoverAnimationProps, reactLib.reactMod.ComponentState]
  ] = js.undefined
  var autoCloseWhenOffScreen: js.UndefOr[scala.Boolean] = js.undefined
  var canAutoPosition: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ java.lang.String, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    anchorEl: reactLib.reactMod.ReactInstance = null,
    anchorOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animation: reactLib.reactMod.ComponentClass[PopoverAnimationProps, reactLib.reactMod.ComponentState] = null,
    autoCloseWhenOffScreen: js.UndefOr[scala.Boolean] = js.undefined,
    canAutoPosition: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    onRequestClose: /* reason */ java.lang.String => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    targetOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    useLayerForClickAway: js.UndefOr[scala.Boolean] = js.undefined,
    zDepth: scala.Int | scala.Double = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (anchorEl != null) __obj.updateDynamic("anchorEl")(anchorEl.asInstanceOf[js.Any])
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoCloseWhenOffScreen)) __obj.updateDynamic("autoCloseWhenOffScreen")(autoCloseWhenOffScreen)
    if (!js.isUndefined(canAutoPosition)) __obj.updateDynamic("canAutoPosition")(canAutoPosition)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction1(onRequestClose))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

