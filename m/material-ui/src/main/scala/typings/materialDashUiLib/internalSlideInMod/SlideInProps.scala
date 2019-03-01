package typings
package materialDashUiLib.internalSlideInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps
  extends reactLib.reactMod.ReactNs.Props[SlideIn] {
  var childStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var direction: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.direction] = js.undefined
  var enterDelay: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object SlideInProps {
  @scala.inline
  def apply(
    childStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    direction: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.direction = null,
    enterDelay: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[SlideIn] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): SlideInProps = {
    val __obj = js.Dynamic.literal()
    if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SlideInProps]
  }
}

