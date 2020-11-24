package typings.jupyterlabConsole.widgetMod.CodeConsole

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The initialization options for a console widget.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The content factory for the console widget.
    */
  var contentFactory: IContentFactory = js.native
  
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.native
  
  /**
    * The mime renderer for the console widget.
    */
  var rendermime: IRenderMimeRegistry = js.native
  
  /**
    * The client session for the console widget.
    */
  var sessionContext: ISessionContext = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry,
    sessionContext: ISessionContext
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], sessionContext = sessionContext.asInstanceOf[js.Any])
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
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeService(value: IEditorMimeTypeService): Self = this.set("mimeTypeService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionContext(value: ISessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelFactory(value: IModelFactory): Self = this.set("modelFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelFactory: Self = this.set("modelFactory", js.undefined)
  }
}
