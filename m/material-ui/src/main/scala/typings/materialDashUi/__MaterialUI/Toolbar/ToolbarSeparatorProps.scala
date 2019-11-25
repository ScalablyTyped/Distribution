package typings.materialDashUi.__MaterialUI.Toolbar

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarSeparatorProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ToolbarSeparatorProps {
  @scala.inline
  def apply(className: String = null, style: CSSProperties = null): ToolbarSeparatorProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarSeparatorProps]
  }
}

