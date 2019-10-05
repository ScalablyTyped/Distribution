package typings.atJupyterlabServices.libTerminalTerminalMod.TerminalSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/terminal", "TerminalSession.startNew")
@js.native
object startNew extends js.Object {
  /**
    * Start a new terminal session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    */
  def apply(): js.Promise[ISession] = js.native
  def apply(options: IOptions): js.Promise[ISession] = js.native
}

