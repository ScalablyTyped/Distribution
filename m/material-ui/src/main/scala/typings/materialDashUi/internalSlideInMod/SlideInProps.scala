package typings.materialDashUi.internalSlideInMod

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.direction
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideInProps extends Props[SlideIn] {
  var childStyle: js.UndefOr[CSSProperties] = js.undefined
  var direction: js.UndefOr[typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.direction] = js.undefined
  var enterDelay: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SlideInProps {
  @scala.inline
  def apply(
    childStyle: CSSProperties = null,
    children: ReactNode = null,
    direction: direction = null,
    enterDelay: Int | Double = null,
    key: Key = null,
    ref: LegacyRef[SlideIn] = null,
    style: CSSProperties = null
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

