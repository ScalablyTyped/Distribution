package typings.jupyterlabServices.workspaceMod

import typings.jupyterlabCoreutils.dataconnectorMod.DataConnector
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import typings.jupyterlabServices.workspaceMod.WorkspaceManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
@js.native
/**
  * Create a new workspace manager.
  */
class WorkspaceManager_ () extends DataConnector[IWorkspace, IWorkspace, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

