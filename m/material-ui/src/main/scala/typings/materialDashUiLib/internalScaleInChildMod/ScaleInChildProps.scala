package typings
package materialDashUiLib.internalScaleInChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInChildProps
  extends reactLib.reactMod.Props[ScaleInChild] {
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var maxScale: js.UndefOr[scala.Double] = js.undefined
  var minScale: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ScaleInChildProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.Key = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.LegacyRef[ScaleInChild] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ScaleInChildProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScaleInChildProps]
  }
}

