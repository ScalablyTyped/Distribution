package typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs

import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverAnimationVerticalProps extends PopoverAnimationProps {
  var className: js.UndefOr[String] = js.undefined
  var targetOrigin: js.UndefOr[origin] = js.undefined
  var zDepth: js.UndefOr[Double] = js.undefined
}

object PopoverAnimationVerticalProps {
  @scala.inline
  def apply(
    open: Boolean,
    className: String = null,
    style: CSSProperties = null,
    targetOrigin: origin = null,
    zDepth: Int | Double = null
  ): PopoverAnimationVerticalProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverAnimationVerticalProps]
  }
}

