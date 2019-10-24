package typings.atJupyterlabConsole.libPanelMod.ConsolePanel

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession.IKernelPreference
import typings.atJupyterlabConsole.libWidgetMod.CodeConsole.IModelFactory
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabServices.libManagerMod.ServiceManager.IManager
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initialization options for a console panel.
  */
trait IOptions extends js.Object {
  /**
    * The base path for a new console.
    */
  var basePath: js.UndefOr[String] = js.undefined
  /**
    * The content factory for the panel.
    */
  var contentFactory: IContentFactory
  /**
    * A kernel preference.
    */
  var kernelPreference: js.UndefOr[IKernelPreference] = js.undefined
  /**
    * The service manager used by the panel.
    */
  var manager: IManager
  /**
    * The service used to look up mime types.
    */
  var mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any
  /**
    * The model factory for the console widget.
    */
  var modelFactory: js.UndefOr[IModelFactory] = js.undefined
  /**
    * The name of the console.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path of an existing console.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The rendermime instance used by the panel.
    */
  var rendermime: IRenderMimeRegistry
  /**
    * A function to call when the kernel is busy.
    */
  var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    contentFactory: IContentFactory,
    manager: IManager,
    mimeTypeService: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify IEditorMimeTypeService */ js.Any,
    rendermime: IRenderMimeRegistry,
    basePath: String = null,
    kernelPreference: IKernelPreference = null,
    modelFactory: IModelFactory = null,
    name: String = null,
    path: String = null,
    setBusy: () => IDisposable = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(contentFactory = contentFactory, manager = manager, mimeTypeService = mimeTypeService, rendermime = rendermime)
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (kernelPreference != null) __obj.updateDynamic("kernelPreference")(kernelPreference)
    if (modelFactory != null) __obj.updateDynamic("modelFactory")(modelFactory)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (setBusy != null) __obj.updateDynamic("setBusy")(js.Any.fromFunction0(setBusy))
    __obj.asInstanceOf[IOptions]
  }
}

