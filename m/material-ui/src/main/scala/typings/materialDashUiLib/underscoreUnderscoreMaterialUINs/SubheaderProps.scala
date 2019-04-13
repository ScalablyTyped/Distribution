package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubheaderProps extends js.Object {
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SubheaderProps {
  @scala.inline
  def apply(inset: js.UndefOr[scala.Boolean] = js.undefined, style: reactLib.reactMod.CSSProperties = null): SubheaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SubheaderProps]
  }
}

