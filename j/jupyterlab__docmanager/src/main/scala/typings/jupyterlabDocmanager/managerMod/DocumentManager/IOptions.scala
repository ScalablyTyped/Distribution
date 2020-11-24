package typings.jupyterlabDocmanager.managerMod.DocumentManager

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a document manager.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * A service manager instance.
    */
  var manager: IManager = js.native
  
  /**
    * A widget opener for sibling widgets.
    */
  var opener: IWidgetOpener = js.native
  
  /**
    * A document registry instance.
    */
  var registry: DocumentRegistry = js.native
  
  /**
    * The provider for session dialogs.
    */
  var sessionDialogs: js.UndefOr[IDialogs] = js.native
  
  /**
    * A function called when a kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
  
  /**
    * A promise for when to start using the manager.
    */
  var when: js.UndefOr[js.Promise[Unit]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(manager: IManager, opener: IWidgetOpener, registry: DocumentRegistry): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
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
    def setManager(value: IManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpener(value: IWidgetOpener): Self = this.set("opener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistry(value: DocumentRegistry): Self = this.set("registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDialogs(value: IDialogs): Self = this.set("sessionDialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDialogs: Self = this.set("sessionDialogs", js.undefined)
    
    @scala.inline
    def setSetBusy(value: () => IDisposable): Self = this.set("setBusy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetBusy: Self = this.set("setBusy", js.undefined)
    
    @scala.inline
    def setWhen(value: js.Promise[Unit]): Self = this.set("when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
}
