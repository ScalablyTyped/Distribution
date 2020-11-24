package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a static notebook.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A factory for creating content.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  
  /**
    * A configuration object for the cell editor settings.
    */
  var editorConfig: js.UndefOr[IEditorConfig] = js.native
  
  /**
    * The language preference for the model.
    */
  var languagePreference: js.UndefOr[String] = js.native
  
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  
  /**
    * A configuration object for notebook settings.
    */
  var notebookConfig: js.UndefOr[INotebookConfig] = js.native
  
  /**
    * The rendermime instance used by the widget.
    */
  var rendermime: IRenderMimeRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(mimeTypeService: IEditorMimeTypeService, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setMimeTypeService(value: IEditorMimeTypeService): Self = this.set("mimeTypeService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFactory: Self = this.set("contentFactory", js.undefined)
    
    @scala.inline
    def setEditorConfig(value: IEditorConfig): Self = this.set("editorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorConfig: Self = this.set("editorConfig", js.undefined)
    
    @scala.inline
    def setLanguagePreference(value: String): Self = this.set("languagePreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguagePreference: Self = this.set("languagePreference", js.undefined)
    
    @scala.inline
    def setNotebookConfig(value: INotebookConfig): Self = this.set("notebookConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotebookConfig: Self = this.set("notebookConfig", js.undefined)
  }
}
