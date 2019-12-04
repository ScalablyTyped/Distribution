package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/terminal", "TerminalSession.listRunning")
@js.native
object listRunning extends js.Object {
  /**
    * List the running terminal sessions.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves with the list of running session models.
    */
  def apply(): js.Promise[js.Array[IModel]] = js.native
  def apply(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
}

