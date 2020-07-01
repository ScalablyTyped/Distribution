package typings.jupyterlabApputils.collapseMod.Collapse

import typings.luminoWidgets.mod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */]
  extends typings.luminoWidgets.widgetMod.Widget.IOptions {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var widget: T
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.luminoWidgets.mod.Widget */ T](widget: T, collapsed: js.UndefOr[Boolean] = js.undefined, node: HTMLElement = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.get.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

