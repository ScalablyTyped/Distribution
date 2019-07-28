package typings.atJupyterlabServices.libWorkspaceMod

import typings.atJupyterlabCoreutils.atJupyterlabCoreutilsMod.DataConnector
import typings.atJupyterlabServices.libServerconnectionMod.ServerConnectionNs.ISettings
import typings.atJupyterlabServices.libWorkspaceMod.WorkspaceManagerNs.IOptions
import typings.atJupyterlabServices.libWorkspaceMod.WorkspaceNs.IWorkspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
@js.native
/**
  * Create a new workspace manager.
  */
class WorkspaceManager () extends DataConnector[IWorkspace, IWorkspace, String] {
  def this(options: IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: ISettings = js.native
}

