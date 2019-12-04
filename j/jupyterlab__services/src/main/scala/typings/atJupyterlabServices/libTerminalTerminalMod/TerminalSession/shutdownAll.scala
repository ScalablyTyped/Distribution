package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import typings.atJupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/terminal", "TerminalSession.shutdownAll")
@js.native
object shutdownAll extends js.Object {
  /**
    * Shut down all terminal sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(settings: ISettings): js.Promise[Unit] = js.native
}

