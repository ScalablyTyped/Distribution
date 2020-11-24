package typings.jupyterlabConsole.panelMod.ConsolePanel

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabCodeeditor.mimetypeMod.IEditorMimeTypeService
import typings.jupyterlabConsole.widgetMod.CodeConsole.IModelFactory
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The initialization options for a console panel.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The base path for a new console.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * The content factory for the panel.
    */
  var contentFactory: IContentFactory = js.native
  
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  
  /**
    * The service manager used by the panel.
    */
  var manager: IManager = js.native
  
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: IEditorMimeTypeService = js.native
  
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.native
  
  /**
    * The name of the console.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The path of an existing console.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The rendermime instance used by the panel.
    */
  var rendermime: IRenderMimeRegistry = js.native
  
  /**
    * An existing session context to use.
    */
  var sessionContext: js.UndefOr[ISessionContext] = js.native
  
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    manager: IManager,
    mimeTypeService: IEditorMimeTypeService,
    rendermime: IRenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], mimeTypeService = mimeTypeService.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
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
    def setManager(value: IManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeService(value: IEditorMimeTypeService): Self = this.set("mimeTypeService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setKernelPreference(value: IKernelPreference): Self = this.set("kernelPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelPreference: Self = this.set("kernelPreference", js.undefined)
    
    @scala.inline
    def setModelFactory(value: IModelFactory): Self = this.set("modelFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelFactory: Self = this.set("modelFactory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSessionContext(value: ISessionContext): Self = this.set("sessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionContext: Self = this.set("sessionContext", js.undefined)
    
    @scala.inline
    def setSetBusy(value: () => IDisposable): Self = this.set("setBusy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetBusy: Self = this.set("setBusy", js.undefined)
  }
}
