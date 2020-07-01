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
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
trait IOptions[T /* <: IModel */] extends js.Object {
  /**
    * The model factory used to create the model.
    */
  var factory: IModelFactory[T]
  /**
    * The kernel preference associated with the context.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * A service manager instance.
    */
  var manager: IManager
  /**
    * An IModelDB factory method which may be used for the document.
    */
  var modelDBFactory: js.UndefOr[IFactory] = js.undefined
  /**
    * An optional callback for opening sibling widgets.
    */
  var opener: js.UndefOr[js.Function1[/* widget */ Widget, Unit]] = js.undefined
  /**
    * The initial path of the file.
    */
  var path: String
  /**
    * The dialogs used for the session context.
    */
  var sessionDialogs: js.UndefOr[IDialogs] = js.undefined
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[/* <: typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel */ T](
    factory: IModelFactory[T],
    manager: IManager,
    path: String,
    kernelPreference: IKernelPreference = null,
    modelDBFactory: IFactory = null,
    opener: /* widget */ Widget => Unit = null,
    sessionDialogs: IDialogs = null,
    setBusy: () => IDisposable = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference.asInstanceOf[js.Any])
    if (modelDBFactory != null) __obj.updateDynamic("modelDBFactory")(modelDBFactory.asInstanceOf[js.Any])
    if (opener != null) __obj.updateDynamic("opener")(js.Any.fromFunction1(opener))
    if (sessionDialogs != null) __obj.updateDynamic("sessionDialogs")(sessionDialogs.asInstanceOf[js.Any])
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    __obj.asInstanceOf[IOptions[T]]
  }
}

