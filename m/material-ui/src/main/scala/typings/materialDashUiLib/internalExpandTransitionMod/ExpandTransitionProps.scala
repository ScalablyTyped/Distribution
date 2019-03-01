package typings
package materialDashUiLib.internalExpandTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandTransitionProps
  extends reactLib.reactMod.ReactNs.Props[ExpandTransition] {
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionDelay: js.UndefOr[scala.Double] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object ExpandTransitionProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ExpandTransition] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDelay: scala.Int | scala.Double = null,
    transitionDuration: scala.Int | scala.Double = null
  ): ExpandTransitionProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandTransitionProps]
  }
}

