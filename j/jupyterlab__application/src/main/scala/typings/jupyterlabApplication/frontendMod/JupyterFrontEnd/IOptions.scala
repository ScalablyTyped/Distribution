package typings.jupyterlabApplication.frontendMod.JupyterFrontEnd

import typings.jupyterlabApputils.mod.CommandLinker
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabServices.mod.ServiceManager
import typings.luminoWidgets.menuMod.Menu.IRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a JupyterFrontEnd.
  */
trait IOptions[T /* <: IShell */, U]
  extends typings.luminoApplication.mod.Application.IOptions[T] {
  /**
    * The command linker used by the application.
    */
  var commandLinker: js.UndefOr[CommandLinker] = js.undefined
  /**
    * The document registry instance used by the application.
    */
  var docRegistry: js.UndefOr[DocumentRegistry] = js.undefined
  /**
    * Promise that resolves when state is first restored, returning layout
    * description.
    */
  var restored: js.UndefOr[js.Promise[U]] = js.undefined
  /**
    * The service manager used by the application.
    */
  var serviceManager: js.UndefOr[ServiceManager] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[T, U](
    shell: T,
    commandLinker: CommandLinker = null,
    contextMenuRenderer: IRenderer = null,
    docRegistry: DocumentRegistry = null,
    restored: js.Promise[U] = null,
    serviceManager: ServiceManager = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    if (commandLinker != null) __obj.updateDynamic("commandLinker")(commandLinker.asInstanceOf[js.Any])
    if (contextMenuRenderer != null) __obj.updateDynamic("contextMenuRenderer")(contextMenuRenderer.asInstanceOf[js.Any])
    if (docRegistry != null) __obj.updateDynamic("docRegistry")(docRegistry.asInstanceOf[js.Any])
    if (restored != null) __obj.updateDynamic("restored")(restored.asInstanceOf[js.Any])
    if (serviceManager != null) __obj.updateDynamic("serviceManager")(serviceManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

