package typings
package atJupyterlabServicesLib.libWorkspaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/workspace", "WorkspaceManager")
@js.native
/**
  * Create a new workspace manager.
  */
class WorkspaceManager () extends js.Object {
  def this(options: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceManagerNs.IOptions) = this()
  /**
    * The server settings used to make API requests.
    */
  val serverSettings: atJupyterlabServicesLib.libServerconnectionMod.ServerConnectionNs.ISettings = js.native
  /**
    * Fetch a workspace.
    *
    * @param id - The workspaces's ID.
    *
    * @returns A promise that resolves if successful.
    */
  def fetch(id: java.lang.String): js.Promise[atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs.IWorkspace] = js.native
  /**
    * Fetch the list of workspace IDs that exist on the server.
    *
    * @returns A promise that resolves if successful.
    */
  def list(): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Remove a workspace from the server.
    *
    * @param id - The workspaces's ID.
    *
    * @returns A promise that resolves if successful.
    */
  def remove(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Save a workspace.
    *
    * @param id - The workspace's ID.
    *
    * @param workspace - The workspace being saved.
    *
    * @returns A promise that resolves if successful.
    */
  def save(id: java.lang.String, workspace: atJupyterlabServicesLib.libWorkspaceMod.WorkspaceNs.IWorkspace): js.Promise[scala.Unit] = js.native
}

