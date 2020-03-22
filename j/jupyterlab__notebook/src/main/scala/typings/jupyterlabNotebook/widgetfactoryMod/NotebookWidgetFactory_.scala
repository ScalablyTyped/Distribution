package typings.jupyterlabNotebook.widgetfactoryMod

import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.mod.ABCWidgetFactory
import typings.jupyterlabNotebook.modelMod.INotebookModel
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory.IOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widgetfactory", "NotebookWidgetFactory")
@js.native
class NotebookWidgetFactory_ protected () extends ABCWidgetFactory[NotebookPanel, INotebookModel] {
  /**
    * Construct a new notebook widget factory.
    *
    * @param options - The options used to construct the factory.
    */
  def this(options: IOptions[NotebookPanel]) = this()
  var _editorConfig: js.Any = js.native
  var _notebookConfig: js.Any = js.native
  var _sessionDialogs: js.Any = js.native
  /**
    * The content factory used by the widget factory.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The service used to look up mime types.
    */
  val mimeTypeService: IEditorMimeTypeService = js.native
  val rendermime: IRenderMimeRegistry = js.native
  /**
    * A configuration object for cell editor settings.
    */
  def editorConfig(): IEditorConfig = js.native
  def editorConfig(value: IEditorConfig): js.Any = js.native
  /**
    * A configuration object for notebook settings.
    */
  def notebookConfig(): INotebookConfig = js.native
  def notebookConfig(value: INotebookConfig): js.Any = js.native
}

