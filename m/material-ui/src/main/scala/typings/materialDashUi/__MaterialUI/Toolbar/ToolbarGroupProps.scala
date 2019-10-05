package typings.materialDashUi.__MaterialUI.Toolbar

import typings.materialDashUi.materialDashUiStrings.left
import typings.materialDashUi.materialDashUiStrings.right
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var firstChild: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[left | right] = js.undefined
  var lastChild: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ToolbarGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    firstChild: js.UndefOr[Boolean] = js.undefined,
    float: left | right = null,
    lastChild: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
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

