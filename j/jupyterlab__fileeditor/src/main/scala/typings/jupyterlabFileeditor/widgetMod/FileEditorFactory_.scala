package typings.jupyterlabFileeditor.widgetMod

import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions
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

