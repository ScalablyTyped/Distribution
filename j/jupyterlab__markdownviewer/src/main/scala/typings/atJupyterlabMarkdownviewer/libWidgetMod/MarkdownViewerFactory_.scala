package typings.atJupyterlabMarkdownviewer.libWidgetMod

import typings.atJupyterlabDocregistry.libMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/markdownviewer/lib/widget", "MarkdownViewerFactory")
@js.native
class MarkdownViewerFactory_ protected () extends ABCWidgetFactory[MarkdownDocument, IModel] {
  /**
    * Construct a new mimetype widget factory.
    */
  def this(options: IOptions) = this()
  var _fileType: js.Any = js.native
  var _rendermime: js.Any = js.native
}

