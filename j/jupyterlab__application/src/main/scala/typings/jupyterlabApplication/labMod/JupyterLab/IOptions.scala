package typings.jupyterlabApplication.labMod.JupyterLab

import typings.jupyterlabApplication.AnonMatches
import typings.jupyterlabApplication.PartialIPaths
import typings.jupyterlabApplication.shellMod.LabShell
import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IExtensionModule
import typings.jupyterlabServices.mod.ServiceManager
import typings.luminoWidgets.menuMod.Menu.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a JupyterLab object.
  */
/* Inlined parent @jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IOptions<@jupyterlab/application.@jupyterlab/application/lib/shell.LabShell, any> */
/* Inlined parent std.Partial<@jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo> */
trait IOptions extends js.Object {
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.undefined
  /**
    * A custom renderer for the context menu.
    */
  var contextMenuRenderer: js.UndefOr[IRenderer] = js.undefined
  var deferred: js.UndefOr[AnonMatches] = js.undefined
  var devMode: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[AnonMatches] = js.undefined
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.undefined
  var filesCached: js.UndefOr[Boolean] = js.undefined
  var mimeExtensions: js.UndefOr[js.Array[IExtensionModule]] = js.undefined
  var paths: js.UndefOr[PartialIPaths] = js.undefined
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[_]] = js.undefined
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.undefined
  /**
    * The shell widget to use for the application.
    *
    * This should be a newly created and initialized widget.
    *
    * The application will attach the widget to the DOM.
    */
  var shell: LabShell
}

object IOptions {
  @scala.inline
  def apply(
    shell: LabShell,
    commandLinker: CommandLinker = null,
    contextMenuRenderer: IRenderer = null,
    deferred: AnonMatches = null,
    devMode: js.UndefOr[Boolean] = js.undefined,
    disabled: AnonMatches = null,
    docRegistry: DocumentRegistry = null,
    filesCached: js.UndefOr[Boolean] = js.undefined,
    mimeExtensions: js.Array[IExtensionModule] = null,
    paths: PartialIPaths = null,
    restored: js.Promise[_] = null,
    serviceManager: ServiceManager = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    if (commandLinker != null) __obj.updateDynamic("commandLinker")(commandLinker.asInstanceOf[js.Any])
    if (contextMenuRenderer != null) __obj.updateDynamic("contextMenuRenderer")(contextMenuRenderer.asInstanceOf[js.Any])
    if (deferred != null) __obj.updateDynamic("deferred")(deferred.asInstanceOf[js.Any])
    if (!js.isUndefined(devMode)) __obj.updateDynamic("devMode")(devMode.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (docRegistry != null) __obj.updateDynamic("docRegistry")(docRegistry.asInstanceOf[js.Any])
    if (!js.isUndefined(filesCached)) __obj.updateDynamic("filesCached")(filesCached.asInstanceOf[js.Any])
    if (mimeExtensions != null) __obj.updateDynamic("mimeExtensions")(mimeExtensions.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (restored != null) __obj.updateDynamic("restored")(restored.asInstanceOf[js.Any])
    if (serviceManager != null) __obj.updateDynamic("serviceManager")(serviceManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

