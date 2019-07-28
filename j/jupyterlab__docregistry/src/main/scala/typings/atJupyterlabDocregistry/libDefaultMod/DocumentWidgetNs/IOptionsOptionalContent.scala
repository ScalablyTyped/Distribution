package typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidgetNs

import typings.atJupyterlabApputils.libToolbarMod.Toolbar
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
  extends typings.atJupyterlabApputils.libMainareawidgetMod.MainAreaWidgetNs.IOptionsOptionalContent[T] {
  var context: IContext[U]
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T /* <: Widget */, U /* <: IModel */](
    context: IContext[U],
    content: T = null,
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
  ): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
}

