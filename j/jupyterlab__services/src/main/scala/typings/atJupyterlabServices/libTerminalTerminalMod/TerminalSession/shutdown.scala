package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/terminal", "TerminalSession.shutdown")
@js.native
object shutdown extends js.Object {
  /**
    * Shut down a terminal session by name.
    *
    * @param name - The name of the target session.
    *
    * @param settings - The server settings to use.
    *
    * @returns A promise that resolves when the session is shut down.
    */
  def apply(name: String): js.Promise[Unit] = js.native
  def apply(name: String, settings: ISettings): js.Promise[Unit] = js.native
}

