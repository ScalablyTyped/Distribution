package typings
package atJupyterlabDocregistryLib.libContextMod.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a context.
  */
trait IOptions[T /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */] extends js.Object {
  /**
    * The model factory used to create the model.
    */
  var factory: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModelFactory[T]
  /**
    * The kernel preference associated with the context.
    */
  var kernelPreference: js.UndefOr[atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference] = js.undefined
  /**
    * A service manager instance.
    */
  var manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager
  /**
    * An IModelDB factory method which may be used for the document.
    */
  var modelDBFactory: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.ModelDBNs.IFactory] = js.undefined
  /**
    * An optional callback for opening sibling widgets.
    */
  var opener: js.UndefOr[
    js.Function1[/* widget */ atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, scala.Unit]
  ] = js.undefined
  /**
    * The initial path of the file.
    */
  var path: java.lang.String
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T /* <: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel */](
    factory: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModelFactory[T],
    manager: atJupyterlabServicesLib.libManagerMod.ServiceManagerNs.IManager,
    path: java.lang.String,
    kernelPreference: atJupyterlabApputilsLib.libClientsessionMod.IClientSessionNs.IKernelPreference = null,
    modelDBFactory: atJupyterlabObservablesLib.libModeldbMod.ModelDBNs.IFactory = null,
    opener: /* widget */ atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget => scala.Unit = null,
    setBusy: () => atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(factory = factory, manager = manager, path = path)
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference)
    if (modelDBFactory != null) __obj.updateDynamic("modelDBFactory")(modelDBFactory)
    if (opener != null) __obj.updateDynamic("opener")(js.Any.fromFunction1(opener))
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    __obj.asInstanceOf[IOptions[T]]
  }
}

