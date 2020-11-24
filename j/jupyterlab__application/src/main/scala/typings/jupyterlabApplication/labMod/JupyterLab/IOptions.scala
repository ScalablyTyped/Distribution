package typings.jupyterlabApplication.labMod.JupyterLab

import typings.jupyterlabApplication.anon.Matches
import typings.jupyterlabApplication.anon.PartialIPaths
import typings.jupyterlabApplication.shellMod.LabShell
import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.jupyterlabServices.mod.ServiceManager
import typings.luminoWidgets.menuMod.Menu.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a JupyterLab object.
  */
/* Inlined parent @jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IOptions<@jupyterlab/application.@jupyterlab/application/lib/shell.LabShell, any> */
/* Inlined parent std.Partial<@jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo> */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.native
  
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.native
  
  var deferred: js.UndefOr[Matches] = js.native
  
  var devMode: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Matches] = js.native
  
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.native
  
  var filesCached: js.UndefOr[Boolean] = js.native
  
  var mimeExtensions: js.UndefOr[js.Array[IExtensionModule]] = js.native
  
  var paths: js.UndefOr[PartialIPaths] = js.native
  
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[_]] = js.native
  
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.native
  
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: LabShell = js.native
}
object IOptions {
  
  @scala.inline
  def apply(shell: LabShell): IOptions = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
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
    def setShell(value: LabShell): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandLinker(value: CommandLinker): Self = this.set("commandLinker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandLinker: Self = this.set("commandLinker", js.undefined)
    
    @scala.inline
    def setContextMenuRenderer(value: IRenderer): Self = this.set("contextMenuRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuRenderer: Self = this.set("contextMenuRenderer", js.undefined)
    
    @scala.inline
    def setDeferred(value: Matches): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    
    @scala.inline
    def setDevMode(value: Boolean): Self = this.set("devMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevMode: Self = this.set("devMode", js.undefined)
    
    @scala.inline
    def setDisabled(value: Matches): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDocRegistry(value: DocumentRegistry): Self = this.set("docRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocRegistry: Self = this.set("docRegistry", js.undefined)
    
    @scala.inline
    def setFilesCached(value: Boolean): Self = this.set("filesCached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilesCached: Self = this.set("filesCached", js.undefined)
    
    @scala.inline
    def setMimeExtensionsVarargs(value: IExtensionModule*): Self = this.set("mimeExtensions", js.Array(value :_*))
    
    @scala.inline
    def setMimeExtensions(value: js.Array[IExtensionModule]): Self = this.set("mimeExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeExtensions: Self = this.set("mimeExtensions", js.undefined)
    
    @scala.inline
    def setPaths(value: PartialIPaths): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    
    @scala.inline
    def setRestored(value: js.Promise[_]): Self = this.set("restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestored: Self = this.set("restored", js.undefined)
    
    @scala.inline
    def setServiceManager(value: ServiceManager): Self = this.set("serviceManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceManager: Self = this.set("serviceManager", js.undefined)
  }
}
