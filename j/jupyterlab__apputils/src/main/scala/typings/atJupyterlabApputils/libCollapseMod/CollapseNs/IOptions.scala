package typings.atJupyterlabApputils.libCollapseMod.CollapseNs

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */]
  extends typings.atPhosphorWidgets.libWidgetMod.WidgetNs.IOptions {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var widget: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */](widget: T, collapsed: js.UndefOr[Boolean] = js.undefined, node: HTMLElement = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[IOptions[T]]
  }
}

