package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSeparatorProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ToolbarSeparatorProps {
  @scala.inline
  def apply(className: java.lang.String = null, style: reactLib.reactMod.ReactNs.CSSProperties = null): ToolbarSeparatorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToolbarSeparatorProps]
  }
}

