package typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverAnimationProps extends js.Object {
  var open: Boolean
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PopoverAnimationProps {
  @scala.inline
  def apply(open: Boolean, style: CSSProperties = null): PopoverAnimationProps = {
    val __obj = js.Dynamic.literal(open = open)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PopoverAnimationProps]
  }
}

