package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var noGutter: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    noGutter: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(noGutter)) __obj.updateDynamic("noGutter")(noGutter)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToolbarProps]
  }
}

