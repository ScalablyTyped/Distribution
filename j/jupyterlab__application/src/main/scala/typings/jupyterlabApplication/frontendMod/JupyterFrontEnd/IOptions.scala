package typings.jupyterlabApplication.frontendMod.JupyterFrontEnd

import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.mod.ServiceManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a JupyterFrontEnd.
  */
@js.native
trait IOptions[T /* <: IShell */, U]
  extends typings.luminoApplication.mod.Application.IOptions[T] {
  
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.native
  
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.native
  
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[U]] = js.native
  
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: IShell */, U](shell: T): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_, _], T /* <: IShell */, U] (val x: Self with (IOptions[T, U])) extends AnyVal {
    
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
    def setCommandLinker(value: CommandLinker): Self = this.set("commandLinker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandLinker: Self = this.set("commandLinker", js.undefined)
    
    @scala.inline
    def setDocRegistry(value: DocumentRegistry): Self = this.set("docRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocRegistry: Self = this.set("docRegistry", js.undefined)
    
    @scala.inline
    def setRestored(value: js.Promise[U]): Self = this.set("restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestored: Self = this.set("restored", js.undefined)
    
    @scala.inline
    def setServiceManager(value: ServiceManager): Self = this.set("serviceManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceManager: Self = this.set("serviceManager", js.undefined)
  }
}
