package typings.atJupyterlabLogconsole.libWidgetMod.ScrollingWidget

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */]
  extends typings.atPhosphorWidgets.libWidgetMod.Widget.IOptions {
  var content: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */](content: T, node: HTMLElement = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[IOptions[T]]
  }
}

