package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.PopoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverAnimationProps extends js.Object {
  var open: scala.Boolean
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object PopoverAnimationProps {
  @scala.inline
  def apply(open: scala.Boolean, style: reactLib.reactMod.CSSProperties = null): PopoverAnimationProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PopoverAnimationProps]
  }
}

