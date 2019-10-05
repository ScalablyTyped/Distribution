package typings.materialDashUi.__MaterialUI.Popover

import typings.materialDashUi.__MaterialUI.propTypes.origin
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var anchorEl: js.UndefOr[ReactInstance] = js.undefined
  var anchorOrigin: js.UndefOr[origin] = js.undefined
  var animated: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[ComponentClass[PopoverAnimationProps, ComponentState]] = js.undefined
  var autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined
  var canAutoPosition: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    anchorEl: ReactInstance = null,
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ComponentClass[PopoverAnimationProps, ComponentState] = null,
    autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined,
    canAutoPosition: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    onRequestClose: /* reason */ String => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    zDepth: Int | Double = null
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

