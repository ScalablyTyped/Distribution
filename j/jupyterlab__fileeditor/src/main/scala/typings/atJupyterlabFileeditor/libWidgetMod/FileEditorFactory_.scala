package typings.atJupyterlabFileeditor.libWidgetMod

import typings.atJupyterlabDocregistry.libMod.ABCWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.ICodeModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditorFactory")
@js.native
class FileEditorFactory_ protected () extends ABCWidgetFactory[IDocumentWidget[FileEditor, IModel], ICodeModel] {
  /**
    * Construct a new editor widget factory.
    */
  def this(options: IOptions) = this()
  var _services: js.Any = js.native
}

