package typings
package materialDashUiLib.internalFocusRippleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusRippleProps
  extends reactLib.reactMod.ReactNs.Props[FocusRipple] {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var innerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object FocusRippleProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: java.lang.String = null,
    innerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    opacity: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[FocusRipple] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): FocusRippleProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[FocusRippleProps]
  }
}

