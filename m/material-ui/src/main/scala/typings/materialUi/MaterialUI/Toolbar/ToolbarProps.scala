package typings.materialUi.MaterialUI.Toolbar

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var noGutter: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ToolbarProps {
  @scala.inline
  def apply(
    className: String = null,
    noGutter: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noGutter)) __obj.updateDynamic("noGutter")(noGutter.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarProps]
  }
}

