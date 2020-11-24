package typings.jupyterlabNotebook.widgetfactoryMod.NotebookWidgetFactory

import typings.jupyterlabApputils.tokensMod.ISessionContextDialogs
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.panelMod.NotebookPanel.IContentFactory
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.IEditorConfig
import typings.jupyterlabNotebook.widgetMod.StaticNotebook.INotebookConfig
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to construct a `NotebookWidgetFactory`.
  */
@js.native
trait IOptions[T /* <: NotebookPanel */] extends IWidgetFactoryOptions[T] {
  
  /**
    * A notebook panel content factory.
    */
  var contentFactory: IContentFactory = js.native
  
  /**
    * The notebook cell editor configuration.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.native
  
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  
  /**
    * The notebook configuration.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.native
  
  var rendermime: IRenderMimeRegistry = js.native
  
  /**
    * The session context dialogs.
    */
  var sessionDialogs: js.UndefOr[ISessionContextDialogs] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: NotebookPanel */](
    contentFactory: IContentFactory,
    fileTypes: js.Array[String],
    mimeTypeService: IEditorMimeTypeService,
    name: String,
    rendermime: IRenderMimeRegistry
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], fileTypes = fileTypes.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: NotebookPanel */] (val x: Self with IOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeService(value: IEditorMimeTypeService): Self = this.set("mimeTypeService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorConfig(value: IEditorConfig): Self = this.set("editorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorConfig: Self = this.set("editorConfig", js.undefined)
    
    @scala.inline
    def setNotebookConfig(value: INotebookConfig): Self = this.set("notebookConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookConfig: Self = this.set("notebookConfig", js.undefined)
    
    @scala.inline
    def setSessionDialogs(value: ISessionContextDialogs): Self = this.set("sessionDialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDialogs: Self = this.set("sessionDialogs", js.undefined)
  }
}
