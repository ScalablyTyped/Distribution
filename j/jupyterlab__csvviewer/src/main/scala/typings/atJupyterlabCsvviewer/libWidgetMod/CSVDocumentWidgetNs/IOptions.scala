package typings.atJupyterlabCsvviewer.libWidgetMod.CSVDocumentWidgetNs

import typings.atJupyterlabApputils.libToolbarMod.Toolbar
import typings.atJupyterlabCsvviewer.libWidgetMod.CSVViewer
import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidgetNs.IOptionsOptionalContent
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends IOptionsOptionalContent[CSVViewer, IModel] {
  var delimiter: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    context: IContext[IModel],
    content: CSVViewer = null,
    delimiter: String = null,
    node: HTMLElement = null,
    reveal: js.Promise[_] = null,
    toolbar: Toolbar[Widget] = null
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

