package typings
package atJupyterlabCsvviewerLib.libWidgetMod.CSVDocumentWidgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends atJupyterlabDocregistryLib.libDefaultMod.DocumentWidgetNs.IOptionsOptionalContent[
      atJupyterlabCsvviewerLib.libWidgetMod.CSVViewer, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IModel */ js.Any
    ] {
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    context: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DocumentRegistry.IContext<U> */ js.Any,
    content: atJupyterlabCsvviewerLib.libWidgetMod.CSVViewer = null,
    delimiter: java.lang.String = null,
    node: stdLib.HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context)
    if (content != null) __obj.updateDynamic("content")(content)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (node != null) __obj.updateDynamic("node")(node)
    if (reveal != null) __obj.updateDynamic("reveal")(reveal)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[IOptions]
  }
}

