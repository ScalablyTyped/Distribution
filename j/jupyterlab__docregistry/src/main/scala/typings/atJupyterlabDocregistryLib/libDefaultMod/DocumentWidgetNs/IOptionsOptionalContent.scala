package typings
package atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptionsOptionalContent[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */]
  extends atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs.IOptionsOptionalContent[T] {
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any
}

object IOptionsOptionalContent {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */](
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any,
    content: T = null,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptionsOptionalContent[T, U] = {
    val __obj = js.Dynamic.literal(context = context)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
  }
}

