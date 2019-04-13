package typings
package materialDashUiLib.internalExpandTransitionChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandTransitionChildProps
  extends reactLib.reactMod.Props[ExpandTransitionChild] {
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var transitionDelay: js.UndefOr[scala.Double] = js.undefined
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object ExpandTransitionChildProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[ExpandTransitionChild] = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionDelay: scala.Int | scala.Double = null,
    transitionDuration: scala.Int | scala.Double = null
  ): ExpandTransitionChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDelay != null) __obj.updateDynamic("transitionDelay")(transitionDelay.asInstanceOf[js.Any])
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandTransitionChildProps]
  }
}

