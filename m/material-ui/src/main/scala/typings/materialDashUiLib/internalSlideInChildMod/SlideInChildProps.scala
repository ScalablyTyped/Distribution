package typings
package materialDashUiLib.internalSlideInChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInChildProps
  extends reactLib.reactMod.ReactNs.Props[SlideInChild] {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var getLeaveDirection: js.Function
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object SlideInChildProps {
  @scala.inline
  def apply(
    getLeaveDirection: js.Function,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    direction: java.lang.String = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[SlideInChild] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SlideInChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLeaveDirection")(getLeaveDirection)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SlideInChildProps]
  }
}

