package typings.atJupyterlabServices.libWorkspaceMod

import typings.atJupyterlabCoreutils.libDataconnectorMod.DataConnector
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.atJupyterlabServices.libWorkspaceMod.Workspace.IWorkspace
import typings.atJupyterlabServices.libWorkspaceMod.WorkspaceManager.IOptions
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

