package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.ToolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarGroupProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var firstChild: js.UndefOr[scala.Boolean] = js.undefined
  var float: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right
  ] = js.undefined
  var lastChild: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ToolbarGroupProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    firstChild: js.UndefOr[scala.Boolean] = js.undefined,
    float: materialDashUiLib.materialDashUiLibStrings.left | materialDashUiLib.materialDashUiLibStrings.right = null,
    lastChild: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ToolbarGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(firstChild)) __obj.updateDynamic("firstChild")(firstChild)
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ToolbarGroupProps]
  }
}

