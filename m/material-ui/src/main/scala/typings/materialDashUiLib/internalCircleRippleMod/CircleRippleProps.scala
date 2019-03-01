package typings
package materialDashUiLib.internalCircleRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleRippleProps
  extends reactLib.reactMod.ReactNs.Props[CircleRipple] {
  var aborted: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CircleRippleProps {
  @scala.inline
  def apply(
    aborted: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    opacity: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[CircleRipple] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CircleRippleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aborted)) __obj.updateDynamic("aborted")(aborted)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CircleRippleProps]
  }
}

