package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DividerProps]
  }
}

