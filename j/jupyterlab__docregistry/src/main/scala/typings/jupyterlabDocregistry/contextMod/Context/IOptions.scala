package typings.jupyterlabDocregistry.contextMod.Context

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabObservables.modeldbMod.ModelDB.IFactory
import typings.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a context.
  */
@js.native
trait IOptions[T /* <: IModel */] extends js.Object {
  
  /**
    * The model factory used to create the model.
    */
  var factory: IModelFactory[T] = js.native
  
  /**
    * The kernel preference associated with the context.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.native
  
  /**
    * A service manager instance.
    */
  var manager: IManager = js.native
  
  /**
    * An IModelDB factory method which may be used for the document.
    */
  var modelDBFactory: js.UndefOr[IFactory] = js.native
  
  /**
    * An optional callback for opening sibling widgets.
    */
  var opener: js.UndefOr[js.Function1[/* widget */ Widget, Unit]] = js.native
  
  /**
    * The initial path of the file.
    */
  var path: String = js.native
  
  /**
    * The dialogs used for the session context.
    */
  var sessionDialogs: js.UndefOr[IDialogs] = js.native
  
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: IModel */](factory: IModelFactory[T], manager: IManager, path: String): IOptions[T] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: IModel */] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setFactory(value: IModelFactory[T]): Self = this.set("factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManager(value: IManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelPreference(value: IKernelPreference): Self = this.set("kernelPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelPreference: Self = this.set("kernelPreference", js.undefined)
    
    @scala.inline
    def setModelDBFactory(value: IFactory): Self = this.set("modelDBFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDBFactory: Self = this.set("modelDBFactory", js.undefined)
    
    @scala.inline
    def setOpener(value: /* widget */ Widget => Unit): Self = this.set("opener", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpener: Self = this.set("opener", js.undefined)
    
    @scala.inline
    def setSessionDialogs(value: IDialogs): Self = this.set("sessionDialogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionDialogs: Self = this.set("sessionDialogs", js.undefined)
    
    @scala.inline
    def setSetBusy(value: () => IDisposable): Self = this.set("setBusy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetBusy: Self = this.set("setBusy", js.undefined)
  }
}
