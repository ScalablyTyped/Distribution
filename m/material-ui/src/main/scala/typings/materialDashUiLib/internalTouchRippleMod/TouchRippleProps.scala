package typings
package materialDashUiLib.internalTouchRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchRippleProps
  extends reactLib.reactMod.ReactNs.Props[TouchRipple] {
  var abortOnScroll: js.UndefOr[scala.Boolean] = js.undefined
  var centerRipple: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TouchRippleProps {
  @scala.inline
  def apply(
    abortOnScroll: js.UndefOr[scala.Boolean] = js.undefined,
    centerRipple: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    opacity: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[TouchRipple] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TouchRippleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnScroll)) __obj.updateDynamic("abortOnScroll")(abortOnScroll)
    if (!js.isUndefined(centerRipple)) __obj.updateDynamic("centerRipple")(centerRipple)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TouchRippleProps]
  }
}

