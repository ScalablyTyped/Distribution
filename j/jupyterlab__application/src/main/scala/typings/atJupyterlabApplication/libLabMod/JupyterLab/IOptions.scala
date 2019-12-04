package typings.atJupyterlabApplication.libLabMod.JupyterLab

import typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typings.atJupyterlabApplication.libShellMod.LabShell
import typings.atJupyterlabApputils.atJupyterlabApputilsMod.CommandLinker
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryMod.DocumentRegistry
import typings.atJupyterlabServices.atJupyterlabServicesMod.ServiceManager
import typings.atPhosphorWidgets.libMenuMod.Menu.IRenderer
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a JupyterLab object.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo ]:? @jupyterlab/application.@jupyterlab/application/lib/lab.JupyterLab.IInfo[P]} */ trait IOptions
  extends typings.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IOptions[LabShell, js.Any] {
  var paths: js.UndefOr[Partial[IPaths]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    shell: LabShell,
    commandLinker: CommandLinker = null,
    contextMenuRenderer: IRenderer = null,
    docRegistry: DocumentRegistry = null,
    paths: Partial[IPaths] = null,
    restored: js.Promise[js.Any] = null,
    serviceManager: ServiceManager = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    if (commandLinker != null) __obj.updateDynamic("commandLinker")(commandLinker.asInstanceOf[js.Any])
    if (contextMenuRenderer != null) __obj.updateDynamic("contextMenuRenderer")(contextMenuRenderer.asInstanceOf[js.Any])
    if (docRegistry != null) __obj.updateDynamic("docRegistry")(docRegistry.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (restored != null) __obj.updateDynamic("restored")(restored.asInstanceOf[js.Any])
    if (serviceManager != null) __obj.updateDynamic("serviceManager")(serviceManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

