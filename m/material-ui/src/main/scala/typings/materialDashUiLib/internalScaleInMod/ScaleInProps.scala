package typings
package materialDashUiLib.internalScaleInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleInProps
  extends reactLib.reactMod.Props[ScaleIn] {
  var childStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var maxScale: js.UndefOr[scala.Double] = js.undefined
  var minScale: js.UndefOr[scala.Double] = js.undefined
}

object ScaleInProps {
  @scala.inline
  def apply(
    childStyle: reactLib.reactMod.CSSProperties = null,
    children: reactLib.reactMod.ReactNode = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.Key = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.LegacyRef[ScaleIn] = null
  ): ScaleInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInProps]
  }
}

