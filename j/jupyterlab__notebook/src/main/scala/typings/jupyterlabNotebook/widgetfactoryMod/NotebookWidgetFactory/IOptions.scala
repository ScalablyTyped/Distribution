package typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory

import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a `NotebookWidgetFactory`.
  */
trait IOptions[T /* <: NotebookPanel */] extends IWidgetFactoryOptions[T] {
  /**
    * A notebook panel content factory.
    */
  var contentFactory: IContentFactory
  /**
    * The notebook cell editor configuration.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.undefined
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService
  /**
    * The notebook configuration.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.undefined
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: NotebookPanel */](
    contentFactory: IContentFactory,
    fileTypes: js.Array[String],
    mimeTypeService: IEditorMimeTypeService,
    name: String,
    rendermime: IRenderMimeRegistry,
    canStartKernel: js.UndefOr[Boolean] = js.undefined,
    defaultFor: js.Array[String] = null,
    defaultRendered: js.Array[String] = null,
    editorConfig: IEditorConfig = null,
    modelName: String = null,
    notebookConfig: INotebookConfig = null,
    preferKernel: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined,
    toolbarFactory: T => js.Array[IToolbarItem] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor.asInstanceOf[js.Any])
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered.asInstanceOf[js.Any])
    if (editorConfig != null) __obj.updateDynamic("editorConfig")(editorConfig.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (notebookConfig != null) __obj.updateDynamic("notebookConfig")(notebookConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IOptions[T]]
  }
}

