package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverAnimationDefaultProps extends PopoverAnimationProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var targetOrigin: js.UndefOr[materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin] = js.undefined
  var zDepth: js.UndefOr[scala.Double] = js.undefined
}

object PopoverAnimationDefaultProps {
  @scala.inline
  def apply(
    open: scala.Boolean,
    className: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    targetOrigin: materialDashUiLib.underscoreUnderscoreMaterialUINs.propTypesNs.origin = null,
    zDepth: scala.Int | scala.Double = null
  ): PopoverAnimationDefaultProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverAnimationDefaultProps]
  }
}

