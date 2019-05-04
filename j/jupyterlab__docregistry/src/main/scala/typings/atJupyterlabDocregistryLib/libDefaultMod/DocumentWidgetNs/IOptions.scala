package typings
package atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */]
  extends atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs.IOptions[T] {
  var context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any
}

object IOptions {
  @scala.inline
  def apply[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any */](
    content: T,
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context)
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

